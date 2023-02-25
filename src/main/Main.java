package main;

public class Main {

	public static void main(String[] args) {
	CarFactory cr=new CarFactory();
	ICar car=cr.getobject("BMW", "Qara", 17000,2007 , false);
	System.out.println(car.getColor());
     car.showCarInfo();
	}

}
