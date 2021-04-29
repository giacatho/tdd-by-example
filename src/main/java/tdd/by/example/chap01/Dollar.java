package tdd.by.example.chap01;

public class Dollar {
	public double amount;
	
	Dollar(int amount) {
		this.amount = amount;
	}
	
	void times(int multiplier) {
		amount *= multiplier;
	}
}
