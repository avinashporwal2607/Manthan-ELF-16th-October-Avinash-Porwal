package com.manthan.bean.hotelinfo;

public class HotelInfoBean {
	private int item_code;
	private String food_name;
	private double price;
	public int getItem_code() //Getters method
	{
		return item_code;
	}
	public void setItem_code(int item_code) //Setters method
	{
		this.item_code = item_code;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) 
	{
		this.food_name = food_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}//end of HotelInfoBean Class
