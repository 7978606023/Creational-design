package com.ip.builderfoodsystem;

public abstract class ColdDrink implements Items {
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}
