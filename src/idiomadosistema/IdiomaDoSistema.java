package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

	public static void main(String[] args) {
	
		Locale idioma = Locale.getDefault();
		idioma.getDisplayLanguage();
		System.out.println("O idioma do sistema é: " + idioma);
	}
}

