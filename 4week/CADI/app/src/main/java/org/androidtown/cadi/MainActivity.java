package org.androidtown.cadi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btn;
    private EditText editname, editage;
    private Intent intent;
    private static final int RequestCode=1001;

    public void initView(){
        btn=(Button)findViewById(R.id.btn_enroll);
        editname=(EditText)findViewById(R.id.editName);
        editage=(EditText)findViewById(R.id.editAge);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("name", editname.getText().toString());
                intent.putExtra("age", editage.getText().toString());
                startActivityForResult(intent, RequestCode);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode){
            case RequestCode:
                if(resultCode==RESULT_OK) {
                    Toast.makeText(MainActivity.this, data.getStringExtra("send"), Toast.LENGTH_LONG).show();
                    break;
                }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
}
