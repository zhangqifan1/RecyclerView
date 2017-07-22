package comt.example.administrator.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private String[] str={"a1","a2","a3","a4","a5","a7","a8","a9","a10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        //创建默认的线性LayoutManager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
//        mRecyclerView.setHasFixedSize(true);
        //创建并设置Adapter
        MyAdapter myAdapter = new MyAdapter(str);
        mRecyclerView.setAdapter(myAdapter);

    }
}
