package com.company.Parser;

import com.company.Bussiness.loggingService;
import com.company.model.logRequest;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class singleFileReader implements Runnable {

    public File source;
    public singleFileReader(File newFile){
        this.source = newFile;
    }
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(source));
            String lineInput = br.readLine();

            while((lineInput = br.readLine())!= null){
               // System.out.println(lineInput);
                processLineInput(lineInput);
                //  lineInput = br.readLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processLineInput(String lineInput) throws ParseException {

        String space =" ";
        String inputArr[] = lineInput.split(space);
        String requestId = inputArr[0];
        Date TimeStamp = new Date(Long.parseLong(inputArr[1]));;
        String exceptionName = inputArr[2];

        //  Date d = new Date(Long.parseLong(TimeStamp));

        logRequest newRequest = new logRequest( requestId ,  TimeStamp,  exceptionName);

        loggingService.addToMap(newRequest);

        // System.out.println(newRequest.getExceptionName());




    }
}
