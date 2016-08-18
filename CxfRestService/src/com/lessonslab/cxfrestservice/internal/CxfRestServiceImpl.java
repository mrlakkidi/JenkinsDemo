package com.lessonslab.cxfrestservice.internal;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;

import com.lessonslab.cxfrestservice.CxfRestService;
import com.lessonslab.cxfrestservice.dao.EmployeeDao;
import com.lessonslab.cxfrestservice.exception.MyApplicationException;

public class CxfRestServiceImpl implements CxfRestService 
{
	@Autowired
	private EmployeeDao employeeDao; 

	@Override
	public Response getEmployeeDetail(String employeeId) throws MyApplicationException {
		try {			 
				ResponseBuilder responseBuilder =	Response.ok(employeeDao.getEmployeeDetails(employeeId));
				return responseBuilder.build();
		}  catch (Exception e){
			throw new MyApplicationException("Employee is not found with the passed in Employee ID: "+employeeId);
		}
	}
}
