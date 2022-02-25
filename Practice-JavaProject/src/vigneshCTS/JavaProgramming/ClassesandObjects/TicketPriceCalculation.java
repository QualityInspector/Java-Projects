package vigneshCTS.JavaProgramming.ClassesandObjects;

import java.util.Scanner;

public class TicketPriceCalculation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no of bookings:");
		int noOfBookings = scan.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets = scan.nextInt();

		Ticket.setAvailableTickets(availableTickets);

		Ticket ticket = new Ticket();

		for (int i = 0; i < noOfBookings; i++) {

			System.out.println("Enter the ticketid:");
			int ticketId = scan.nextInt();
			ticket.setTicketid(ticketId);

			System.out.println("Enter the price:");
			int ticketPrice = scan.nextInt();
			ticket.setPrice(ticketPrice);

			System.out.println("Enter the no of tickets:");
			int noOfTickets = scan.nextInt();

			System.out.println("Available tickets: " + Ticket.getAvailableTickets());
			System.out.println("Total amount:" + ticket.calculateTicketCost(noOfTickets));
			System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());

		}

	}

}
