package org.androidtown.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                switch (v.getId()) {
                    case R.id.btn:
                        Toast.makeText(getApplicationContext(), "버튼이 눌렸습니다", Toast.LENGTH_LONG).show();


                }
            }


            });


    }
}






