package com.example.pafitness.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pafitness.R;


public class ResetpassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpass);

        Button resetPassword= (Button)findViewById(R.id.buttonNewPassword2);
        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ResetpassActivity.this,LoginActivity.class);
                ResetpassActivity.this.startActivity(intent2);
            }
        });

    }
}