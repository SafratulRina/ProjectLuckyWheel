package com.example.projekluckywheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminActivity extends AppCompatActivity {
    DatabaseHelper db;
    Button submit;
    EditText username, jumlahmata, jangkawaktu, jumlahslot, namabank, norekening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        db = new DatabaseHelper(this);

        username= (EditText)findViewById(R.id.txUsernameAdmin);
        jumlahmata = (EditText)findViewById(R.id.txJumlahMata);
        jangkawaktu = (EditText)findViewById(R.id.txJangkaWaktu);
        jumlahslot = (EditText)findViewById(R.id.txJumlahSlot);
        namabank = (EditText)findViewById(R.id.txJenisBank);
        norekening = (EditText)findViewById(R.id.txNoRekening);
        submit = (Button)findViewById(R.id.btnSubmit);

        //submit
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = username.getText().toString();
                String mata = jumlahmata.getText().toString();
                String waktu = jangkawaktu.getText().toString();
                String slot = jumlahslot.getText().toString();
                String bank = namabank.getText().toString();
                String no = norekening.getText().toString();

                Intent i = new Intent(AdminActivity.this, GetActivity.class);

                i.putExtra("Keynama", name);
                i.putExtra("keymata", mata);
                i.putExtra("Keywaktu", waktu);
                i.putExtra("Keyslot", slot);
                i.putExtra("Keybank", bank);
                i.putExtra("Keynorek", no);

                startActivity(i);
                finish();
            }
        });
        }
}
