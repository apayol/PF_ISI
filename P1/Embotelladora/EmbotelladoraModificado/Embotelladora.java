//package Embotelladora;

public class Embotelladora {
	
	public static int llenarBotellasGrandes(int grandes, int litros) {
		while (grandes>0 && litros>=5) {
			grandes=grandes-1;
			litros=litros-5;
			//System.out.println("Una grande");
		}
		return litros;
		
	}
	
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		if (total<=0) {
			return 0;
		}
		
		if (pequenas<0) {
			return 0;
		}
			
		total=llenarBotellasGrandes(grandes, total);
		int needed=0;
		while (pequenas>0 && total>0) {
			pequenas=pequenas-1;
			total=total-1;
			needed=needed+1;
		//	System.out.println("Una pequeña");
		}
		if (total!=0) {
			return 0;
		}
		return needed;
	}
	
	public static void main(String[] args) {
		System.out.println(calculaBotellasPequenas(1,5,20));
		System.out.println(calculaBotellasPequenas(2,3,17));
		System.out.println(calculaBotellasPequenas(1,1,6));
		System.out.println(calculaBotellasPequenas(1,1,7));
		System.out.println(calculaBotellasPequenas(1,2,18));
		System.out.println(calculaBotellasPequenas(12,1,5));
		System.out.println(calculaBotellasPequenas(12,1,10));
	}
}
