package com.company.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeRange {
    public Date lowerLimit;
    public  Date upperLimit;


    public timeRange(Date timeStamp) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
          String format = formatter.format(timeStamp);
         String arr[] = format.split(":");
         int temp = Integer.parseInt(arr[1])/15;

         lowerLimit = formatter.parse(arr[0]+":" + String.valueOf(temp*15));
         if(temp != 3)
        upperLimit = formatter.parse(arr[0]+":" + String.valueOf((temp+1)*15));
         else
             upperLimit = formatter.parse((Integer.parseInt(arr[0])+1)+":" + "00");

    }

    public String toString(){

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return formatter.format(lowerLimit) + " - " + formatter.format(upperLimit);

    }

    public boolean equals(timeRange a){
        if(lowerLimit.equals(a.lowerLimit) && upperLimit.equals(a.upperLimit))
            return true;
        return false;
    }
}
