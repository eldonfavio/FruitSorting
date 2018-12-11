//======================================================================================================
// File Name: FruitSortingProgram.java
// Author: Favian Ramirez
// Copyright: none
// Description: 
// Date              Version     Change ID          Author             Comment
// 12/6/18             1.0            		Favian Ramirez       Initial Creation
// 12/6/18             1.1              	Favian Ramirez       Created Different Classes
// 12/6/18             1.2			Favian Ramriez		  
// 12/6/18             1.3                  	Favian Ramirez        
// 12/6/18             1.4            		Favian Ramirez        
// 12/6/18             1.5              	Favian Ramirez    	  
// 12/6/18	       1.6			Favian Ramirez		  
// 12/6/18	       1.7			Favian Ramirez	  
// 12/6/18             1.8                  	Favian Ramirez        
// 12/6/18             1.9                  	Favian Ramirez    	  
// 12/6/18             1.10			Favian Ramirez		  
// 12/6/18	       1.11			Favian Ramirez		  
// 12/6/18	       1.12			Favian Ramirez		  
// 12/6/18	       1.13			Favian Ramirez		  
// 12/6/18	       1.14			Favian Ramirez		  
// 12/6/18	       1.15			Favian Ramirez		  
// 12/6/18	       1.16			Favian Ramirez		  
// 12/6/18	       1.17			Favian Ramirez		 
// 12/6/18	       1.18			Favian Ramirez		  
//======================================================================================================
import java.util.*;
import javax.swing.*;
public class FruitSortingProgram {
	public static void main(String[] args) {
		System.out.println("Here is your array of fruit");		
	}
}
class OnlineSuperMarket {	
	private static Fruit[] fruitOrder;
	private static String marketName = "Interstellar Fruit Bazaar";
	private static String webAddress = "http://www.interstellarfruitbazaar.com";
	private static final double TAX_RATE = 0.085;
	private static final int ARRAY_SIZE = 10;
	private static final double STOCK_WEIGHT_LOW = 0.0;
	private static final double STOCK_WEIGHT_HIGH = 25.0;
	public OnlineSuperMarket() {
		fruitOrder[ARRAY_SIZE] = new Fruit();
	}
	public String getMarketName() {
		return marketName;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public OnlineSuperMarket(String marketName, String webAddress) {
		setMarketName(marketName);
		setWebAddress(webAddress);
		this.fruitOrder = new Fruit[ARRAY_SIZE];
	}
	public String setMarketName(String marketName) {
		return this.marketName = marketName;
	}
	public String setWebAddress(String webAddress) {
		return this.webAddress = webAddress;
	}
	public static void init() {
		double weight = 0.0;
		double price = 0.0;	
		String[] fruitNames = {"apple", "banana", "kiwi", "mango", "grapefruit","orange"
				, "tomato", "kumquat", "tamarind"};	
		double priceRangeLow[] = {1.35, 1.52, 1.26, 2.00, 1.65, 1.84, 1.25, 1.40, 1.27, 1.86};
		double priceRangeHigh[] = {2.98, 2.35, 1.75, 2.50, 2.53, 2.35, 2.39, 2.27, 1.75, 2.79};
		Random generator = new Random();
		for(int i = 0; i<fruitNames.length; i++) {
			fruitOrder[i] = new Fruit();
			fruitOrder[i].setName(fruitNames[i]);
			price = priceRangeLow[i] + generator.nextDouble() * (priceRangeHigh[i] - priceRangeLow[i]);
			fruitOrder[i].setPrice(price);
			weight = STOCK_WEIGHT_LOW + generator.nextDouble() * (STOCK_WEIGHT_HIGH - STOCK_WEIGHT_LOW);
			fruitOrder[i].setWeight(weight);
		}
	}
	public static boolean sort(Fruit[] fruitOrder) {
		String temp = null;
		boolean changed = false;	 
	      for (int i = 0; i < ARRAY_SIZE; i++)
	         if (fruidOrder[i].compareToIgnoreCase(fruitOrder[i + 1]) > 0){
	            temp = fruitOrder[i];
	            fruitOrder[i] = fruitOrder[i + 1];
	            fruitOrder[i + 1] = temp;
	            changed = true;
	         }
	      return changed;
	}
	public static void run() {
		System.out.printf("%8s%n", marketName);
		System.out.printf("%8sn", webAddress);
		System.out.printf("%8%n", "Fruit Ordering");
		System.out.println("Enter a fruit name or XXX to end: ");	
	}
	public static void quit() {	
	}
}
class Fruit{
	private String fruitName;
	private double weight;
	private double unitPrice;
	public Fruit() {
		fruitName = "?";
		weight = 0.0;
		unitPrice = 0.0;
	}
	public String getName() {
		return fruitName;
	}
	public double getWeight() {
		return weight;
	}
	public double getPrice() {
		return unitPrice;
	}
	public Fruit(String fruitName, double weight, double unitPrice) {
		setName(fruitName);
		setWeight(weight);
		setPrice(unitPrice);
	}
	public String setName(String name) {
		return this.fruitName = name;
	}
	public double setWeight(double weight) {
		return this.weight = weight;
	}
	public double setPrice(double price) {
		return this.unitPrice = price;
	}
	public void order() {
		
	}
}
