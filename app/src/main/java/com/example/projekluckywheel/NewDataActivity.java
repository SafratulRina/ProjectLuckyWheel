package com.example.projekluckywheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.sql.SQLException;

public class NewDataActivity extends AppCompatActivity {
    private DataMember db;
    Button btn_submit;
    EditText et_slot, et_nama, et_lunas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_data);
        db = new DataMember(this);
        try {
            db.open();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        btn_submit = findViewById(R.id.btn_submit);
        et_slot = findViewById(R.id.et_edit_slot);
        et_nama = findViewById(R.id.et_nama);
        et_lunas = findViewById(R.id.et_Lunas);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String slot = et_slot.getText().toString();
                String nama = et_nama.getText().toString();
                String lunas = et_lunas.getText().toString();

                if (TextUtils.isEmpty(et_slot.getText())) {
                    Toast.makeText(NewDataActivity.this, "Gagal!", Toast.LENGTH_SHORT).show();
                    et_slot.requestFocus();
                    et_slot.setError("Slot tidak boleh kosong!");

                } else if (TextUtils.isEmpty(et_nama.getText())) {
                    Toast.makeText(NewDataActivity.this, "Gagal!", Toast.LENGTH_SHORT).show();
                    et_nama.requestFocus();
                    et_nama.setError("Nama tidak boleh kosong!");

                } else if (TextUtils.isEmpty(et_lunas.getText())) {
                    Toast.makeText(NewDataActivity.this, "Gagal!", Toast.LENGTH_SHORT).show();
                    et_lunas.requestFocus();
                    et_lunas.setError("pembayaran tidak boleh kosong!");

                } else {
                    db.addMember(new Member(slot, nama, lunas));
                    Toast.makeText(NewDataActivity.this, "Data Member telah ditambahkan", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), ViewTable.class));
                }
            }
            });
        }
    }
