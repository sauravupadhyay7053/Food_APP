package com.example.bhukaad_ulimatefood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.bhukaad_ulimatefood.Adapters.OrderAdapter;
import com.example.bhukaad_ulimatefood.Models.MainModel;
import com.example.bhukaad_ulimatefood.Models.OrderModel;
import com.example.bhukaad_ulimatefood.databinding.ActivityMainBinding;
import com.example.bhukaad_ulimatefood.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ActivityOrderBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        DBhelper helper=new DBhelper(this);
        ArrayList<OrderModel>list=new ArrayList<>();

//        ArrayList<OrderModel> list=helper.getOrder();
        list.add(new OrderModel(R.drawable.applecake,"Apple Cake","299","12345"));
        list.add(new OrderModel(R.drawable.bananacake,"Banana Cake","299","12345"));
        list.add(new OrderModel(R.drawable.battenbergcake,"Battenberg Cake","399","12345"));
        list.add(new OrderModel(R.drawable.blackforestcake,"Black Forest cake","399","12345"));
        list.add(new OrderModel(R.drawable.browniecake,"Brownie Cake","399","12345"));

        list.add(new OrderModel(R.drawable.bundtcake,"Bundt Cake","399","12345"));

        list.add(new OrderModel(R.drawable.carrotcake,"Carrot Cake","199","12345"));

        list.add(new OrderModel(R.drawable.charlottecake,"Charlotte Cake","299","12345"));
        list.add(new OrderModel(R.drawable.cheesecake,"Cheese Cake","299","12345"));
        list.add(new OrderModel(R.drawable.chocolatecake,"Chocolate Cake","349","12345"));

        OrderAdapter adapter=new OrderAdapter(list,this);
        binding.orderrecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderrecyclerView.setLayoutManager(layoutManager);

    }




}