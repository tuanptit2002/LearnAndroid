package com.example.helloworld.Activitis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.helloworld.Adapters.FutureAdapters;
import com.example.helloworld.Domains.FutureDomain;
import com.example.helloworld.R;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterTomorrow;
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        initRecyclerView();
        setVariable();
    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FutureActivity.this, MainActivity.class));
            }
        });
    }

    private void initRecyclerView() {
        ArrayList<FutureDomain> items = new ArrayList<>();
        items.add(new FutureDomain("Sat","storm","storm",25,10));
        items.add(new FutureDomain("Sun","cloudy","cloudy",24,16));
        items.add(new FutureDomain("Mon","windy","windy",29,15));
        items.add(new FutureDomain("Tue","cloudy_sunny","Cloudy_Sunny",22,13));
        items.add(new FutureDomain("Wen","sun","Sunny",28,11));
        items.add(new FutureDomain("Thu","rain","Rainy",23,12));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapterTomorrow = new FutureAdapters(items);
        recyclerView.setAdapter(adapterTomorrow);
    }
}