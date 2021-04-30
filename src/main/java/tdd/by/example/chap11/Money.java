package tdd.by.example.chap11;

class Money {
	protected double amount;
	protected String currency;
	
	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals(Object object) {
		Money another = (Money) object;
		return amount == another.amount &&
				currency == another.currency;
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public static Money dollar(double amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(double amount) {
		return new Money(amount, "CHF");
	}
	
	String currency() {
		return currency;
	}
}
