package com.example.bhukaad_ulimatefood.Models;

 public class OrderModel {

    int OrderImage;
    String OrderName,OrderPrice,OrderNumber;

//    public OrderModel(){}

     public OrderModel(int orderImage, String orderName, String orderPrice, String orderNumber) {

         this.OrderImage = orderImage;
         this.OrderName = orderName;
         this.OrderPrice = orderPrice;
         this.OrderNumber = orderNumber;

    }



     public int getOrderImage() {
        return OrderImage;
    }

    public void setOrderImage(int orderImage) {
        this.OrderImage = orderImage;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String orderName) {
        this.OrderName = orderName;
    }

    public String getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.OrderPrice = orderPrice;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.OrderNumber = orderNumber;
    }

}
