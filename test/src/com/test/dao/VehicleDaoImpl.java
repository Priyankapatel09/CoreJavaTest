package com.test.dao;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.test.pojo.Vehicles;

public class VehicleDaoImpl implements VehicleDao{

	Vehicles v =new Vehicles();
	public void addVehicle() {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Vehicle name");
		String name=sc.next();
		v.setVehicleName(name);
		System.out.println("Enter Vehicle type");
		String type=sc.next();
		v.setVehicleType(type);
		System.out.println("Enter Vehicle price");
		long price=sc.nextLong();
		v.setVehiclePrice(price);
	
	}

	
	public static void main(String var[])
	{
		VehicleDaoImpl vd=new VehicleDaoImpl();
		vd.addVehicle();
		
		
		List<Integer>l=new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		
		Iterator<Integer>i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
