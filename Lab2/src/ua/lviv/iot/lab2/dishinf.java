package ua.lviv.iot.lab2;

public abstract class dishinf {
	protected String name;
	protected float price;
	protected float weight;
	protected float cookingTime;
	protected boolean vegeterian;
	protected String cuisine;
	DishType dishType;
	
    protected dishinf(String name, float price, float weight,float cookingTime,
	                 boolean vegeterian, String cuisine, DishType dishType) {
	this.name=name;
	this.price=price;
	this.weight=weight;
	this.cookingTime=cookingTime;
	this.vegeterian=vegeterian;
	this.cuisine=cuisine;
	this.dishType=dishType;
	}

public String getName() {
	return name;
}
public void setName () {
	this.name=name;
}

public float getPrice() {
	return price;
}
public void setPrice () {
	this.price=price;
}

public float getWeight() {
	return weight;
}
public void setWeight () {
	this.weight=weight;
}
	
public float getCookingTime() {
	return cookingTime;
}
public void setCookingTime () {
	this.cookingTime=cookingTime;
	
}public boolean getVegeterian() {
	return vegeterian;
}
public void setVegeterian () {
	this.vegeterian=vegeterian;
	
}public String getCuisine() {
	return cuisine;
}
public void setCuisine () {
	this.cuisine=cuisine;
}public DishType getDishType() {
	return dishType;
}
public void setDishType () {
	this.dishType=dishType;
}
@Override
public String toString() {
	return "Name " + name + " ,price " + price + " ,weight "+ weight+ 
   " ,Cooking Time "+ cookingTime + " ,Vegeterian "+ vegeterian +" ,Cnuisine "+ cuisine+ " Dish type "+dishType;
}
}

