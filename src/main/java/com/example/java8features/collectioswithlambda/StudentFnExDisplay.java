package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentFnExDisplay {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		populate(stuList);

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A(Distiction)";
			} else if (marks >= 60) {
				return "B(First class)";
			} else if (marks > 50) {
				return "C(Second class)";
			} else if (marks > 35) {
				return "D(Third class)";
			} else {
				return "E(Failed)";
			}

		};


		for(Student se:stuList){
			System.out.println("STUDENT NAME :"+se.name);
			System.out.println("STUDENT MARKS :"+se.marks);
			System.out.println("STUDENT GRADE :"+f.apply(se));
		}
		//Using Consumer Student display
		Consumer<Student> c=s->{
			System.out.println("STUDENT NAME :"+s.name);
			System.out.println("STUDENT MARKS :"+s.marks);
			System.out.println("STUDENT GRADE :"+f.apply(s));

		};



		Predicate<Student> p=s2->s2.marks>=60;
		for(Student stu:stuList){
			if(p.test(stu)){
				c.accept(stu);
			}

		}


	}

	public static void populate(ArrayList<Student> stuList){

		stuList.add(new Student("sunny",100));
		stuList.add(new Student("chinny",65));
		stuList.add(new Student("vinny",55));
		stuList.add(new Student("bunny",45));
		stuList.add(new Student("pinny",25));


	}
}
