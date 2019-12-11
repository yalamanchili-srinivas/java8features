package com.example.java8features.collectioswithlambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpFnBeanSalIncrement {
	public static void main(String[] args){
		ArrayList<EmpFnBean> empList=new ArrayList<>();
		populate(empList);
		Predicate<EmpFnBean> p=e->e.salary<=3500;
		Function<EmpFnBean,EmpFnBean> f=e1->{
			if(p.test(e1)){
				e1.salary=e1.salary+477;
			}
			return e1;

		};
		ArrayList<EmpFnBean> l2=new ArrayList<>();
		for(EmpFnBean e:empList){
			l2.add(f.apply(e));

			}
		System.out.println(l2);
	}

	public static void populate(ArrayList<EmpFnBean> empList){
		empList.add(new EmpFnBean("sunny",3500.0));
		empList.add(new EmpFnBean("bunny",2000.0));
		empList.add(new EmpFnBean("ponny",60000.0));
		empList.add(new EmpFnBean("penny",1000.0));
		empList.add(new EmpFnBean("chinni",5500.0));
	}
}
