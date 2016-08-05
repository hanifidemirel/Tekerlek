package com.denofprogramming.learnomg.domain;

import java.math.BigDecimal;

public class Money {

	private Long id;
	
	private BigDecimal amount = BigDecimal.ZERO;
	private String currency = "USD";
	
	
	public Money (){		
	}
	
	public Money(final String currency, final String value){
		this.currency = currency;
		this.amount = new BigDecimal(value);
	}
	
	public String getValue(){
		return this.amount.toPlainString();
	}
	
	public String getCurrency(){
		return this.currency;
	}
	
	public String asPlainString(){
		return getCurrency() + " " + getValue();
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + "[value:" + this.getValue() + ", Currency:" + this.currency + "]";
	}
	
	public static Money valueOf(final String currency, final String value){
		return new Money(currency, value);
	}
	
}
