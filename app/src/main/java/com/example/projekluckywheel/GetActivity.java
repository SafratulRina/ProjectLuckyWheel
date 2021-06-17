package com.example.projekluckywheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetActivity extends AppCompatActivity {

    private TextView username, jumlahmata, jangkawaktu, jumlahslot, namabank, norekening;
    Button lihattabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        username= (TextView) findViewById(R.id.textname);
        jumlahmata = (TextView) findViewById(R.id.textmata);
        jangkawaktu = (TextView) findViewById(R.id.textwaktu);
        jumlahslot = (TextView) findViewById(R.id.textslot);
        namabank = (TextView) findViewById(R.id.textbank);
        norekening = (TextView) findViewById(R.id.textnorek);
        lihattabel = (Button)findViewById(R.id.btnView);

        String name = getIntent().getStringExtra("keynama");
        String mata = getIntent().getStringExtra("Keymata");
        String waktu = getIntent().getStringExtra("Keywaktu");
        String slot = getIntent().getStringExtra("Keyslot");
        String bank = getIntent().getStringExtra("keybank");
        String no = getIntent().getStringExtra("Keynorek");

        username.setText(name);
        jumlahmata.setText(mata);
        jangkawaktu.setText(waktu);
        jumlahslot.setText(slot);
        namabank.setText(bank);
        norekening.setText(no);
        //view
        lihattabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewTableIntent = new Intent(GetActivity.this, ViewTable.class);
                startActivity(viewTableIntent);
                finish();
            }
        });
    }
}