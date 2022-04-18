package ua.lviv.iot.lab2;

public class Dessert extends dishinf {
	private boolean berries;
	private boolean sugar;
	private boolean cold;
	public Dessert(String name, float price, float weight, float cookingTime,
            boolean vegeterian, String cuisine,DishType dishType, boolean berries, boolean sugar, boolean cold) {
		super(name, price, weight, cookingTime, vegeterian, cuisine, dishType);
		this.berries=berries;
		this.sugar=sugar;
		this.cold=cold;
	}
	@Override
	public String toString() {
		return "Name " + name + " ,price " + price + " ,weight "+ weight + 
	   " ,Cooking Time "+ cookingTime + " ,Vegeterian "+ vegeterian +" ,Cnuisine "+ cuisine+ " ,Dish type "+ dishType+ " ,Berries "+ berries+
	   " ,Sugar "+ sugar + " ,Cold "+cold;
	}
	
}
