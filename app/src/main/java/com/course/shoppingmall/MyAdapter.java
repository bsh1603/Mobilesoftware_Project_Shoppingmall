package com.course.shoppingmall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    public  class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView main_carImage;
        TextView main_carName;
        TextView main_carPrice;

        public MyViewHolder(View view){
            super(view);
            main_carImage = view.findViewById(R.id.main_carImage);
            main_carName = view.findViewById(R.id.main_carName);
            main_carPrice = view.findViewById(R.id.main_carPrice);

            main_carImage.setClickable(true);
            main_carName.setClickable(true);
        }
    }
    private ArrayList<Cars> myCarList;
    private ArrayList<DetailCars> myDetailCarList;
    public Context mcontext;
    public MyAdapter(ArrayList<Cars> cars, ArrayList<DetailCars> myDetailCarList,Context context){
        this.myCarList = cars;
        this.mcontext = context;
        this.myDetailCarList = myDetailCarList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.main_carImage.setImageResource(myCarList.get(position).getImageID());
        myViewHolder.main_carName.setText(myCarList.get(position).getCarName());
        myViewHolder.main_carPrice.setText(myCarList.get(position).getCarPrice());

        myViewHolder.main_carImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, Avante.class);
                intent.putExtra("detail_title",myDetailCarList.get(position).getDetail_title());
                intent.putExtra("detail_image",myDetailCarList.get(position).getDetail_img());
                intent.putExtra("detail_image02", myDetailCarList.get(position).getDetail_img02());
                intent.putExtra("detail_image03", myDetailCarList.get(position).getDetail_img03());
                intent.putExtra("detail_image04", myDetailCarList.get(position).getDetail_img04());
                intent.putExtra("detail_make", myDetailCarList.get(position).getDetail_make());
                intent.putExtra("detail_km", myDetailCarList.get(position).getDetail_km());
                intent.putExtra("detail_fuel", myDetailCarList.get(position).getDetail_fuel());
                intent.putExtra("detail_output", myDetailCarList.get(position).getDetail_output());
                intent.putExtra("detail_price", myDetailCarList.get(position).getDetail_price());
                intent.putExtra("detail_Site", myDetailCarList.get(position).getDetail_site());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);
            }
        });
        myViewHolder.main_carName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, Avante.class);
                intent.putExtra("detail_title",myDetailCarList.get(position).getDetail_title());
                intent.putExtra("detail_image",myDetailCarList.get(position).getDetail_img());
                intent.putExtra("detail_image02", myDetailCarList.get(position).getDetail_img02());
                intent.putExtra("detail_image03", myDetailCarList.get(position).getDetail_img03());
                intent.putExtra("detail_image04", myDetailCarList.get(position).getDetail_img04());
                intent.putExtra("detail_make", myDetailCarList.get(position).getDetail_make());
                intent.putExtra("detail_km", myDetailCarList.get(position).getDetail_km());
                intent.putExtra("detail_fuel", myDetailCarList.get(position).getDetail_fuel());
                intent.putExtra("detail_output", myDetailCarList.get(position).getDetail_output());
                intent.putExtra("detail_price", myDetailCarList.get(position).getDetail_price());
                intent.putExtra("detail_Site", myDetailCarList.get(position).getDetail_site());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myCarList.size();
    }
}