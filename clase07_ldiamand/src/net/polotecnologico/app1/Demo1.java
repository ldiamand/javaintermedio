package net.polotecnologico.app1;

//import java.util.*;
//import java.sql.Date;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Demo1 {

	public static void main(String[] args) {
		Date fecha = new Date();
		java.sql.Date fecha2 = new java.sql.Date(7);
		Scanner s = new Scanner(System.in);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_WEEK, 15);
		System.out.println(c.getTime());
		
	}
}
