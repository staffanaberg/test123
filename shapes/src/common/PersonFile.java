package common;

public class PersonFile {

	public static void main(String[] args) {
		
		
		/*Person calle = new Person("Calle");

		System.out.println("The person's name is: " +calle.getName());
		*/
		Book drGlas = new Book("Hjalmar Söderberg", "Dr. Glas", 1905);
		
		System.out.println("Author: " +drGlas.getAuthor());
		System.out.println("Title: " +drGlas.getTitle());
		System.out.println("Year: " +drGlas.getYear());
		
	}

}
