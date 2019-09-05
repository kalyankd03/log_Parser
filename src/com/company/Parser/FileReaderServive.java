package com.company.Parser;
import com.company.Bussiness.loggingService;
import com.company.model.logRequest;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileReaderServive {

    public static void processFileInput() throws IOException, ParseException {


        String directory = System.getProperty("user.dir");
        String filePath = directory + ("/resources");
        File dir = new File(filePath);
        File[] files = dir.listFiles();

        for (File file : files) {
            singleFileReader s = new singleFileReader(file);
            s.run();
        }

       // BufferedReader br = new BufferedReader(new FileReader(filePath));

//        String lineInput = br.readLine();
//
//        while((lineInput = br.readLine())!= null){
//            System.out.println(lineInput);
//            processLineInput(lineInput);
//          //  lineInput = br.readLine();
//
//        }
//
//        System.out.println( );
    }

}
