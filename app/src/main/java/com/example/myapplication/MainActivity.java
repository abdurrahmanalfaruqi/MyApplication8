package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private EditText etPanjang,etLebar,etTinggi;
private Button btnHitung;
private TextView tvHasil;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("frq",MainActivity.class.getSimpleName()+"onCreate");

        etPanjang = findViewById(R.id.etPanjang) ;
        etLebar = findViewById(R.id.etLebar) ;
        etTinggi = findViewById(R.id.etTinggi) ;
        btnHitung = findViewById(R.id.btnHitung) ;
        tvHasil = findViewById(R.id.tvHasil) ;

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString()) ;
                Integer lebar = Integer.parseInt(etLebar.getText().toString()) ;
                Integer tinggi = Integer.parseInt(etTinggi.getText().toString()) ;

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));

            }
        });






    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("frq",MainActivity.class.getSimpleName()+"onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("frq",MainActivity.class.getSimpleName()+"onResume");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("frq",MainActivity.class.getSimpleName()+"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("frq",MainActivity.class.getSimpleName()+"onRestart");
    }
}

