package Calculator;

import java.util.Scanner;

public class Main {
	static double a;
	static double b;
	static String o;
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("donner un entier a:");
		a=s.nextDouble();
		System.out.println("donner un entier b:");
		b=s.nextDouble();
		System.out.println("donner l'opération à faire :add /div/mul/sub:");
		s.nextLine();
		o=s.nextLine();
		Calculator c=new Calculator();
		if (o.equals("add")) {System.out.println("le résultat est :"+c.add(a,b));}
		else {
			if (o.equals("sub")) {System.out.println("le résultat est :"+c.sub(a,b));}
			else {
				if (o.equals("div")) {
				try {
					System.out.println("le résultat est :"+c.div(a,b));}
				catch (ArithmeticException e) {
					   System.out.println("Erreur : Division par zéro !");}
				}
				else {
					System.out.println("le résultat est :"+c.mul(a,b));}
			}
		}
	}
}
