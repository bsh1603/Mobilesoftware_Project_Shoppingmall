package com.course.shoppingmall;

public class Cars {
    int image_id;
    String car_name;
    String car_price;

    public Cars(int id, String name, String price){
        this.image_id = id;
        this.car_name = name;
        this.car_price = price;
    }
    public int getImageID(){
        return image_id;
    }
    public String getCarName(){
        return car_name;
    }
    public String getCarPrice(){
        return car_price;
    }


}













