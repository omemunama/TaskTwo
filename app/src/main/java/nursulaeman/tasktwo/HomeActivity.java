package nursulaeman.tasktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeActivity extends BaseActivity {

    String[] data1 = new  String[] {"Home1","Home2","Home3","Home4","Home5","Home6","Home7","Home8","Home9","Home10",
            "Home11","Home12","Home13","Home14","Home15","Home16","Home17","Home18","Home19","Home20",
            "Home21","Home22","Home23","Home24","Home25","Home26","Home27","Home28","Home29","Home30"};

    RecyclerView rv_data1;
    RecyclerView.Adapter rv_adapter;
    RecyclerView.LayoutManager rv_layout_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Code Recycleview

        rv_data1 = (RecyclerView) findViewById(R.id.rv_data1);
        rv_data1.setHasFixedSize(true);

        rv_layout_manager = new LinearLayoutManager(this);
        rv_data1.setLayoutManager(rv_layout_manager);

        rv_adapter = new MyAdapter(data1);
        rv_data1.setAdapter(rv_adapter);

        // End Recycleview
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private String[] ds_data1;

        public class ViewHolder extends RecyclerView.ViewHolder {
            public CardView cv_data1;
            public TextView tv_data1;

            public ViewHolder(View v) {
                super(v);
                cv_data1 = (CardView) v.findViewById(R.id.cv_data1);
                tv_data1 = (TextView) v.findViewById(R.id.tv_data1);
            }
        }

        public MyAdapter(String[] dataset) {
            ds_data1 = dataset;
        }

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_data, parent, false);
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.tv_data1.setText(ds_data1[position]);
        }

        @Override
        public int getItemCount() {
            return ds_data1.length;
        }
    }

}
