package com.example.lifeline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PatientLogin extends AppCompatActivity {

    private Button login,guest_login,hospital_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_login);

        login = findViewById(R.id.patient_login);
        guest_login = findViewById(R.id.guest_login);
        hospital_login = findViewById(R.id.hospital_login);

        guest_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientLogin.this,Dashboard.class);
                startActivity(intent);
            }
        });


    }
}
