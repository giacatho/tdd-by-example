package tdd.by.example.chap02;

public class Dollar {
	public double amount;
	
	Dollar(double amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
