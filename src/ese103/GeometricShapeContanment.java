package ese103;

import java.io.*;
import geometricshapes.*;

public class GeometricShapeContanment {

	public GeometricShapeContanment(final String[] args) throws IOException {
		
	Circle circleArray[] = new Circle [3];
	
	circleArray[0] =new Circle (0,1,2);
	circleArray[1] =new Circle (2,1,2);
	
	Circle a,b ;
	
	for (int i=0; i<circleArray.length; i++){
		a = circleArray[i];
		b = circleArray[(i+1) % circleArray.length];
		
		if(a.contains(b)){
			System.out.println(a + " contiene " + b);
		}
		else{
			System.out.println(a + " NON contiene " + b);
		}

		
		}
	}
}

	
	
	
	   