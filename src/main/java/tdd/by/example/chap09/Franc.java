package tdd.by.example.chap09;

public class Franc extends Money {
	Franc(double amount, String currency) {
		super(amount, currency);
	}
	
	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}
