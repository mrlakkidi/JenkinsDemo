package com.lessonslab.cxfrestservice.exception;

import java.io.Serializable;

public class MyApplicationException extends Exception implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String message;
 
    public MyApplicationException() {
        super();
    }
    public MyApplicationException(String msg)   {
        super(msg);
        this.message = msg;
    }
    public MyApplicationException(String msg, Exception e)  {
        super(msg, e);
        this.message=msg;
    }
    
    public String getMessage() {
        return message;
    }
}
