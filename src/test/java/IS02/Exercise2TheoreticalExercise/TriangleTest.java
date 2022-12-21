package IS02.Exercise2TheoreticalExercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TriangleType() {
		Triangle t1= new Triangle(60,60,60);
		Triangle t  = new Triangle(45,45,90);
        Triangle t2= new Triangle(40,40,100);	
        Triangle t3= new Triangle(50,50,80);
        Triangle t4= new Triangle(50,30,100);	
        Triangle t5= new Triangle(70,30,80);
        Triangle t6= new Triangle(90,60,30);
       
 	  String actualt = Triangle.GetTypeTriangle(t);
 	  String actualt1 = Triangle.GetTypeTriangle(t1);
 	  String actualt2 = Triangle.GetTypeTriangle(t2);
 	  String actualt3= Triangle.GetTypeTriangle(t3);
 	  String actualt4 = Triangle.GetTypeTriangle(t4);
	  String actualt5 = Triangle.GetTypeTriangle(t5);
	  String actualt6= Triangle.GetTypeTriangle(t6);
	 
 	  
	    
	    String expectedt ="isosceles,rectangle";
	    String expectedt1="equilateral,acute-angled";
	    String expectedt2="isosceles,obtuse-angled";
	    String expectedt3="isosceles,acute-angled";
	    String expectedt4="scalene,obtuse-angled";
	    String expectedt5="scalene,acute-angled";
	    String expectedt6="scalene,rectangle";
	   
	    assertEquals(expectedt, actualt);
	    assertEquals(expectedt1, actualt1);
	    assertEquals(expectedt2, actualt2);
	    assertEquals(expectedt3, actualt3);
	    assertEquals(expectedt4, actualt4);
	    assertEquals(expectedt5, actualt5);
	    assertEquals(expectedt6, actualt6);
	  
	}

}
