package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder strbld = new StringBuilder();
		strbld.append("Hello, ");
		if (input.contains(",")) {
			return input_multinom(strbld,input);
		}
		if (!input.trim().isEmpty()) {
			strbld = input_singlenom(strbld,input);
			if (0 == input.compareTo(input.toUpperCase())){
				return input_maj(strbld);
			}
		}
		else {
			strbld.append("my friend");
		}
		return strbld.toString();
	}
	
	private static StringBuilder input_singlenom(StringBuilder strbld,String input) {
		strbld.append(input.substring(0, 1).toUpperCase());
		strbld.append(input.substring(1));
		return strbld;
	}

	private static String input_maj(StringBuilder strbld) {
		strbld.append(" !");
		return strbld.toString().toUpperCase();
	}
	
	private static String input_multinom(StringBuilder strbld,String input) {
		String [] miaou = input.split(",");
		for(int i = 0;i<miaou.length-1;i++) {
			
		strbld = input_singlenom(strbld,miaou[i].toString());
		strbld.append(", ");
		}
		strbld = input_singlenom(strbld,miaou[miaou.length-1].toString());	
		return strbld.toString();
	}
}
