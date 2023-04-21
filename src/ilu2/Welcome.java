package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder strbld = new StringBuilder();
		strbld.append("Hello, ");
		strbld.append(input.substring(0, 1).toUpperCase());
		strbld.append(input.substring(1));
		return strbld.toString();
	}
	
	
}
