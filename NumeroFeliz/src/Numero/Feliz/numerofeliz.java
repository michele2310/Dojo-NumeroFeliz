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
		 return false;
	}
}