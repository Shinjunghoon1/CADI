package org.androidtown.a6week;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 신정훈1 on 2017-03-17.
 */

public class ProfileAdapter extends BaseAdapter {
    private Context context=null;
    private ArrayList<Profile> data=null;



    TextView textView1, textView2;
    Button btn;

    public ProfileAdapter(Context context, ArrayList<Profile> data){
        this.context=context;
        this.data=data;

    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemLayout=inflater.inflate(R.layout.item, parent, false);
        textView1= (TextView) itemLayout.findViewById(R.id.name);
        textView2=(TextView) itemLayout.findViewById(R.id.num);
        btn= (Button) itemLayout.findViewById(R.id.button);
        init(position);
        btn.setOnClickListener(new buttonClick(position));


        return itemLayout;
    }
    public void init(final int position) {

        textView1.setText(data.get(position).getName());
        textView2.setText(data.get(position).getNumber());
    }
        private class buttonClick implements View.OnClickListener{
            int position;
            public buttonClick(int position){
                this.position=position;
            }

            @Override
            public void onClick(View v) {
                Toast.makeText(context.getApplicationContext(), data.get(position).getName()+"/"+data.get(position).getNumber(), Toast.LENGTH_SHORT).show();
            }
        }



    }

