package tdd.by.example.chap08;

public class Franc extends Money {
	Franc(double amount) {
		this.amount = amount;
	}
	
	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}
}
