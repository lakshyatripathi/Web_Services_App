package com.example.cogentwebservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button signup;

    EditText ed1,ed2,ed3,ed4,ed5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signup=findViewById(R.id.signup);

        ed1=findViewById(R.id.uname);
        ed2=findViewById(R.id.email);
        ed3=findViewById(R.id.phno);
        ed4=findViewById(R.id.pass);
        ed5=findViewById(R.id.cpass);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ed1.getText().toString().trim().isEmpty() && ed2.getText().toString().trim().isEmpty() && ed3.getText().toString().trim().isEmpty() && ed4.getText().toString().trim().isEmpty() && ed5.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(Register.this,"please input all the fields",Toast.LENGTH_LONG).show();
                }

                else
                {
                    Intent partner = new Intent(Register.this,Partner.class);
                    startActivity(partner);
                    finish();
                }
            }
        });
    }
}
