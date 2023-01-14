package com.example.bhukaad_ulimatefood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.bhukaad_ulimatefood.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final int image=getIntent().getIntExtra("image",0);
        final String name=getIntent().getStringExtra("name");
        final int price=Integer.parseInt(getIntent().getStringExtra("price"));
        final String description=getIntent().getStringExtra("description");

        binding.DetailImage.setImageResource(image);
        binding.DetailFoodname.setText(name);
        binding.DetailPrice.setText(String.format("%d",price));
        binding.Detaildescription.setText(description);

        DBhelper helper=new DBhelper(this);
        binding.Insertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isinserted=helper.insertOrder(
                        binding.nameBox.getText().toString(),
                        binding.phoneBox.getText().toString(),
                        price,
                        image,
                        name,
                        description,
                        Integer.parseInt(binding.quantity.getText().toString())
                );
                if(isinserted){
                    Toast.makeText(DetailActivity.this, "Data Sucessful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(DetailActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }



            }
        });


    }
}