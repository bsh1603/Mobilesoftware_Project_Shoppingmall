package com.course.shoppingmall;

import static com.course.shoppingmall.R.id.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView myRecyclerView1;
    private RecyclerView myRecyclerView2;
    private RecyclerView.LayoutManager myLayoutManager;
    TextView textCall, textMail, textLocation;
    GoogleMap gMap;
    MapFragment mapFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCall = (TextView)findViewById(R.id.textCall);
        textMail = (TextView)findViewById(R.id.textMail);
        textLocation = (TextView)findViewById(R.id.textLocation);
        mapFrag = (MapFragment)getFragmentManager().findFragmentById(map);

        myRecyclerView1 = (RecyclerView) findViewById(R.id.myRecyclerView1);
        myRecyclerView1.addItemDecoration(new DividerItemDecoration(myRecyclerView1.getContext(),1));
        myRecyclerView1.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView1.setLayoutManager(myLayoutManager);

        myRecyclerView2 = (RecyclerView) findViewById(R.id.myRecyclerView2);
        myRecyclerView2.addItemDecoration(new DividerItemDecoration(myRecyclerView2.getContext(),1));
        myRecyclerView2.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView2.setLayoutManager(myLayoutManager);

        ArrayList<Cars> carsInfo = new ArrayList<>();
        carsInfo.add(new Cars(R.drawable.h_avante_main, "아반떼", "2,779만원"));
        carsInfo.add(new Cars(R.drawable.h_casper_main, "캐스퍼", "1,960만원"));
        carsInfo.add(new Cars(R.drawable.h_granger_main, "그랜저", "4,388만원"));
        carsInfo.add(new Cars(R.drawable.h_venu_main, "베뉴","2,236만원"));
        carsInfo.add(new Cars(R.drawable.k_carnival_main, "카니발", "4,381만원"));
        carsInfo.add(new Cars(R.drawable.k_celltos_main, "셀토스","2,930만원"));

        ArrayList<Cars> carsInfo2 = new ArrayList<>();
        carsInfo2.add(new Cars(R.drawable.k_spotage_main, "스포티지 하이브리드", "3,916만원"));
        carsInfo2.add(new Cars(R.drawable.k_stinger_main, "스팅어", "5,006만원"));
        carsInfo2.add(new Cars(R.drawable.g_g70_main, "G70", "4,830만원"));
        carsInfo2.add(new Cars(R.drawable.g_g80_main, "G80","6,251만원"));
        carsInfo2.add(new Cars(R.drawable.g_gv60_main, "GV60", "7,040만원"));
        carsInfo2.add(new Cars(R.drawable.g_gv80_main, "GV80", "7,056만원"));

        ArrayList<DetailCars> detailcarsInfo = new ArrayList<>();
        detailcarsInfo.add(new DetailCars("2020 AVANTE", R.drawable.avante01, R.drawable.avante02,
                 R.drawable.avante03, R.drawable.avante04, "제조사 : 현대 | 국산 | 준중형",
                "연비 : 10.5~15.4km/l", "연료 : 가솔린, LPG", "출력 : 120~240hp", "가격 : 2,779만원",
                "https://www.hyundai.com/kr/ko/e/vehicles/avante/intro"));
        detailcarsInfo.add(new DetailCars("2022 CASPER", R.drawable.casper01, R.drawable.casper02,
                R.drawable.casper03, R.drawable.casper04, "제조사 : 현대 | 국산 | 경형",
                "연비 : 12.3~14.3km/l", "연료 : 가솔린", "출력 : 76~100hp", "가격 : 1,960만원",
                "https://casper.hyundai.com/vehicles/highlight"));
        detailcarsInfo.add(new DetailCars("2021 GRANDEUR", R.drawable.granger01, R.drawable.granger02,
                R.drawable.granger03, R.drawable.granger04, "제조사 : 현대 | 국산 | 중대형",
                "연비 : 7.4~11.9km/l", "연료 : 가솔린, LPG", "출력 : 198~290hp", "가격 : 4,388만원",
                "https://www.hyundai.com/kr/ko/e/vehicles/grandeur/intro"));
        detailcarsInfo.add(new DetailCars("2022 VENUE", R.drawable.venu01, R.drawable.venu02,
                R.drawable.venu03, R.drawable.venu04, "제조사 : 현대 | 국산 | 소형",
                "연비 : 13.3~13.7km/l", "연료 : 가솔린", "출력 : 123hp", "가격 : 2,236만원",
                "https://www.hyundai.com/kr/ko/e/vehicles/venue/intro"));
        detailcarsInfo.add(new DetailCars("2022 CARNIVAL", R.drawable.carnival01, R.drawable.carnival02,
                R.drawable.carnival03, R.drawable.carnival04, "제조사 : 기아 | 국산 | 대형",
                "연비 : 8.9~13.1km/l", "연료 : 디젤, 가솔린", "출력 : 202~294hp", "가격 : 4,381만원",
                "https://www.kia.com/kr/vehicles/4thcarnival/features.html"));
        detailcarsInfo.add(new DetailCars("2022 SELLTOS", R.drawable.celltos01, R.drawable.celltos02,
                R.drawable.celltos03, R.drawable.celltos04, "제조사 : 기아 | 국산 | 소형",
                "연비 : 10.9~17.1km/l", "연료 : 디젤, 가솔린", "출력 : 136~177hp", "가격 : 2,930만원",
                "https://www.kia.com/kr/vehicles/seltos/features.html"));

        ArrayList<DetailCars> detailcarsInfo2 = new ArrayList<>();
        detailcarsInfo2.add(new DetailCars("2022 SPORTAGE HYBRID", R.drawable.sportage01, R.drawable.sportage02,
                R.drawable.sportage03, R.drawable.sportage04, "제조사 : 기아 | 국산 | 준중형",
                "연비 : 15.2~16.7km/l", "연료 : 하이브리드, 가솔린, 전기", "출력 : 180hp", "가격 : 3,916만원",
                "https://www.kia.com/kr/vehicles/theallnewsportage/microsite.html"));
        detailcarsInfo2.add(new DetailCars("2022 STINGER", R.drawable.stinger01, R.drawable.stinger02,
                R.drawable.stinger03, R.drawable.stinger04, "제조사 : 기아 | 국산 | 중형",
                "연비 : 8.5~11.2km/l", "연료 : 가솔린", "출력 : 304~373hp", "가격 : 5,006만원",
                "https://www.kia.com/kr/vehicles/stingermeister/features.html"));
        detailcarsInfo2.add(new DetailCars("2021 G70", R.drawable.g70_01, R.drawable.g70_02,
                R.drawable.g70_03, R.drawable.g70_04, "제조사 : 제네시스 | 국산 | 중대형",
                "연비 : 8.9~14.9km/l", "연료 : 디젤, 가솔린", "출력 : 202~370hp", "가격 : 4,830만원",
                "https://www.genesis.com/us/ko/2021/genesis-g70.html"));
        detailcarsInfo2.add(new DetailCars("2022 G80)", R.drawable.g80_01, R.drawable.g80_02,
                R.drawable.g80_03, R.drawable.g80_04, "제조사 : 제네시스 | 국산 | 준대형",
                "연비 : 8.4~14.67km/l", "연료 : 디젤, 가솔린", "출력 : 210~380hp", "가격 : 6,251만원",
                "https://www.genesis.com/us/ko/2021/genesis-g80.html"));
        detailcarsInfo2.add(new DetailCars("2022 GV60", R.drawable.gv60_01, R.drawable.gv60_02,
                R.drawable.gv60_03, R.drawable.gv60_04, "제조사 : 제네시스 | 국산 | 준중형",
                "연비 : 4.1~5.1km/l", "연료 : 전기", "출력 : 정보없음", "가격 : 7,040만원",
                "https://www.genesis.com/kr/ko/models/luxury-suv-genesis/gv60/highlights.html"));
        detailcarsInfo2.add(new DetailCars("2022 GV80", R.drawable.gv80_01, R.drawable.gv80_02,
                R.drawable.gv80_03, R.drawable.gv80_04, "제조사 : 제네시스 | 국산 | 준대형",
                "연비 : 8.0~11.8km/l", "연료 : 디젤, 가솔린", "출력 : 278~380hp", "가격 : 7,056만원",
                "https://www.genesis.com/us/ko/2021/genesis-gv80.html"));

        MyAdapter myAdapter = new MyAdapter(carsInfo, detailcarsInfo, getApplicationContext());
        myRecyclerView1.setAdapter(myAdapter);
        MyAdapter myAdapter2 = new MyAdapter(carsInfo2, detailcarsInfo2, getApplicationContext());
        myRecyclerView2.setAdapter(myAdapter2);

        textCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:01029519626");
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        textMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                String[] address = {"hyun960303@naver.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, address);
                intent.putExtra(Intent.EXTRA_SUBJECT, "문의사항");
                startActivity(intent);
            }
        });
        textLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MapsActivity.class);
                startActivity(intent);
            }
        });

    }
    public void moveMap(View view){
        startActivity(new Intent(this, MapsActivity.class));
    }

}












