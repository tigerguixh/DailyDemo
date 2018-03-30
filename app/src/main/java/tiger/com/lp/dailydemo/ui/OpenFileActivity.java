package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author gxh
 * @email xunhu.gui@ds365.com
 * @date 2018/3/23 0023
 * @description
 */

public class OpenFileActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        System.out.print(readAssetsTxt(this));
    }

    public static String readAssetsTxt(Context context){
        try {
            //Return an AssetManager instance for your application's package
            InputStream is = context.getAssets().open("server.txt");
            int size = is.available();
            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            // Convert the buffer into a string.
            String text = new String(buffer, "utf-8");
            // Finally stick the string into the text view.
            return text;
        } catch (IOException e) {
            // Should never happen!
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        return "读取错误，请检查文件名";
    }
}
