class Bank {
	int actNo=1325470;
	
	public void print() {
		System.out.println("account num "+actNo);
	}
}
class GoldLoan extends Bank {
	int goldNo=12365;
	public void print() {
		System.out.println("gold num "+goldNo);
	}
}
class VehicleLoan extends Bank {
	int vehNo=1670;
	public void print() {
		System.out.println("vehicle num "+vehNo);
	}
}

class HouseLoan extends Bank {
	int houseNo=592;
	public void print() {
		System.out.println("house num "+houseNo);
	}
}



public class Hierarchial {

	public static void main(String[] args) {
		Bank b1 = new Bank();
		GoldLoan  b2 = new GoldLoan();
		VehicleLoan b3 = new VehicleLoan();
		HouseLoan b4 = new HouseLoan();
		b1.print();
		b2.print();
		b3.print();
		b4.print();

	}

}
