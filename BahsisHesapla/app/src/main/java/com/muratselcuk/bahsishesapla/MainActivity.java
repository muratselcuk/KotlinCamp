package com.muratselcuk.bahsishesapla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.SeekBar;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView hesap,bahsisOran,bahsisOran1,bahsisTutar,toplam;
    double hesapTutari;
    int bahsisOrani=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hesap = findViewById(R.id.txtHesap);
        SeekBar bahsisOran =(SeekBar) findViewById(R.id.sbBahsisOran);
        bahsisOran1 = findViewById(R.id.txtBahsisOran);
        bahsisTutar = findViewById(R.id.txtBahsisTutar);
        toplam = findViewById(R.id.txtToplam);

        hesap.setText("0");
        bahsisOran1.setText("10");
        hesapla();

        hesap.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    hesapTutari = Double.parseDouble(hesap.getText().toString());
                    hesapla();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        bahsisOran.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                hesapTutari=Double.parseDouble(hesap.getText().toString());
                bahsisOran1.setText("% " + Integer.toString(progress));
                bahsisOrani=progress;
                hesapla();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    protected void hesapla(){
        double bahsis = hesapTutari * bahsisOrani/100;
        double total = hesapTutari + bahsis;
        bahsisTutar.setText(String.valueOf(bahsis)+" TL");
        toplam.setText(String.valueOf(total)+" TL");

    }




}