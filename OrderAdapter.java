package com.example.bhukaad_ulimatefood.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bhukaad_ulimatefood.Models.OrderModel;
import com.example.bhukaad_ulimatefood.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.viewholder>{
    ArrayList<OrderModel> list;
    Context context;

    public OrderAdapter(ArrayList<OrderModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final OrderModel model=list.get(position);
        holder.OrderImage.setImageResource(model.getOrderImage());
        holder.OrderName.setText(model.getOrderName());
        holder.OrderPrice.setText(model.getOrderPrice());
        holder.OrderNumber.setText(model.getOrderNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        ImageView OrderImage;
        TextView OrderName,OrderPrice,OrderNumber;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            OrderImage=itemView.findViewById(R.id.OrderImage);
            OrderName=itemView.findViewById(R.id.OrderName);
            OrderPrice=itemView.findViewById(R.id.OrderPrice);
            OrderNumber=itemView.findViewById(R.id.OrderNumber);

        }
    }
}
