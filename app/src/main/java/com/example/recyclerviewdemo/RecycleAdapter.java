package com.example.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hardik on 21-May-16.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    ArrayList<String> contries;

    RecycleAdapter(ArrayList<String> contries) {

        this.contries = contries;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleAdapter.ViewHolder holder, int position) {

        holder.tv_country.setText(contries.get(position));

    }

    @Override
    public int getItemCount() {
        return contries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_country;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_country = (TextView) itemView.findViewById(R.id.tv_country);

        }
    }


}
