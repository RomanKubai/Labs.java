package ua.lviv.iot.lab2;

public class Salad extends dishinf {
	private boolean green;
		
	public Salad(String name, float price, float weight, float cookingTime,
            boolean vegeterian, String cuisine,DishType dishType, boolean green) {
		super(name, price, weight, cookingTime, vegeterian, cuisine, dishType);
		this.green=green;
	}
	@Override
	public String toString() {
		return "Name " + name + " ,price " + price + " ,weight "+ weight+ 
	   " ,Cooking Time "+ cookingTime + " ,Vegeterian "+ vegeterian +" ,Cnuisine "+ cuisine+ " ,Dish type "+ dishType + " ,green "+
				green;
	}
}
