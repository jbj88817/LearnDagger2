package us.bojie.dagger2cainiao.user;

import android.util.Log;

/**
 * Created by bojiejiang on 4/15/17.
 */

public class User {

    private int id;
    private String name;


    public User(){

        Log.d("User","user----");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

