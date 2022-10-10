package com.firstproject.nissi.firstapp7.myapp7.first7.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.animation.content.Content;

import java.util.ArrayList;


public class Recycler_itemAdabter extends RecyclerView.Adapter<Recycler_itemAdabter.ViewHolder> {
Context context;
ArrayList<Fooditem> fooditems;
    Recycler_itemAdabter(Context context ,ArrayList<Fooditem> fooditems ){
        this.context=context;
        this.fooditems=fooditems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view =LayoutInflater.from(context).inflate(R.layout.food_listitem,parent,false);
         ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
   holder.item_img.setImageResource(fooditems.get(position).img);
   holder.item_name.setText(fooditems.get(position).item_name);
    }

    @Override
    public int getItemCount() {
        return fooditems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView item_name;
        ImageView item_img;
        public ViewHolder(View itemView ){
           super(itemView);

            item_img=itemView.findViewById(R.id.item_img);
            item_name=itemView.findViewById(R.id.item_name);

        }
    }
}
