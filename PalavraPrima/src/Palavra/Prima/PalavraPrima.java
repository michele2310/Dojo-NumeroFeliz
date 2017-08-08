package Palavra.Prima;

public class PalavraPrima {
	public static int converteEmNumero(String palavra){
		
		if (palavra == "a")
			return 1;
	      
		else if (palavra == "A")
		    return 27;	
		
		else if (palavra == "b")
			 return 2;
		
		else if (palavra == "B")
			 return 28;
		
		else if (palavra == "Z")
			 return 52;
		
		else if (palavra == "z")
			 return 26;
		
		/*se não for nenhuma das letras retorna 0, ou seja nada*/
		
		return 0;	
	}

	public static boolean ehPrimo(int numero) {
		if(numero % 2 == 0 && numero != 2)
		return false;
		
		return true;
	}
}
