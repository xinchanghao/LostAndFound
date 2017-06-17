package edu.fjnu.cse.lostandfound.activity;

import android.app.Application;

import edu.fjnu.cse.lostandfound.entities.LostItem;

/**
 * 全局Application
 * Created by zspmh on 2017-6-10.
 */

public class AppContext extends Application {
    private boolean isLogined = false;
    private String SID;
    private String Name;
    private LostItem currentItem;
    //public static String mDomain = "192.168.198.190";
    public static String mDomain = "l.city";

    public LostItem getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(LostItem currentItem) {
        this.currentItem = currentItem;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLogined(boolean logined) {
        isLogined = logined;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }


    public String getSID() {
        return SID;
    }

    public String getName() {
        return Name;
    }

    public boolean isLogined() {
        return isLogined;
    }
}
