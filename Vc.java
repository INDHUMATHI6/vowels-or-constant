package id;

import java.util.Scanner;

public class Vc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char s1=s.next().charAt(0);
		switch(s1)
		{
		case 'a':
			System.out.println("The char is vowel");
			break;
		case 'e':
			System.out.println("the char is vowel");
			break;
		case 'i':
			System.out.println("The char is vowel");
			break;
		case 'o':
			System.out.println("The char is vowel");
			break;
		case 'u':
			System.out.println("The char is vowel");
			break;
			default:
				System.out.println("The char is constant");
				break;
			
		}

	}

}
