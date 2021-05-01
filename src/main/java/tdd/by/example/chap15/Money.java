package tdd.by.example.chap15;

class Money implements Expression {
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
	
	public Expression plus(Money addend) {
		return new Sum(this, addend);
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

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
