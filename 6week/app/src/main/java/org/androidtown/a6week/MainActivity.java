package org.androidtown.a6week;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ProfileAdapter adapter;
    ListView listView;
    ArrayList<Profile> profileArrayList;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           listView= (ListView) findViewById(R.id.profile);
           profileArrayList=new ArrayList<Profile>();
           profileArrayList.add(new Profile("라디오스타", "11학번"));
           profileArrayList.add(new Profile("태조왕건", "12학번"));
           profileArrayList.add(new Profile("피고인", "13학번"));
           profileArrayList.add(new Profile("슈퍼보드", "14학번"));
           profileArrayList.add(new Profile("신서유기", "15학번"));
           profileArrayList.add(new Profile("미우새", "16학번"));
           profileArrayList.add(new Profile("피곤해", "17학번"));
           profileArrayList.add(new Profile("빨리자야지", "18학번"));

           adapter=new ProfileAdapter(this, profileArrayList);

           listView.setAdapter(adapter);




    }
}
