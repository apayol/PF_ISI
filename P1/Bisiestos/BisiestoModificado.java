import java.util.*;


public class BisiestoModificado {
	public static boolean main(int año) {
		if(año == 0 || año < 0){
			throw new RuntimeException("Year not valid");
	    } else if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
	         return true;
	     }else{
	         return false;
	     }
	}
	
	public static void main(String[] args)
	{
		;
	}
}
