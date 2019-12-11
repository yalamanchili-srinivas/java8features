package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDisplay {

	public static void main(String[] args){
	//	Employee e=new Employee(1,"lalitha");
	//	System.out.println(e);
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(100,"lalitha"));
		arrayList.add(new Employee(300,"susmitha"));
		arrayList.add(new Employee(200,"siri"));
		arrayList.add(new Employee(500,"jaya"));
		arrayList.add(new Employee(400,"ramya"));
		Collections.sort(arrayList,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(arrayList);

	}
}
