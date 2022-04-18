package ua.lviv.iot.lab2;

public class Soup extends dishinf{
	private boolean green;
	private boolean sourCream;
	private String color;
	
	public Soup(String name, float price, float weight, float cookingTime,
            boolean vegeterian, String cuisine, DishType dishType, boolean green, boolean sourCream, String color) {
		super(name, price, weight, cookingTime, vegeterian, cuisine, dishType);
		this.green=green;
		this.sourCream=sourCream;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Name " + name + " ,price " + price + " ,weight "+ weight + 
	   " ,Cooking Time "+ cookingTime + " ,Vegeterian "+ vegeterian +" ,Cnuisine "+ cuisine+ " ,Dish type "+ dishType + " ,green "+
				green + " ,cream "+ sourCream + " ,color "+ color;
	}
	
}
