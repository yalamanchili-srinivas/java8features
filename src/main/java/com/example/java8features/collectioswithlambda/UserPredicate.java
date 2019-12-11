package com.example.java8features.collectioswithlambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserPredicate {
	public static void main(String[] args){
		Predicate<User> p=user->user.userName.equals("lalitha")&&user.pwd.equals("pwd");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name :");
		String userName=sc.next();
		System.out.println("Enter Password :");
		String pwd=sc.next();
		User user=new User(userName,pwd);
		if(p.test(user)){
			System.out.println("Valid User");
		}else {
			System.out.println("Invalid User");
		}


	}
}
