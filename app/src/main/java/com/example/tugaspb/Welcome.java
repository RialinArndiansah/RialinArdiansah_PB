package com.example.tugaspb;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomexml);

        // Ambil username dari intent
        String username = getIntent().getStringExtra("USERNAME");

        // Tampilkan pesan selamat datang
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        tvWelcome.setText("Selamat datang, " + username + "!");
    }
}
