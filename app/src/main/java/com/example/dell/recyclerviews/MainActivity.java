package com.example.dell.recyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MyAdapter(this,push()));
    }

    public List<Datas> push() {
        List<Datas> data = new ArrayList<>();
        int[] icon = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};
        String[] title = {"Galaxy Grand", "Note 7", "S6 Edge", "Galaxy S4", "Galaxy J3 Prime ", "Galaxy Z4"};
        for (int i = 0; i <title.length && i<icon.length; i++) {
            Datas datas = new Datas();
            datas.textid = title[i];
            datas.imageid = icon[i];
            data.add(datas);
        }
        return data;
    }
}
