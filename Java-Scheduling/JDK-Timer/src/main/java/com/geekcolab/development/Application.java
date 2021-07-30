package com.geekcolab.development;

import java.util.Timer;

public class Application {

    public static void main(String[] args) {

        Timer timer = new Timer();
        //This task runs every 5 sec
        timer.scheduleAtFixedRate(new Task(), 5000, 5000);

    }
}
