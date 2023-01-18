package com.velocity.dhiraj.testing;

import java.util.ArrayList;

public class Write {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Dhiraj");
		list.add(259);
		list.add("Varape");
		list.remove(0);
		list.add(0, "Welcome");
		
		list.add(24);
		list.add("Java");
		System.out.println(list);
	}

}
