package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }

    public BigDecimal getPrice() {
        return price;
    }
    @Override//use this keyword to have the compiler check for you
	public String eat() {
		return "Amble over to the trough and get some slop";
	}
}