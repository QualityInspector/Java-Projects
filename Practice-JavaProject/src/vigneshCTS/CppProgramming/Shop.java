package vigneshCTS.CppProgramming;

public class Shop {
	private String itemName;
	private String itemQuantity;
	private double itemPrice;

	void setItemName(String iname) {
		itemName = iname;
	}

	String getItemName() {

		return itemName;
	}

	void setItemQuantity(String iqty) {
		itemQuantity = iqty;
	}

	String getItemQuantity() {
		return itemQuantity;
	}

	void setItemPrice(double iprice) {
		itemPrice = iprice;
	}

	double getItemPrice() {

		return itemPrice;
	}

}
