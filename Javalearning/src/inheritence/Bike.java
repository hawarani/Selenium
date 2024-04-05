package inheritence;

public class Bike extends Vehicle {
	public Bike(String VehicleName,String brand,int No_of_Wheels,String colour,double cc) {
		this.VehicleName=VehicleName;
		this.brand=brand;
		this.no_of_wheels=no_of_wheels;
		this.colour=colour;
		this.cc=cc;
		System.out.println("Vehicle name:"+this.VehicleName+" "+"Brand:"+this.brand+" "+"No of wheels:"+this.no_of_wheels+" "+"colour:"+this.colour+" "+"cc:"+cc);
		
	}
}
