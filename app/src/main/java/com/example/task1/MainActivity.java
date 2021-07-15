package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        Toast.makeText(this,"on create",Toast.LENGTH_SHORT).show();
        Log.d("test_on create","on create");
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test_on start","on start");
        Toast.makeText(this,"on start",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test_on resume","on resume");
        Toast.makeText(this,"on resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test_on pause","on pause");
        Toast.makeText(this,"on pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test_on stop","on stop");
        Toast.makeText(this,"on stop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test_on destroy","on destroy");
        Toast.makeText(this,"on destroy",Toast.LENGTH_SHORT).show();
    }
}