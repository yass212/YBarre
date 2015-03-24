package com.JPM.Spring.yassinBarre.FileProcessing.model;

/*@Auther: Y Barre
 *@Date: 18/03/15*/

public class Item {

	private String instrument_type;
	private String name;
	private int quantity;
	private String buy_price;
	private String sell_price;
	private String coupon;
	private double profit;

	// overloaded constructor
	public Item(String instrument_type, String name, int quantity,
			String buy_price, String sell_price, String coupon, double profit) {
		super();
		this.instrument_type = instrument_type;
		this.name = name;
		this.quantity = quantity;
		this.buy_price = buy_price;
		this.sell_price = sell_price;
		this.coupon = coupon;
		this.profit = profit;
	}

	// public constructor
	public Item() {
	}

	// getters and setters
	public String getInstrument_type() {
		return instrument_type;
	}

	public void setInstrument_type(String instrument_type) {
		this.instrument_type = instrument_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBuy_price() {
		return buy_price;
	}

	public void setBuy_price(String buy_price) {
		this.buy_price = buy_price;
	}

	public String getSell_price() {
		return sell_price;
	}

	public void setSell_price(String sell_price) {
		this.sell_price = sell_price;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	// ToString method
	@Override
	public String toString() {
		return "Item [instrument_type=" + instrument_type + ", name=" + name
				+ ", quantity=" + quantity + ", buy_price=" + buy_price
				+ ", sell_price=" + sell_price + ", coupon=" + coupon
				+ ", profit=" + profit + "]";
	}

}
