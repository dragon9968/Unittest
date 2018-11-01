package UnitTest_Class;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import Function_Class.*;
import Function_Class.Mathleo;

public class UnitTest {
	    @Parameter(0)
	    public int m1;
	    @Parameter(1)
	    public int m2;
	    @Parameter(2)
	    public int result;

	    // creates the test data
	    @Parameters
	    public static Collection<Object[]> data() {
	        Object[][] data = new Object[][] { { 1 , 2, 3 }, { 5, 3, 8 }, { 121, 4, 125 } };
	        return Arrays.asList(data);
	    }
    
	String message = "Hello World";      
	Mathleo matheo = new Mathleo();   	
    MessageUtil	 messageUtil = new MessageUtil(message);
           
     
    
		   @Test
		   public void testPrintMessage() {
	       assertEquals(message,messageUtil.printMessage());    
           }
		   
		   @Test
		    public void testAdd() {	
		    assertEquals(result, matheo.add(m1,m2));
		    }
		 
		 
		   
		   
}
