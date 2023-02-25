package main;

public class Audi implements ICar{
	private String color;
	private double price;
	private int modelyear;
	private boolean backupcamera;

	public Audi(String color,double price,int modelyear,boolean backupcamera) {
		this.color=color;
		this.modelyear=modelyear;
		this.price=price;
		this.backupcamera=backupcamera;
	}
		@Override
		public String getColor() {
			// TODO Auto-generated method stub
			return color;
		}

		@Override
		public double getPrice() {
			// TODO Auto-generated method stub
			return price;
		}

		@Override
		public int modelYear() {
			// TODO Auto-generated method stub
			return modelyear;
		}

		@Override
		public boolean backupCamera() {
			// TODO Auto-generated method stub
			return backupcamera;
		}

		@Override
		public void showCarInfo() {
			// TODO Auto-generated method stub
			System.out.println("Avtomobil rengi: "+color);
			System.out.println("Avtomobil qiymeti: "+price);
			System.out.println("Avtomobil buraxilis ili: "+modelyear);
		}


}
