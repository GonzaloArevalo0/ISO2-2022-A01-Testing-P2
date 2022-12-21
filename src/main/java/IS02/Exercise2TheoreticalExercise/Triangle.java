package IS02.Exercise2TheoreticalExercise;

public class Triangle {
	
	public float angle1;
	public float angle2;
	public float angle3;
	
	public Triangle(float angle1,float angle2,float angle3) {
		this.angle1=angle1;
		this.angle2=angle2;
		this.angle3=angle3;
	}
  
  public float getangle1() {
	  return angle1;
  }
  public float getangle2() {
	  return angle2;
  }
  public float getangle3() {
	  return angle3;
  }
  public boolean isValid(){
	  boolean valid=false;
	  if(angle1+angle2+angle3==180) {
		  valid=true;
	  }
	  return valid;
	  
  }
	public static String GetTypeTriangle(Triangle tri)  {
		String Type="";
		try {
	    	if(tri.getangle1()<=0 || tri.getangle2()<=0 || tri.getangle3()<=0 || !tri.isValid() ) {
		    	throw new TriangleException("Numbers cannot be negative or 0 or the sum of the angles must be 180 ");}
	    	}
	    	   	catch (TriangleException e) {
	   		System.out.println("Invalid input: " + e.getMessage());}
	   	if(tri.getangle1()==60 && tri.getangle2()==60 && tri.getangle3()==60) {
	   		Type+="equilateral,acute-angled";}
		else if((tri.getangle1()==tri.getangle2() || tri.getangle2()==tri.getangle3() || tri.getangle1()==tri.getangle3()) )	{
					if(tri.getangle1()>90 || tri.getangle2()>90 || tri.getangle3()>90) {
						Type="isosceles,obtuse-angled";
						}
					else if(tri.getangle1()==90 || tri.getangle2()==90 || tri.getangle3()==90) {
						Type="isosceles,rectangle";
					}
					else {
						Type="isosceles,acute-angled";
					}
							
					}
		else {
			if(tri.getangle1()>90 || tri.getangle2()>90 || tri.getangle3()>90) {
				Type="scalene,obtuse-angled";
				}
			else if(tri.getangle1()==90 || tri.getangle2()==90 || tri.getangle3()==90) {
				Type="scalene,rectangle";
			}
			else {
				Type="scalene,acute-angled";
			}
					
			}
		return Type;
		}

	}
			
		
		