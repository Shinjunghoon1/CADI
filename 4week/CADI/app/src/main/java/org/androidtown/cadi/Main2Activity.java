package org.androidtown.cadi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Intent gintent;
    private String name, age;
    private Intent rintent;
    private Button btn;

    public void initView(){
        gintent=getIntent();
        name=gintent.getStringExtra("name");
        age=gintent.getStringExtra("age");
        Toast.makeText(Main2Activity.this, name+"/"+age+"입니다.", Toast.LENGTH_LONG).show();

        btn=(Button)findViewById(R.id.btn);


    }

    @Override
    public void onBackPressed() {
        rintent=new Intent(Main2Activity.this, MainActivity.class);
        rintent.putExtra("send", "잘받았습니다.");
        setResult(RESULT_OK, rintent);
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                LinearLayout linearLayout2= (LinearLayout) findViewById(R.id.linear);
                inflater.inflate(R.layout.activity_main3, linearLayout2, true);




            }
        });
    }

}
