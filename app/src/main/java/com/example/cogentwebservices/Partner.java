package com.example.cogentwebservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Partner extends AppCompatActivity {

    Button btn1k,btn20k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner);

        btn1k=findViewById(R.id.btn1k);
        btn20k=findViewById(R.id.btn20k);

        btn1k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent logi= new Intent(Partner.this,Login.class);
                startActivity(logi);
                finish();
            }
        });

        btn20k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent logn= new Intent(Partner.this,Login.class);
                startActivity(logn);
                finish();
            }
        });

    }
}
