package tdd.by.example.chap04;

public class Dollar {
	private double amount;
	
	Dollar(double amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Dollar another = (Dollar) object;
		return amount == another.amount;
	}
}
