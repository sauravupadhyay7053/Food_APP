package com.example.bhukaad_ulimatefood;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.bhukaad_ulimatefood.Models.OrderModel;

import java.util.ArrayList;


public class DBhelper extends SQLiteOpenHelper {

    final static String DBNAME = "mydatabase.db";
    final static int DBVERSION = 2;

    public DBhelper(@Nullable Context context) {
        super(context, DBNAME, null, DBVERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "create table orders" +
                        "(id integer primary key autoincrement," +
                        "name text," +
                        "phone text," +
                        "price int," +
                        "image int," +
                        "quantity int,"+
                        "description text," +
                        "foodname text)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists orders");
        onCreate(sqLiteDatabase);

    }

    public boolean insertOrder(String name, String phone, int price, int image, String description, String foodname,int quantity) {
        SQLiteDatabase database=getReadableDatabase();
        ContentValues values=new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("image",image);
        values.put("description",description);
        values.put("foodname",foodname);
        values.put("quantity",quantity);

         long id= database.insert("orders",null,values);
         if(id>=0){
             return true;
         }else{
             return false;
         }



    }
//    public ArrayList<OrderModel> getOrder(){
//        ArrayList<OrderModel>order=new ArrayList<>();
//        SQLiteDatabase database=this.getWritableDatabase();
//        Cursor cursor=database.rawQuery("select id,foodname,image,price from orders",null);
//
//        if(cursor.moveToFirst()){
//            while(cursor.moveToLast()){
//                OrderModel model = new OrderModel(0,null,null,null);
//                model.setOrderNumber(cursor.getInt(0)+"");
//                model.setOrderName(cursor.getString(1));
//                model.setOrderImage(cursor.getInt(2));
//                model.setOrderPrice(cursor.getInt(3)+"");
//                order.add(model);
//
//            }
//        }
//        cursor.close();
//        database.close();
//        return order;
//    }
}