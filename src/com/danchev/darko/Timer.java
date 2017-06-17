package com.danchev.darko;

/**
 * Created by danchev on 6/14/17.
 */
public class Timer {
    private long time;

    float stop() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis- time;
    }

    private long getCurrentTime()
    {
        return System.currentTimeMillis();
    }

    public void start()
    {
        time = getCurrentTime();
    }
}

