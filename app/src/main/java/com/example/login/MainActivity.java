package com.example.login;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1 = (Button) findViewById(R.id.confirm_button);
        btn1.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View arg0)
        {
            EditText editText1 =(EditText)findViewById(R.id.username_edit);
            String str1=editText1.getText().toString();
            System.out.println(str1);
            Toast.makeText(MainActivity.this, str1,Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, "@String/hello_world",Toast.LENGTH_LONG).show();

        }
    } );


//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//
//        bottomNavigationView.setSelectedItemId(R.id.home);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.dashbaord:
//                        startActivity(new Intent(getApplicationContext()
//                                , DashBoard.class));
//                        overridePendingTransition(0, 0);
//                        return true;
//                    case R.id.home:
//                        return true;
//                    case R.id.about:
//                        startActivity(new Intent(getApplicationContext()
//                                , About.class));
//                        overridePendingTransition(0, 0);
//                        return true;
//                    case R.id.me:
//                        startActivity(new Intent(getApplicationContext()
//                                , Me.class));
//                        overridePendingTransition(0,0);
//                        return true;
//
//                }
//                return false;
//
//            }
//        });
    }
}