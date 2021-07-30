package com.geekcolab.development;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

public class Task extends TimerTask {

    public void run() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);
        String currentTime = timeFormatter.format(date);
        System.out.println("This task runs at " + currentTime);
    }

}
