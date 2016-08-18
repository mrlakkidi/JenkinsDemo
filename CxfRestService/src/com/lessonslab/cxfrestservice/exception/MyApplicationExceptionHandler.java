package com.lessonslab.cxfrestservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MyApplicationExceptionHandler implements ExceptionMapper<MyApplicationException> 
{
    @Override
    public Response toResponse(MyApplicationException exception) {
        Response.Status httpStatus = Response.Status.INTERNAL_SERVER_ERROR;
        System.err.println("Coming into the Exception Mapper...");
        if (exception instanceof MyApplicationException) {
        	System.err.println("The exception is of  MyApplicationException...");
            httpStatus = Response.Status.BAD_REQUEST;
        }
        return Response.status(httpStatus).entity(exception.getMessage()).build();
    }
}
