package com.lessonslab.cxfrestservice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.lessonslab.cxfrestservice.dao.EmployeeDao;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	public void testEmpDaoEmployee()throws Exception{
		EmployeeDao empDao = new EmployeeDao();
		assertEquals(empDao.getEmployeeDetails("12345").size(),1);
	}
	public void testEmpDaoEmployees() throws Exception{
		EmployeeDao empDao = new EmployeeDao();
		assertEquals(empDao.getEmployeeDetails("*").size(),2);
	}
}
