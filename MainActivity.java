package com.example.bhukaad_ulimatefood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.bhukaad_ulimatefood.Adapters.MainAdapter;
import com.example.bhukaad_ulimatefood.Models.MainModel;
import com.example.bhukaad_ulimatefood.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel>list=new ArrayList<>();
        list.add(new MainModel(R.drawable.applecake,"Apple Cake","299","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.bananacake,"Banana Cake","299","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.battenbergcake,"Battenberg Cake","399","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.blackforestcake,"Black Forest cake","399","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.browniecake,"Brownie Cake","399","Yummy and delicious sugar free cake"));

        list.add(new MainModel(R.drawable.bundtcake,"Bundt Cake","399","Yummy and delicious sugar free cake"));

        list.add(new MainModel(R.drawable.carrotcake,"Carrot Cake","199","Yummy and delicious sugar free cake"));

        list.add(new MainModel(R.drawable.charlottecake,"Charlotte Cake","299","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.cheesecake,"Cheese Cake","299","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.chocolatecake,"Chocolate Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.chocolavacake,"Chocolava Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.coconutcake,"Coconut Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.coffeecake,"Coffe Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.cupcake,"Cup Cake","149","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.fondantcake,"fondant Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.fruitcake,"Fruit Cake","249","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.genoacake,"Genoa Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.geodecake,"Geode Cake","349","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.heartshapedcake,"Heart Shaped Cake","449","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.kingcake,"King Cake","549","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.redvelvetcake,"Red velvet Cake","649","Yummy and delicious sugar free cake"));
        list.add(new MainModel(R.drawable.rainbowcake,"Rainbow Cake","449","Yummy and delicious sugar free cake"));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch(item.getItemId()){
//            case R.id.orders:
//                startActivity(new Intent(MainActivity.this,OrderActivity.class));
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}