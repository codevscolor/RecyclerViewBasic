package com.codevscolor.recyclerviewbasic.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.codevscolor.recyclerviewbasic.R;
import com.codevscolor.recyclerviewbasic.adapter.RecyclerViewAdapter;
import com.codevscolor.recyclerviewbasic.model.ListModelObject;
import com.codevscolor.recyclerviewbasic.util.DividerItemDecoration;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //create one adapter with a list of 50 elements
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getDummyList());
        mRecyclerView.setAdapter(mAdapter);

        //create one item decoration object and add it to the recycler view
        RecyclerView.ItemDecoration dividerItemDecoration =
                new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);


        mRecyclerView.addItemDecoration(dividerItemDecoration);
    }


    private ArrayList<ListModelObject> getDummyList() {
        ArrayList objectList = new ArrayList<ListModelObject>();
        for (int i = 0; i < 50; i++) {
            objectList.add(i, new ListModelObject("Recycler View Item -", i));
        }
        return objectList;
    }
}
