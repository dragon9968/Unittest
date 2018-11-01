package UnitTest_Class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Function_Class.Person;

class UniTest_Person {

	Person target ;
 
	private static final String TEST_FIRST_NAME = "long";
	private static final String TEST_LAST_NAME = "nguyen";


    public UniTest_Person() {
  	 target = new Person ("Thomas", "Brown"); 	
    }

    @Before
    public void setUp() {
    	//target = new Person ("Thomas", "Brown");
    }

    

    @Test
    public void testGetfirstName() {
        assertEquals("Thomas", target.getfirstName());
    }

    @Test
    public void testSetfirstName() {
        target.setfirstName(TEST_FIRST_NAME);
        Assert.assertEquals(target.getfirstName(), TEST_FIRST_NAME);
    }

    @Test
    public void testGetlastName() {
        assertEquals("Brown", target.getlastName());
    }

    @Test
    public void testSetlastName() {
    	 target.setfirstName(TEST_LAST_NAME);
         Assert.assertEquals(target.getfirstName(), TEST_LAST_NAME);
    }

    @Test
    public void testToString() {
        assertEquals("Thomas Brown", target.toString());
    }

}
