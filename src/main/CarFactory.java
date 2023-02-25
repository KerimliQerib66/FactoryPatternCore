package main;

public class CarFactory {
public ICar getobject(String mark,String color,double price,int modelyear,boolean backupcamera)
{
	if(mark.equals("BMW")) {
		return new BMW(color,price,modelyear,backupcamera);
	}
	else if(mark.equals("Audi")) {
		return new Audi(color,price,modelyear,backupcamera);
	}
	else {
		 throw new RuntimeException(mark+" bele bir marka yoxdur");
	}
}
}
