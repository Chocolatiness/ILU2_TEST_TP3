package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder strbld = new StringBuilder();
		strbld.append("Hello, ");
		if (input.contains(",")) {
			return input_multinom(strbld,input);
		}
		else if (!input.trim().isEmpty()) {
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
		StringBuilder nomMaj = new StringBuilder();
		int nbM = 0;
		for(int i = 0;i<miaou.length-1;i++) {
			if (0 == miaou[i].compareTo(miaou[i].toUpperCase())) {
				if (nbM == 0) {
					nomMaj.append("AND HELLO, ");
					nbM++;}
				else {
					nomMaj.append(", ");
				}
				nomMaj = input_multinom_maj(nomMaj,miaou[i]);
			}
			else {
		strbld = input_singlenom(strbld,miaou[i].toString());
		strbld.append(", ");
		}}
		strbld = input_singlenom(strbld,miaou[miaou.length-1].toString());	
		if (nbM >0) {	nomMaj.append(" !");
		strbld.append(". ");
		strbld.append(nomMaj.toString());
		}
		return strbld.toString();
	}


private static StringBuilder input_multinom_maj(StringBuilder strbld,String input) {
	strbld.append(input);
	return strbld;
}


}