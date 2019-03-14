package com.example.lifeline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.example.lifeline.utils.Utils;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    LinearLayout previousAppointmentVw,scheduleAppointmentVw,trackhospitals,profileVw;
    Utils utilsObj = new Utils();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        initializeAll();


    }

    public void initializeAll(){
        previousAppointmentVw = findViewById(R.id.previous_appointmet);
        scheduleAppointmentVw = findViewById(R.id.schedule_appointment);
        profileVw = findViewById(R.id.profile_vw);
        trackhospitals = findViewById(R.id.track_hospital);
        trackhospitals.setOnClickListener(this);
        previousAppointmentVw.setOnClickListener(this);
        scheduleAppointmentVw.setOnClickListener(this);
        profileVw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.profile_vw :
//                Intent intent = new Intent(DashboardActivity.this, ProfileAddressActivity.class);
//                startActivity(intent);
                break;
            case  R.id.previous_appointmet :
//                Intent previousAppointmetIntent = new Intent(DashboardActivity.this, PreviousAppointmentActivity.class);
//                startActivity(previousAppointmetIntent);
                break;
            case R.id.track_hospital:
                Intent trackLioskIntent = new Intent(Dashboard.this, hospitals_locator.class);
                startActivity(trackLioskIntent);
                utilsObj.showCustomToast(getApplicationContext(),"Inprogress");
                break;
            case  R.id.schedule_appointment :
//                Intent scheduleAppointmentIntent = new Intent(DashboardActivity.this, ScheduleAppointmentActivity.class);
//                startActivity(scheduleAppointmentIntent);
                break;

        }

    }
}
