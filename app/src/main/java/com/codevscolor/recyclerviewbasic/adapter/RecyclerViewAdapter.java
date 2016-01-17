package com.codevscolor.recyclerviewbasic.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.codevscolor.recyclerviewbasic.R;
import com.codevscolor.recyclerviewbasic.model.ListModelObject;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView
        .Adapter<RecyclerViewAdapter
        .ModelObjectHolder> {

    private ArrayList<ListModelObject> mObjectList;


    public RecyclerViewAdapter(ArrayList<ListModelObject> objectList) {
        mObjectList = objectList;
    }

    @Override
    public ModelObjectHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);

        ModelObjectHolder dataObjectHolder = new ModelObjectHolder(view);
        return dataObjectHolder;
    }

    @Override
    public void onBindViewHolder(ModelObjectHolder holder, int position) {
        holder.label.setText(mObjectList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mObjectList.size();
    }


    //view-holder class
    public class ModelObjectHolder extends RecyclerView.ViewHolder {
        TextView label;

        public ModelObjectHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.textView);
        }

    }
}