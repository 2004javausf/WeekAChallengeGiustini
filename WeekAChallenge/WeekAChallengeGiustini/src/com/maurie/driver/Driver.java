package com.maurie.driver;

import java.util.Scanner;
import com.maurie.beans.Cat;
import com.maurie.beans.Dog;
import com.maurie.beans.Cryptid;

public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static String pet;
	public static String name;
	public static int age;
	public static String other;
	
	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			System.out.println("Do you have a cat or a dog?");
			pet = in.nextLine();
			
			switch (pet) {
				case "cat":
					System.out.println("What is your cat's name?");
					name = sc.nextLine();
					System.out.println("You have a cat named " + name + ". Cute!");
	
					System.out.println("How old is your cat?");
					age = sc.nextInt();
					System.out.println(name + " is " + age + " years old.");
					break;
				case "dog":
					System.out.println("What is your dog's name?");
					name = sc.nextLine();
					System.out.println("You have a dog named " + name + ". Cute!");
	
					System.out.println("How old is your dog?");
					age = sc.nextInt();
					System.out.println(name + " is " + age + " years old? Still a pup!");
					break;
				case "neither":
					System.out.println("What kind of pet do you have?");
					other = sc.nextLine();
					System.out.println("A " + other + ", huh? Weird!");
					break;
				default:
					break;
			}
			
			//3 instances of Cryptid class to choose from
			String eL;
			
			Cryptid m = new Cryptid();
			m.setDangerLevel("medium");
			m.setLocation("Missouri");
			m.setName("Momo");
			
			
			Cryptid a = new Cryptid();
			a.setDangerLevel("high");
			a.setLocation("Georgia");
			a.setName("Altie");
			
			
			Cryptid d = new Cryptid();
			d.setDangerLevel("low");
			d.setLocation("Canada");
			d.setName("Dingbat");
			
			System.out.println("m, a, or d?");
			eL = in.nextLine();
			if (eL.equals("m")) {
				System.out.println(m);
				System.out.println("The Missouri Monster, or Momo, is a large, stinky beast that resembles Bigfoot. Can be dangerous if threatened. Use caution.");
			}else if (eL.equals("a")) {
				System.out.println(a);
				System.out.println("The Altamaha-ha, or Altie, is described as having a sturgeon like body and the snout of a crocodile. AVOID AT ALL COSTS.");
			}else if (eL.equals("d")) {
				System.out.println(d);
				System.out.println("The Dingbat... Just don't. He's real annoying.");
			}
			
			//two instances of Cat class
			Cat t = new Cat();
			t.setSpecies("Bengal Tiger");
			t.setCoatPattern("Stripes");
			t.setColor("Orange and black");
			System.out.println(t);
			
			Cat s = new Cat();
			s.setSpecies("Snow Leopard");
			s.setCoatPattern("Spots");
			s.setColor("Grey and white");
			System.out.println(s);
			
			//two instances of Dog class
			Dog g = new Dog();
			g.setSpecies("German Shepherd Dog");
			g.setSize("Large");
			g.setColor("Brown and black");
			System.out.println(g);
			
			Dog aCd = new Dog();
			aCd.setSpecies("Australian Cattle Dog");
			aCd.setSize("Medium");
			aCd.setColor("Varies");
			System.out.println(aCd);
			}
	
	//overloading
	static Integer dogYears = 7;
	static int q = 13;
	static double w = 1.5;
	static Double r = 7.0;
	
	public static int multiply(int q, int dogYears) {
		int sum = q * dogYears;
		return sum;
	}
	
	public static Integer multiply(Integer q, Integer dogYears) {
		Integer sum = q * dogYears;
		return sum;
	}
	
	public static double multiply(double w, Double r) {
		double sum = w * r;
		return sum;
	}
	
}


