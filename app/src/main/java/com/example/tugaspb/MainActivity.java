package com.example.tugaspb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Cek apakah username dan password kosong
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Masukkan Username dan Password!", Toast.LENGTH_SHORT).show();
                }
                // Cek username dan password (contoh hardcoded)
                else if (username.equals("allen") && password.equals("123456")) {
                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Username atau Password Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
