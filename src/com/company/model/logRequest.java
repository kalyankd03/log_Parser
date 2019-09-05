package com.company.model;

import java.util.Date;

public class logRequest {
    private String requestId;
    private Date timeStamp;
    private String exceptionName;


    public logRequest(String requestId, Date timeStamp , String exceptionName){
        this.requestId = requestId;
        this.timeStamp = timeStamp;
        this.exceptionName = exceptionName;
    }

    public String getRequestId(){
        return this.requestId;
    }

    public void setRequestId (String id){
        this.requestId = id;
    }

    public Date getTimeStamp(){
        return this.timeStamp;
    }

    public void setTimeStamp (Date time){
        this.timeStamp = time;
    }

    public String getExceptionName(){
        return this.exceptionName;
    }

    public void setExceptionName (String exceptionName){
        this.exceptionName = exceptionName;
    }




}
