package tdd.by.example.chap07;

public class Dollar extends Money {	
	Dollar(double amount) {
		this.amount = amount;
	}
	
	Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}
}
