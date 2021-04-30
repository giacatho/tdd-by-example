package tdd.by.example.chap09;

public class Dollar extends Money {	
	Dollar(double amount, String currency) {
		super(amount, currency);
	}
	
	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}
}
