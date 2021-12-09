package com.course.shoppingmall;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;

public class Avante extends Activity {
    private Intent intent;
    private int number;
    private String title_main;
    TextView title, detail_title, detail_make, detail_km, detail_fuel, detail_output, detail_price;
    TextView detail_Site;
    ImageView avante01, avante02, avante03, avante04, sub_logo;
    Button btnPay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avante);

//        title = (TextView) findViewById(R.id.title);
        detail_title = (TextView)findViewById(R.id.detail_title);
        detail_make = (TextView)findViewById(R.id.detail_make);
        detail_km = (TextView)findViewById(R.id.detail_km);
        detail_fuel = (TextView)findViewById(R.id.detail_fuel);
        detail_output = (TextView)findViewById(R.id.detail_output);
        detail_price = (TextView)findViewById(R.id.detail_price);
        detail_Site = (TextView) findViewById(R.id.detail_Site);
        avante01 = (ImageView) findViewById(R.id.detail_image);
        avante02 = (ImageView) findViewById(R.id.detail_image02);
        avante03 = (ImageView) findViewById(R.id.detail_image03);
        avante04 = (ImageView) findViewById(R.id.detail_image04);
        btnPay = (Button)findViewById(R.id.btnPay);
        sub_logo = (ImageView)findViewById(R.id.sub_logo);

        detail_title.setText(getIntent().getStringExtra("detail_title"));
        avante01.setImageResource(getIntent().getIntExtra("detail_image",0));
        avante02.setImageResource(getIntent().getIntExtra("detail_image02",0));
        avante03.setImageResource(getIntent().getIntExtra("detail_image03",0));
        avante04.setImageResource(getIntent().getIntExtra("detail_image04",0));
        detail_make.setText(getIntent().getStringExtra("detail_make"));
        detail_km.setText(getIntent().getStringExtra("detail_km"));
        detail_output.setText(getIntent().getStringExtra("detail_output"));
        detail_price.setText(getIntent().getStringExtra("detail_price"));
        detail_Site.setText(getIntent().getStringExtra("detail_Site"));

        avante01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(Avante.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Avante.this);
                ImageView zoomImage = (ImageView) dialogView.findViewById(R.id.zoomImage);
                zoomImage.setImageResource(getIntent().getIntExtra("detail_image",0));
                dlg.setTitle("확대");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });
        avante02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(Avante.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Avante.this);
                ImageView zoomImage = (ImageView) dialogView.findViewById(R.id.zoomImage);
                zoomImage.setImageResource(getIntent().getIntExtra("detail_image02",0));
                dlg.setTitle("확대");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });
        avante03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(Avante.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Avante.this);
                ImageView zoomImage = (ImageView) dialogView.findViewById(R.id.zoomImage);
                zoomImage.setImageResource(getIntent().getIntExtra("detail_image03",0));
                dlg.setTitle("확대");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });
        avante04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(Avante.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(Avante.this);
                ImageView zoomImage = (ImageView) dialogView.findViewById(R.id.zoomImage);
                zoomImage.setImageResource(getIntent().getIntExtra("detail_image04",0));
                dlg.setTitle("확대");
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });

        sub_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void onClickShowAlert(View view){
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(Avante.this);
        myAlertBuilder.setTitle("결제");
        myAlertBuilder.setMessage("구매하시겠습니까?");
        myAlertBuilder.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "구매하였습니다", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "취소하였습니다", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.show();
    }
}










