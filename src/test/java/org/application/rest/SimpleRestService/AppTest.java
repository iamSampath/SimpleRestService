package org.application.rest.SimpleRestService;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    
     AppController App = new AppController();
     String S1 = "Mother in Law";
     String S2 = "Hitler Woman";
     
     String returnMessage = S2 +" Is Anagram to "+ S1;  
     Assert.assertEquals(returnMessage,App.AppModel(S1, S2));
    }
}
