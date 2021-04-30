package tdd.by.example.chap09;

public abstract class Money {
	protected double amount;
	protected String currency;
	
	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money another = (Money) object;
		return amount == another.amount &&
				getClass().equals(another.getClass());
	}
	
	public abstract Money times(int multiplier);
	
	public static Dollar dollar(double amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Franc franc(double amount) {
		return new Franc(amount, "CHF");
	}
	
	String currency() {
		return currency;
	}
}
