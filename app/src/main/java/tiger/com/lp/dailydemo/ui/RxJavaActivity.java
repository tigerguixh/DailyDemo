package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import tiger.com.lp.dailydemo.arouter.RouterPathList;
import tiger.com.lp.dailydemo.utils.LogUtils;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/8/1
 * @Description :
 */
@Route(path = RouterPathList.ROUTER_RXJAVA)
public class RxJavaActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rxjava();
    }

    Observer observer = new Observer<Integer>() {

        Disposable disposable;

        @Override
        public void onSubscribe(Disposable d) {
            LogUtils.w(LogUtils.TAG, "开始采用subscribe连接");
            disposable = d;
        }

        @Override
        public void onNext(Integer value) {
            LogUtils.w(LogUtils.TAG, "对Next事件"+ value +"作出响应"  );
            if(value == 2) {
                disposable.dispose();
            }
        }

        @Override
        public void onError(Throwable e) {
            LogUtils.w(LogUtils.TAG, "对Error事件作出响应");
        }

        @Override
        public void onComplete() {
            LogUtils.w(LogUtils.TAG, "对Complete事件作出响应");
        }
    };

    private void rxjava() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) {
                emitter.onNext(1);
                emitter.onNext(2);
                emitter.onNext(3);
                emitter.onComplete();
            }
        })
                .subscribe(observer);

        just();
    }

    private void just() {
        Observable.just(4, 5)
                .subscribe(observer);

        formArray();
    }

    private void formArray() {
        Integer[] items = {6, 7, 8};
        Observable.fromArray(items)
                .subscribe(observer);

        formIterator();
    }

    private void formIterator() {
        List<Integer> lists = new ArrayList<>();
        lists.add(9);
        lists.add(10);
        lists.add(11);
        Observable.fromIterable(lists)
                .subscribe(observer);

        empty();
    }

    private void empty() {
        Observable.empty()
                .subscribe(observer);

        defer();
    }

    // 延迟操作 defer() 有点像 handler postDelay

    private void defer() {
        final Integer i = 12;
        Observable<Integer> observable = Observable.defer(new Callable<ObservableSource<? extends Integer>>() {
            @Override
            public ObservableSource<? extends Integer> call() throws Exception {
                return Observable.just(i);
            }
        });

        // i = 13; 实际上i应该是第二次修改得值
        observable.subscribe(observer);

        timer();
    }

    // timer 延迟指定时间
    private void timer() {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(observer);

        interval();
    }

    // interval 定时执行
    private void interval() {
        Observable.interval(3, 30, TimeUnit.SECONDS)
                .subscribe(observer);

        intervalRange();
    }

    // intervalRange 指定发送的数据的的数量
    private void intervalRange() {
        Observable.intervalRange(14, 16, 2, 1, TimeUnit.SECONDS)
                .subscribe(observer);

        range();
    }

    // Range 区间发送事件
    private void range() {
        Observable.range(17, 20)
                .subscribe(observer);
    }
}
