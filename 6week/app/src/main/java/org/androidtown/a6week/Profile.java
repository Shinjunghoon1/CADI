package org.androidtown.a6week;

/**
 * Created by 신정훈1 on 2017-03-17.
 */

public class Profile {
   private String name;
   private String number;

    public Profile(String name, String number){
        this.name=name;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }


}
