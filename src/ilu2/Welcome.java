package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder strbld = new StringBuilder();
		strbld.append("Hello, ");
		if (!input.trim().isEmpty()) {
			strbld.append(input.substring(0, 1).toUpperCase());
			strbld.append(input.substring(1));
			if (0 == input.compareTo(input.toUpperCase())){
				strbld.append(" !");
				return strbld.toString().toUpperCase();
			}
		}
		else {
			strbld.append("my friend");
		}
		return strbld.toString();
	}
	
	
}
