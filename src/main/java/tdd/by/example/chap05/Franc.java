package tdd.by.example.chap05;

public class Franc {
	private double amount;
	
	Franc(double amount) {
		this.amount = amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc another = (Franc) object;
		return amount == another.amount;
	}
}
