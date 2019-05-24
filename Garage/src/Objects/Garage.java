package Objects;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	public void setGarageList(ArrayList<Vehicle> garage) {
		this.garage = garage;
	}

	public ArrayList<Vehicle> getGarageList() {
		return garage;
	}

	public void addVehicle(Object input) {
		this.getGarageList().add((Vehicle) input);
	}

	public void deleteVehicle(Object input) {
		this.getGarageList().remove(input);
	}

	public double totalVehicle() {
		double output = 0;

		for (Vehicle v : garage) {
			if (v instanceof Vehicle) {
				output = output + v.getPrice() * ((Vehicle) v).getDateMade();
			}
		}
		return output;
	}

	public void deleteGarage() {
		garage.clear();
	}

	// public void vehiclePriceCar() {
	// double price = 0;
	// for (Vehicle v : vehicle) {
	// if (v.getClass().getCanonicalName().equals("Objects.Car")) {
	// price = price + v.getPrice();
	// }
	// }
	// System.out.println(price);
	// }
	//
	// public void vehiclePriceBoat() {
	// double price = 0;
	// for (Vehicle v : vehicle) {
	// if (v.getClass().getCanonicalName().equals("Objects.Boat")) {
	// price = price + v.getPrice();
	// }
	// }
	// System.out.println(price);
	// }
	//
	// public void vehiclePricePlane() {
	// double price = 0;
	// for (Vehicle v : vehicle) {
	// if (v.getClass().getCanonicalName().equals("Objects.Plane")) {
	// price = price + v.getPrice();
	// }
	// }
	// System.out.println(price);
	// }

	public double vehicleDoor() {
		double price = 0;

		for (Vehicle v : garage) {
			if (v instanceof Car) {
				price = price + v.getPrice() * ((Car) v).getDoorCount();
			}
		}
		return price;
	}

	public double vehicleSpeed() {
		double price = 0;

		for (Vehicle v : garage) {
			if (v instanceof Boat) {
				price = price + v.getPrice() / ((Boat) v).getSpeed();
			}
		}
		return price;
	}

	public double vehicleWingCount() {
		double price = 0;
		for (Vehicle v : garage) {
			if (v instanceof Plane) {
				price = price + v.getPrice() + ((Plane) v).getWingCount() * 10;
			}
		}
		return price;
	}
	// public ArrayList<Vehicle> garageDeleteType(String type) {
	//
	// }
}