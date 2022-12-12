package com.example.recyclerview1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class planetAdapter extends RecyclerView.Adapter<planetAdapter.MyViewHolder> {

    //creating a constructor that we can pass in the list of items and the context
    Context mContext;
    ArrayList<model> mModelList;
    planetAdapter(Context context , ArrayList<model> modelList)
    {
        this.mContext = context;
        this.mModelList = modelList;
    }

    @NonNull
    @Override
    public planetAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //giving a look to each of our rows
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.row , parent , false);
        return new planetAdapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull planetAdapter.MyViewHolder holder, int position) {
        //assigning values to each of our rows
        holder.name.setText(mModelList.get(position).getpName());
        holder.description.setText(mModelList.get(position).getDescription());
        holder.image.setImageResource(mModelList.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        //return the number of items we want to display
        return mModelList.size();
    }

    //what is the function of the view holder in this project
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
    //holds the views
        ImageView image;
        TextView name;
        TextView description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image =  itemView.findViewById(R.id.image);
            name  = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);

        }
    }
}
