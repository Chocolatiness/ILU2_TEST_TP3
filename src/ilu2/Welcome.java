package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder strbld = new StringBuilder();
		strbld.append("Hello, ");
		if (input.contains(",")) {
			input = trimer(input);
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
		System.out.println(input);
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

private static String trimer(String input) {
	StringBuilder trimer = new StringBuilder();
	String[] miaou = input.split(",");
	int j = 0;
	for (int i = 0; i<miaou.length-1;i++) {
		trimer.append(miaou[i].trim());
		trimer.append(",");
		j++;
		}
	trimer.append(miaou[j].trim());
	return trimer.toString();
}



/*private static String ajout_and(String message) {
	System.out.println(message);
	String [] miaou = message.split(".");
	for (int i = 0; i<miaou.length;i++) {
	System.out.println(miaou[i]);}
	String [] miaou0 = miaou[0].split("");
	String [] miaou1 = miaou[1].split("");
	StringBuilder strbld = new StringBuilder();
	int nbvir0 = 0;
	int nbvir1 = 0;
	for (int i = 0; i<miaou0.length;i++) {
		if (miaou0[i] == ",")
			nbvir0 = i;}
	for (int i = 0; i<miaou1.length;i++) {
		if (miaou1[i] == ",")
			nbvir1 = i;
	}
	miaou0[nbvir0] = "and";
	miaou1[nbvir1] = "AND";
	for (int i = 0;i<miaou0.length;i++) 
		strbld.append(miaou0[i]);
	for (int i = 0;i<miaou1.length;i++)
		strbld.append(miaou1[i]);
	return strbld.toString();
}*/


}