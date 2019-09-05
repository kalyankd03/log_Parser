package com.company.model;

public final class ExceptionTimeRange {
    private final timeRange range;
    private final String exceptionName;


    private  ExceptionTimeRange(timeRange range , String exceptionName){
        this.range = range;
        this.exceptionName = exceptionName;
    }


    public static ExceptionTimeRange createNewInstance(timeRange range , String exceptionName)
    {
        return new ExceptionTimeRange(range , exceptionName);
    }

    public String toString(){
        return this.range +" "+this.exceptionName;
    }


    public boolean equals ( ExceptionTimeRange a){
        if(this.exceptionName.equals(a.exceptionName) && this.range.equals(a.range))
            return true;
        //System.out.println(exceptionName+" "+a.exceptionName+" "+range+" "+this.range);
        return false;
    }
}
