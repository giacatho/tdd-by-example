package tdd.by.example.chap07;

public class Money {
	protected double amount;
	
	public boolean equals(Object object) {
		Money another = (Money) object;
		return amount == another.amount &&
				getClass().equals(another.getClass());
	}
}
