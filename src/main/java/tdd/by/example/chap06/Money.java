package tdd.by.example.chap06;

public class Money {
	protected double amount;
	
	public boolean equals(Object object) {
		Money another = (Money) object;
		return amount == another.amount;
	}
}
