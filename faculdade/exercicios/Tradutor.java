package faculdade.exercicios;

public class Tradutor {
	static Tradutor tradutor = new Tradutor();
	/*Map<String,Boolean> pontuacao = new HashMap<>() {{
		put("virgula",false);put("ponto",false);
		put("ponto e virgula",false);put("dois pontos",false);
		}};*/
	
	public void conversor(String ingles) {
		String[] frases = ingles.split(" ");
		String[] prefixo = new String[frases.length];
		String[] radical = new String[frases.length];
		if(!ingles.isBlank()) {
			for(int i = 0; i<frases.length;i++) {
				char[] letras = frases[i].toCharArray();
				for(int j = 0; j<frases[i].length();j++) {
					if(letras[j] == 'a' || letras[j] == 'e' || letras[j] == 'i' || letras[j] == 'o' || letras[j] == 'u' || letras[j] == 'y') {
						prefixo[i] = frases[i].substring(0,j) + "ay";
						radical[i] = frases[i].substring(j,frases[i].length());
						//System.out.println("1: "+radical[i] + radical[i].length() + " "+prefixo[i]);
						if(!(radical[i].substring(radical[i].length()-1).matches("[a-z]*"))) {
							prefixo[i] = prefixo[i].substring(0,prefixo[i].length()-2)+ "ay"+ frases[i].substring(frases[i].length()-1);
							radical[i] = frases[i].substring(j,frases[i].length()-1);
							//System.out.println("2: "+prefixo[i] + " "+radical[i]);
						}
						if(frases[i].toUpperCase().charAt(0) == letras[0]) {
							prefixo[i].substring(0,1).toUpperCase();
							radical[i].substring(0,1).toLowerCase();
							//System.out.println("3: "+prefixo[i] + " "+radical[i]);
						}
						System.out.print(radical[i] + prefixo[i] + " ");
					}
					if(prefixo[i] != null || radical[i] != null) {
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		/*System.out.println(*/tradutor.conversor("Dog. Father. Food");
	}
}
