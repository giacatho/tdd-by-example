package tdd.by.example.chap08;

public class Dollar extends Money {	
	Dollar(double amount) {
		this.amount = amount;
	}
	
	public Money times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
