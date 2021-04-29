package tdd.by.example.chap06;

public class Franc extends Money {
	Franc(double amount) {
		this.amount = amount;
	}
	
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
}
