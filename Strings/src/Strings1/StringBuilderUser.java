package Strings1;

public class StringBuilderUser {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Sarthak");
		System.out.println(name.hashCode());
		
		name = name.append(" Gangan");
		
		System.out.println(name.hashCode());
	}
}
