package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    ImageView facebook;
    Button login;
    int attempt=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password=findViewById(R.id.et2);
        username=findViewById(R.id.et1);
        facebook=findViewById(R.id.iv);
        login= findViewById(R.id.bt);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  if(username.getText().toString().equals("samar basiouni")&&password.getText().toString().equals("1234"))
                  {
                      Toast.makeText(MainActivity.this, " hello samar", Toast.LENGTH_SHORT).show();
                      Intent intent=new Intent(MainActivity.this,loginPage.class);
                      startActivity(intent);
                  } else{
                      if(attempt==5)
                   {
                      login.setEnabled(false);
                  }}
                  attempt++;
              }

        });
    }
}