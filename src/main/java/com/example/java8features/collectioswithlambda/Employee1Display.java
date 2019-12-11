package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee1Display {
	public static void main(String[] args){
		ArrayList<Employee1> emplist=new ArrayList<>();
		populate(emplist);
		System.out.println(emplist);
		Predicate<Employee1> p=e->e.designation.equals("admin");
		System.out.println("Admin Information");
		display(p,emplist);
		//System.out.println(emplist);
		System.out.println("Hyd Emp Information");
		Predicate<Employee1> p2=e->e.city.equals("hyd");
		display(p2,emplist);
		Predicate<Employee1> p3=e->e.salary<20000;
		System.out.println("All emp info whose salary is less than 20000");
		display(p3,emplist);
		System.out.println("p and p2");
		display(p.and(p2),emplist);

		System.out.println("Admin or <20000 salary");
		display(p.or(p3),emplist);
		System.out.println("All emp who not admin");
		display(p.negate(),emplist);

	}

	public static void display(Predicate<Employee1> p,ArrayList<Employee1> list){
				for(Employee1 e:list){
                  if(p.test(e)){
					  System.out.println("TEST");
					  System.out.println(e);
                  }
				}

	}

	public static void populate(ArrayList<Employee1> emp){
		emp.add(new Employee1("lalitha","it",20000,"Vij"));
		emp.add(new Employee1("susmitha","admin",30000,"hyd"));
		emp.add(new Employee1("jaya","manager",40000,"Mel"));
		emp.add(new Employee1("ramya","admin",50000,"mud"));
		emp.add(new Employee1("sowji","it",10000,"syd"));
	}
}
