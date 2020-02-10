package giftItems;

//public class Dairymilk {
//
//}
public class Dairymilk extends Sweet implements Comparable<Dairymilk>{

	
//	private String name;
//    private int price;
//    private int weight;
	public Dairymilk(String name, double cost, double weight) {
//		this.name = name;
		this.name=name;
		this.cost = cost;
		this.weight = weight;
	}
	
	public Dairymilk() {
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Dairymilk o) {
		return (this.getCost() < o.getCost() ? -1 :
            (this.getCost() == o.getCost() ? 0 : 1));
	}
	

	public String toString() {
        return "Dairymilk { " +
                "Name = '" + name + '\'' +
                ", Cost = ₹" + cost +
                " /-, Weight = " + weight + " grams };";
    }
	

	public void addTotalWeight(double weight) {
		this.totalWeight += weight;
	}
	
	public double getTotalWeight() {
		return this.totalWeight;
	}
	

	public void addTotalCost(double weight) {
		this.totalCost += cost;
	}
	
	public double getTotalCost() {
		return this.totalCost;
	}
}