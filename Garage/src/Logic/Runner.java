package Logic;

import Objects.Boat;
import Objects.Car;
import Objects.Garage;
import Objects.Plane;

public class Runner {

	public static void main(String[] args) {
		Car vehicle1 = new Car("Mini Cooper", "Grey", 2005, 7500, "1500cc", 3, false);
		Car vehicle2 = new Car("Hyundai i30", "Black", 2014, 20000, "1250cc", 5, false);
		Car vehicle3 = new Car("Mercedes S Class", "Red", 2016, 30000, "1750cc", 5, true);
		Plane vehicle4 = new Plane("Boeing 747", "White", 1990, 143000000, 4, true, false);
		Plane vehicle5 = new Plane("Sopwith Camel", "Green", 1920, 100000, 2, false, true);
		Plane vehicle6 = new Plane("Hawk 200", "Black", 1974, 11000000, 4, true, false);
		Boat vehicle7 = new Boat("Narrowboat", "Red", 1980, 87000, false, "Riverboat", 1);
		Boat vehicle8 = new Boat("Queen Elizibeth", "White", 2009, 300000000, true, "Carrier", 18);
		Boat vehicle9 = new Boat("Lady Smith", "Blue", 1999, 100000000, true, "Cruiseliner", 24);

		Garage garage = new Garage();
		garage.addVehicle(vehicle1);
		garage.addVehicle(vehicle2);
		garage.addVehicle(vehicle3);
		garage.addVehicle(vehicle4);
		garage.addVehicle(vehicle5);
		garage.addVehicle(vehicle6);
		garage.addVehicle(vehicle7);
		garage.addVehicle(vehicle8);
		garage.addVehicle(vehicle9);

		System.out.println("---------------------------------------------------");
		// System.out.println(garage.getGarageList());
		System.out.println(vehicle1.toString());
		garage.deleteVehicle(vehicle1);
		System.out.println(garage.getGarageList());
		System.out.println("---------------------------------------------------");
		garage.deleteGarage();
		System.out.println(garage.getGarageList());
		System.out.println(garage.totalVehicle());

		// Q3)
		// System.out.println("---------------------------------------------------");
		// System.out.println(garage.vehicleDoor());
		// System.out.println(garage.vehicleSpeed());
		// System.out.println(garage.vehicleWingCount());
		// System.out.println("---------------------------------------------------");
		// System.out.println("---------------------------------------------------");
		// System.out.println(vehicle1.isCleanable());
		// System.out.println(vehicle4.isCleanable());
		// System.out.println(vehicle7.isCleanable());
		// System.out.println("---------------------------------------------------");
		// System.out.println("---------------------------------------------------");
		// garage.vehiclePriceBoat(garage.getGarageList());
		// garage.vehiclePricePlane(garage.getGarageList());
		// garage.vehiclePricePlane1();
		// vehicle1.setName("Mini Coupé");
		// System.out.println(vehicle1.getName());
		// System.out.println("---------------------------------------------------");
	}

}