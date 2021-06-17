package com.example.projekluckywheel;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.sql.SQLException;
import java.util.List;

public class ViewTable extends AppCompatActivity {
   /* private DataMember db;*/


    Button btn_tambah, btn_Wheel;

    TableRow tb;
    TextView  tv_slot, tv_nama, tv_lunas;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_table);

        btn_tambah  =(Button)findViewById(R.id.btn_tambah);
        btn_Wheel  =(Button)findViewById(R.id.btnWheel);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewTable.this, NewDataActivity.class));
            }
        });
        btn_Wheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewTable.this, WheelActivity.class));
            }
        });
        /*db = new DataMember(this);
        TableLayout tl = findViewById(R.id.tl);
        try {
            db.open();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        List<Member> listMember = db.getAllMember();
        int nomor = 1;

        if(listMember.isEmpty()){
            TextView empty = new TextView(this);
            empty.setText("Belum ada Data Mahasiswa");
            empty.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            empty.setPadding(0,30,0,0);
            Log.d("EMP", "Kosong!");
            tl.addView(empty);

        }else {
            for (Member mhs : listMember) {
                TableRow tr = new TableRow(this);
                TableLayout.LayoutParams trParams = new TableLayout.LayoutParams
                        (TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
                trParams.setMargins(0, 4, 0, 0);
                //            tr.setBackgroundColor(Color.rgb(255,240,255));
                tr.setLayoutParams(trParams);
                tr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent data = new Intent(ViewTable.this, NewDataActivity.class);
                        data.putExtra("slot", mhs.get_slot());
                        data.putExtra("nama", mhs.get_nama());
                        data.putExtra("lunas", mhs.get_lunas());
                        data.putExtra("id", Integer.toString(mhs.get_id()));
                        startActivity(data);
                    }
                });
                TextView tv_slot = new TextView(this);
               *//* TextView tv_npm = new TextView(this);*//*
                TextView tv_nama = new TextView(this);
                TextView tv_lunas = new TextView(this);

                tv_slot.setText(Integer.toString(nomor));
                nomor++;
                tv_slot.setTextSize(20);
                tv_slot.setPadding(2, 0, 40, 0);
                tv_slot.setTextColor(Color.BLACK);
                tv_slot.setBackgroundColor(Color.rgb(240, 240, 240));

               *//* tv_npm.setText(mhs.get_npm());
                tv_npm.setTextSize(20);
                tv_npm.setPadding(40, 0, 40, 0);
                tv_npm.setTextColor(Color.BLACK);
                tv_npm.setBackgroundColor(Color.rgb(230, 230, 230));*//*

                tv_nama.setText(mhs.get_nama());
                tv_nama.setTextSize(20);
                tv_nama.setPadding(40, 0, 40, 0);
                tv_nama.setTextColor(Color.BLACK);
                tv_nama.setBackgroundColor(Color.rgb(220, 220, 220));

                tv_lunas.setText(mhs.get_lunas());
                tv_lunas.setTextSize(20);
                tv_lunas.setPadding(40, 0, 0, 0);
                tv_lunas.setTextColor(Color.BLACK);
                tv_lunas.setBackgroundColor(Color.rgb(200, 200, 200));


                tr.addView(tv_slot);
//                tr.addView(tv_npm);
                tr.addView(tv_nama);
                tr.addView(tv_lunas);
                tl.addView(tr);
            }
        }

        db.close();*/
    }
}