package com.course.shoppingmall;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class DetailCars{
    String detail_title;
    int detail_img;
    int detail_img02;
    int detail_img03;
    int detail_img04;
    String detail_make;
    String detail_km;
    String detail_fuel;
    String detail_output;
    String detail_price;
    String detail_site;

    public DetailCars(String detail_title, int detail_img, int detail_img02, int detail_img03, int detail_img04, String detail_make,
                      String detail_km, String detail_fuel, String detail_output, String detail_price, String detail_site){
        this.detail_title = detail_title;
        this.detail_img = detail_img;
        this.detail_img02 = detail_img02;
        this.detail_img03 = detail_img03;
        this.detail_img04 = detail_img04;
        this.detail_make = detail_make;
        this.detail_km = detail_km;
        this.detail_fuel = detail_fuel;
        this.detail_output = detail_output;
        this.detail_price = detail_price;
        this.detail_site = detail_site;
    }
    public String getDetail_title(){
        return detail_title;
    }
    public int getDetail_img(){
        return detail_img;
    }
    public int getDetail_img02(){
        return detail_img02;
    }
    public int getDetail_img03(){
        return detail_img03;
    }
    public int getDetail_img04(){
        return detail_img04;
    }
    public String getDetail_make(){
        return detail_make;
    }
    public String getDetail_km(){
        return detail_km;
    }
    public String getDetail_fuel(){
        return detail_fuel;
    }
    public String getDetail_output(){
        return detail_output;
    }
    public String getDetail_price(){
        return detail_price;
    }
    public String getDetail_site(){
        return detail_site;
    }
}
