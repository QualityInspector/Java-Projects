package vigneshCTS.CppProgramming;

import java.util.Scanner;

public class CPP4_Shop 
{
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the item name");
		String itemName=scan.next();
		System.out.println("Enter the item quantity:");
		String itemQuantity=scan.next();
		System.out.println("Enter the item price");
		double itemPrice=scan.nextDouble();
		
		Shop shop= new Shop();
		shop.setItemName(itemName);
		shop.setItemPrice(itemPrice);
		shop.setItemQuantity(itemQuantity);
		
		System.out.println("Item Name: "+shop.getItemName()+"\n"+"Item Quantity: "+shop.getItemQuantity()+"\n"+"Item Price: "+(int)shop.getItemPrice());
		
		
	}

}
