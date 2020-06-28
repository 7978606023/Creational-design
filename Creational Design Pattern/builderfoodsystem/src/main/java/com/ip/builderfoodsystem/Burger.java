package com.ip.builderfoodsystem;

public abstract class Burger implements Items {

	 @Override
	   public Packing packing() {
	      return new Wraper();
	   }
	 @Override
	   public abstract float price();
}
