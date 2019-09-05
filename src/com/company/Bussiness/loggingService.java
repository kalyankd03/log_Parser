package com.company.Bussiness;

import com.company.Parser.FileReaderServive;

import com.company.model.ExceptionTimeRange;
import com.company.model.logRequest;
import com.company.model.timeRange;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.PriorityQueue;

public class loggingService {
    private static HashMap<ExceptionTimeRange, Integer> logRequestExceptionCount = new HashMap<ExceptionTimeRange,Integer>();

public static void Launcher() throws IOException, ParseException {


    //ExecutorService executor = Executors.newFixedThreadPool(poolSize);
    FileReaderServive.processFileInput();

    logRequestExceptionCount.forEach((k, v) -> System.out.println(k + "  " + (v )));



}


public static  void addToMap (logRequest newRequest) throws ParseException {

    timeRange newTimeRange = new timeRange(newRequest.getTimeStamp());


    ExceptionTimeRange newObj = ExceptionTimeRange.createNewInstance(newTimeRange , newRequest.getExceptionName());

    boolean b = false;

    for (HashMap.Entry<ExceptionTimeRange, Integer> entry : logRequestExceptionCount.entrySet()) {

        if(entry.getKey().equals(newObj)){

            int requestCount = entry.getValue();
            logRequestExceptionCount.put(entry.getKey() , requestCount +1);
            b = true;
            break;
        }
    }
//   if( logRequestExceptionCount.containsKey(newObj)){
//       int requestCount = logRequestExceptionCount.get(newObj);
//       logRequestExceptionCount.put(newObj , requestCount +1);
//   }
//   else{
//       logRequestExceptionCount.put(newObj , 1);
//   }
    if(!b){
        logRequestExceptionCount.put(newObj , 1);
    }
   // System.out.println(newObj.toString() +" " +logRequestExceptionCount.get(newObj));
}

}
