package vigneshCTS.JavaProgramming.ClassesandObjects;

public class Ticket 
{
	
	private int ticketid;
	private int price;
	private static int availableTickets;

	
	// set the value for the above variables
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public static void setAvailableTickets(int availableTickets) {
		
		Ticket.availableTickets = availableTickets;
		
		if(availableTickets<1)
			System.out.println("Tickets not available");
		
		
	}
	
	
	// get the values set by setters
	
	public int getTicketid() {
		return ticketid;
	}

	public int getPrice() {
		return price;
	}
	
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	
	public int calculateTicketCost(int noOfTickets)
	{
	
		if(availableTickets>noOfTickets)
		{
			availableTickets=availableTickets-noOfTickets;
		
		return price*noOfTickets;
		}
		else return -1;
		
	}
	
	
	

}
