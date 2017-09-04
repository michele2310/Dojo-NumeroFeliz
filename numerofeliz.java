package Numero.Feliz;

public class numerofeliz {

public static boolean ehFeliz(int num) {
	
		if(num == 0)
		return false;
		
		if(num < 10 && num >= 0){
			if (num == 1 || num  == 3 || num == 7){
			 return true;
			}
		}
		
		else if(num < 100 && num >= 10){
			 int Dezena = num/10;
			 int ValorRestante = Dezena%10;
			 int quadradoD;
			 int quadradoR;
		
				 for (int soma = 2; soma < 10; soma ++){
					 quadradoD = Dezena * Dezena;
					 quadradoR = ValorRestante * ValorRestante;
					 
					 soma = quadradoD + quadradoR;
					 }
					 return true;
				 }
		 
		    else if(num < 1000 && num >= 100){
			 int Centena = num /100;
			 int RestoCentena = Centena%100;
			 int Dezena = RestoCentena/10;
			 int Unidade = Dezena%10;
			 
			 int quadradoC;
			 int quadradoD;
			 int quadradoU;
		
				 for (int soma = 100; soma < 1000; soma ++){
					 quadradoC = Centena * Centena;
					 quadradoD = Dezena * Dezena;
					 quadradoU = Unidade * Unidade;
					 
					 soma = quadradoC + quadradoD + quadradoU;
					 }
				 	return true;
			    }
			
			return false; 
		
	}
}