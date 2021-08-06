package tiger.com.lp.dailydemo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.ColumnInfo;

import tiger.com.lp.dailydemo.R;

import static tiger.com.lp.dailydemo.R.*;

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/21
 * @Description :
 */
public class ScrollingActivity extends Activity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_scrolling);


        findViewById(R.id.edit_search).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.scrolling_header);
                view.setVisibility(View.VISIBLE);
                view.setTranslationY(0);
                recyclerView.smoothScrollToPosition(0);
            }
        });
        recyclerView = (RecyclerView) findViewById(id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(getLayoutInflater().inflate(layout.item_simple, parent, false));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ViewHolder vh = (ViewHolder) holder;
                vh.text.setText("Fake Item " + (position + 1));
                vh.text2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            }

            @Override
            public int getItemCount() {
                return 20;
            }

            class ViewHolder extends RecyclerView.ViewHolder {

                TextView text;
                TextView text2;

                public ViewHolder(View itemView) {
                    super(itemView);

                    text = (TextView) itemView.findViewById(id.text);
                    text2 = (TextView) itemView.findViewById(id.text2);
                }

            }
        });
    }
}
