package com.companyname.bank;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /* /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    /* public AppTest( String testName )
    {
        super( testName );
    } */

    /**
     * @return the suite of tests being tested
     */
   /*  public static Test suite()
    {
        return new TestSuite( AppTest.class );
    } */ 

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	
	public void testApp2(){
	
	System.out.println("Inside testApp2");
	if(2==2) {
		System.out.println("Assert True");
		assertTrue(true);
	}
	else {
		System.out.println("Assert Fail");
		assertTrue(false);
	}
	}
}