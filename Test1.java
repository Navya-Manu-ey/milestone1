package milestone;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	
	

	
	    // Method to read and display base fares from a movie.txt file
	    public static void displayFares() {
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("movie.txt"));
	            String line;
	            System.out.println("Base Fares:");
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                System.out.println("MoviID: " + parts[0] + ", Base Fare: " + parts[1]);
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println(" ");
	        }
	    }
	    public static void main(String[] args) {
	        // Sample inputs
	        int movield1 = 104;
	        int noOfTickets1 = 5;
	        
	        int movield2 = 102;
	        int noOfTickets2 = 4;
	        
	        int movield3 = 103;
	        int noOfTickets3 = 8;
	        // Creating BookMyMovie objects
	        BookMyMovieImpl booking1 = new BookMyMovieImpl(movield1, noOfTickets1);
	        BookMyMovieImpl booking2 = new BookMyMovieImpl(movield2, noOfTickets2);
	        BookMyMovieImpl booking3 = new BookMyMovieImpl(movield3, noOfTickets3);
	        // Calculate ticket amounts
	        booking1.calculateTicketAmount();
	        booking2.calculateTicketAmount();
	        booking3.calculateTicketAmount();
	        // Display total amount for each booking
	        System.out.println("Output for BookMyMovie object 1:");
	        System.out.println("Total amount for booking: " + booking1.getTotalAmount());
	        System.out.println("Output for BookMyMovie object 2:");
	        System.out.println("Total amount for booking: " + booking2.getTotalAmount());
	        System.out.println("Output for BookMyMovie object 3:");
	        System.out.println("Total amount for booking: " + booking3.getTotalAmount());
	        
	        // Display base fares
	        displayFares();
	    }
	}


