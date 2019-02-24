package test.com;

import java.util.Scanner;

class CalcuateDiscount {
	double amount;

	CalcuateDiscount(double markedPrice, double s) {
		amount = (s * markedPrice) / 100;
	}

}

public class Discount {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		boolean quit = false;
		int sum = 0;
		int pendrive = 200, CD = 20, laptop = 400, phone = 100;
		String order = "";
		
		System.out.println();
		System.out.println("List of menu items");
		System.out.println();
		System.out.println("ITEM" + "\t\t\tPrice");
		System.out.println("1.pendrive"+"\t\t"+"200");
		System.out.println("2.CD" + "\t\t\t" + "20");
		System.out.println("3.laptop" + "\t\t" + "400");
		System.out.println("4.phone" + "\t\t\t" + "100");
		System.out.println("5.Quit");
		System.out.println();
		
		do {
			

			int choice = input.nextInt();

			switch (choice) {
			case 1:
				//System.out.println("pendrive");
				sum = sum + pendrive;
				order = order.concat("pendrive" + "\n");

				break;
			case 2:
				//System.out.println("CD");
				sum = sum + CD;
				order = order.concat("CD" + "\n");

				break;
			case 3:
				//System.out.println("laptop");
				sum = sum + laptop;
				order = order.concat("laptop" + "\n");
				break;
			case 4:
				//System.out.println("phone");
				sum = sum + phone;
				order = order.concat("phone" + "\n");
				break;
			case 5:
				quit = true;

				break;
			default:
				System.out.println("Wrong input");
			}

		} while (!quit);

		System.out.println("Your Orders are:\n" + order);
		System.out.println("Your total bill=" + sum);
		
        double dis, markedprice, s;
        markedprice = sum;

		System.out.println("markedprice= " + markedprice);
		System.out.println("");
		CalcuateDiscount c = null;

		String user[] = { "employee", "twoYearCustomber", "affiliatedCustomber" };
		for (String customber : user) {
			switch (customber) {
			case "employee":
				System.out.println("employee :");
				dis = 30;
				System.out.println("discount rate=" + dis);
				s = 100 - dis;
				c = new CalcuateDiscount(markedprice, s);
				break;
			case "twoYearCustomber":
				System.out.println("twoYearCustomber :");
				dis = 5;
				System.out.println("discount rate=" + dis);
				s = 100 - dis;
				c = new CalcuateDiscount(markedprice, s);
				break;
			case "affiliatedCustomber":
				System.out.println("affiliatedCustomber :");
				dis = 10;
				System.out.println("discount rate=" + dis);
				s = 100 - dis;
				c = new CalcuateDiscount(markedprice, s);
				
				break;
			default:
				System.out.println("default :");
				dis = 5;
				System.out.println("discount rate=" + dis);
				s = 100 - dis;
				c = new CalcuateDiscount(markedprice, s);
				
			}

			System.out.println("amount after discount=" + c.amount);
			System.out.println("");
		}
	}
}
