package milestone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// Custom exception class for invalid movie IDs
class InvalidMovieldException extends Exception {
    public InvalidMovieldException(String message) {
        super(message);
    }
}
// BookMyMovie interface
interface BookMyMovie {
    void calculateTicketAmount();
}
// BookMyMovie implementation class
class BookMyMovieImpl implements BookMyMovie {
    private int movield;
    private int noOfTickets;
    private double discount;
    private double totalAmount;
    // Constructor
    public BookMyMovieImpl(int movield, int noOfTickets) {
        this.movield = movield;
        this.noOfTickets = noOfTickets;
        this.discount = 0.0; // default discount
        this.totalAmount = 0.0; // default total amount
    }
    // Getters and setters
    public int getMovield() {
        return movield;
    }
    public void setMovield(int movield) {
        this.movield = movield;
    }
    public int getNoOfTickets() {
        return noOfTickets;
    }
    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    // Method to calculate discount based on movie ID and number of tickets
    public void calculateDiscount() {
        if ((movield == 101 || movield == 103) && noOfTickets < 5) {
            discount = 0;
        } else if ((movield == 101 || movield == 103) && noOfTickets >= 5 && noOfTickets < 10) {
            discount = 15;
        } else if ((movield == 101 || movield == 103) && noOfTickets >= 10 && noOfTickets <= 15) {
            discount = 20;
        } else if (movield == 102 && noOfTickets >= 5 && noOfTickets < 10) {
            discount = 10;
        } else if (movield == 102 && noOfTickets >= 10 && noOfTickets <= 15) {
            discount = 15;
        }
    }
    // Method to calculate ticket amount
    public void calculateTicketAmount() {
        // Call calculateDiscount() to set the discount
        calculateDiscount();
        
        // Define base fares
        double baseFare = 0.0;
        if (movield == 101) {
            baseFare = 120;
        } else if (movield == 102) {
            baseFare = 170;
        } else if (movield == 103) {
            baseFare = 150;
        }
        
        // Calculate total amount
        totalAmount = baseFare * noOfTickets * (1 - discount / 100.0);
    }
}
// Tester class



		
	


