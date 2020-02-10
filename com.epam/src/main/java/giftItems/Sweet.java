package giftItems;
import java.util.ArrayList;

import Kaushik_kumar_Maven-OOP.Gift;

public class Sweet extends Gift{
	
	public Sweet() {
		chocolates = new ArrayList<Dairymilk>();
//		candies = new ArrayList<Candie>();
	}
	
	public void addChocolates(ArrayList<Dairymilk> chocolates) {
		this.chocolates = chocolates;
	}
	
//	public void addCandies(ArrayList<Candie> candies) {
//		this.candies = candies;
//	}
	
	public void addTotalWeight(double weight) {
		this.totalWeight += weight;
	}
	
	public void addTotalCost(double cost) {
		this.totalCost += cost;
	}
	
	public ArrayList<Dairymilk> getChocolates() {
		return chocolates;
	}
	
//	public ArrayList<Candie> getCandies() {
//		return candies;
//	}
	
	double getCost() {
		return cost;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public double getTotalWeight() {
		return totalWeight;
	}
	
	public void printChocolates() {
		for(Dairymilk choco: chocolates) {
			System.out.println(choco.toString());
		}
	}
	
//	public void printCandies() {
//		for(Candie candie: candies) {
//			System.out.println(candie.toString());
//		}
//	}
}