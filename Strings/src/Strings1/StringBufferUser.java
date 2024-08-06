package Strings1;

import java.lang.StringBuffer;

public class StringBufferUser {
	public static void main(String[] args) {
		StringBuffer name1 = new StringBuffer("Sarthak");
		
		System.out.println(name1.hashCode());
		
		name1 = name1.append(" Gangan");
		
		System.out.println(name1.hashCode());
		
	}

}
