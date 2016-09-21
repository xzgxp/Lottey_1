package com.example.entertiment;

public class Utils {
    private static long lastClickTime;
    public synchronized static boolean isFastClick() {
        long time = System.currentTimeMillis();   
        if ( time - lastClickTime < 5000) {   
            return true;   
        }   
        lastClickTime = time;   
        return false;   
    }
}
