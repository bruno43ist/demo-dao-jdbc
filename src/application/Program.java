package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller sel = new Seller(1, "Alex", "alex@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj);
		System.out.println(sel);

	}

}
