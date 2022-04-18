package ua.lviv.iot.lab2;

public class Main {

	public static void main(String[] args) {
		dishinf borshch = new Soup("Borshch", 25, 500, 35, false, "UA", DishType.FIRST_COURSE, true, true, "red");
		System.out.println(borshch);
		
		dishinf ñaesar = new Salad ("Caesar", 58, 200, 20, true, "North America", DishType.SALAD, true);
		System.out.println(ñaesar);
		
		dishinf oliver = new Salad ("Oliver", 40, 150, 20, false, "USSR", DishType.SALAD, false);
		System.out.println(oliver);
		dishinf napoleon = new Dessert("Napoleon", 45, 100, 50, true, " ", DishType.DESSERT, false, true, false);
		System.out.println(napoleon);
	
	}

}
