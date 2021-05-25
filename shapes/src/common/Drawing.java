package common;

public class Drawing {

	public static void main(String[] args) {
		
		//	Person p = new Person();
		/*
	      // create some shape instances
	      Shape scribble[] = new Shape[2];
	      scribble[0] = new Rectangle(10, 20, 5, 6);
	      scribble[1] = new Circle(15, 25, 8);
	      

	      
	      // iterate through the list and handle shapes polymorphically
	      for (int i = 0; i < scribble.length; i++) {
	         scribble[i].draw();
	         scribble[i].rMoveTo(100, 100);
	         scribble[i].draw();
	      }
	      */
	      // example of why we use constructors
	      //String circleName = ((Circle) scribble[1]).getName();
	      Circle circle = new Circle(1,2,3, "Pacman");
	      //circle.setName();
	      String circleName = circle.getName();
	      System.out.println("What is your name? " +circleName);
	      if(circleName.equals("Pacman"))
	    	  System.out.println("Nom, nom, nom...");
	     
	     
	      /*
	      // call a rectangle specific function
	      Rectangle arect = new Rectangle(0, 0, 15, 15);
	      arect.setWidth(30);
	      arect.draw();*/

	}

}
