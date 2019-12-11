package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Function;

public class EmpfnBeanDisplay {
	public static void main(String[] args){
		ArrayList<EmpFnBean> list=new ArrayList<>();
		populate(list);
		Function<ArrayList<EmpFnBean>,Double> f=l1->{
			double total=0;
			for(EmpFnBean e:l1){
				total=total+e.salary;
			}
			return total;
		};
		System.out.println("total monthly salary"+f.apply(list));
	}
	public static void populate(ArrayList<EmpFnBean> list){
		list.add(new EmpFnBean("sunny" ,1000.0));
		list.add(new EmpFnBean("bunny" ,3000.0));
		list.add(new EmpFnBean("ponny" ,2000.0));
		list.add(new EmpFnBean("penny" ,5000.0));
		list.add(new EmpFnBean("vonny" ,4000.0));
	}
}
