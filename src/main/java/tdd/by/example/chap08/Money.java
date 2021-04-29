package tdd.by.example.chap08;

public abstract class Money {
	protected double amount;
	
	public boolean equals(Object object) {
		Money another = (Money) object;
		return amount == another.amount &&
				getClass().equals(another.getClass());
	}
	
	public abstract Money times(int multiplier);
	
	public static Dollar dollar(double amount) {
		return new Dollar(amount);
	}
}
