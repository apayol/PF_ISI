public class RomanNumeral{

	private boolean actualIsRep = false;
	private int restaPosible_1 = 0;
	private int restaPosible_2 = 0;
	private String strResultado;

	public String convierte(String romano){
		
		int intDigit = 0;
		int prev = 0;
		int contEquals = 0;
		int resultado = 0;
		int temp = 0;
		int max = 10000;
		int min = 10000;				
		boolean prevIsRep = false;
		boolean restado = false;
		
		
		for(Character digito: romano.toUpperCase().toCharArray()){
			actualIsRep = false;			
			intDigit = changeLetterByNumber(digito);
			
			// Si es el primer digito
			
			if (prev == 0){				
				prev = intDigit;
				temp = intDigit;
				contEquals++;
				prevIsRep = actualIsRep;
				restado = false;
			
			// Si el digito introducido es igual al anterior
				
			}else if (prev == intDigit && contEquals <= 3){
				
				// Validaciones
				
				if (actualIsRep == false || restado == true){
					strResultado = "Error, el numero introducido es invalido";
					return strResultado;
				}
				prev = intDigit;
				temp = temp + intDigit;
				prevIsRep = actualIsRep;
				contEquals++;
				restado = false;
				
			// Si el numero introducido es mayor que el anterior
				
			}else if (prev < intDigit){
				
				// Validaciones
				
				if (prevIsRep == false || contEquals > 1 || intDigit >= max ||
						(restaPosible_1 != intDigit && restaPosible_2 != intDigit) ){
					strResultado= "Error, el numero introducido es invalido";					
					return strResultado;
				}
				
				min=prev;
				restado = true;
				prev = intDigit;
				temp = intDigit - temp;
				contEquals = 0;
				prevIsRep = actualIsRep;
				
			// Si el numero introducido es menor que el anterior	
			
			}else if (prev > intDigit){
				
				// Validaciones
				
				if (intDigit > min){
					strResultado = "Error, el numero introducido es invalido";
					return strResultado;
				}
				
				max = prev;
				prev = intDigit;				
				prevIsRep = actualIsRep;
				contEquals = 0;				
				resultado = resultado + temp;				
				temp = intDigit;
				restado = false;	
			}
		}
		
		resultado = resultado + temp;
		return String.valueOf(resultado);
	}
	
	public int changeLetterByNumber(Character digito){
		
		int intDigit = 0;
		
		int m = 0;
		int d = 0;
		int c = 0;
		int l = 0;
		int x = 0;
		int v = 0;
		int i = 0;
		
		switch(digito){	
		case 'I':
			intDigit = 1;
			actualIsRep = true;
			restaPosible_1 = 5;
			restaPosible_2 = 10;
			i= i +1;
			break;
		case 'V':
			intDigit = 5;
			v= v +1;
			break;
		case 'X': 
			x = x + 1;
			intDigit = 10;
			actualIsRep=true;
			restaPosible_1 = 50;
			restaPosible_2 = 100;
			break;
		case 'L':
		    l= l +1;
			intDigit = 50;
			break;
		case 'C':
			c = c + 1;
			intDigit = 100;
			actualIsRep = true;
			restaPosible_1 = 500;
			restaPosible_2 = 1000;				
			break;
		case 'D':
			d= d +1;
			intDigit = 500;
			break;
		case 'M':
			m= m +1;
			intDigit = 1000;
			actualIsRep = true;
			break;
		default:
			 strResultado= "Error, el numero introducido es invalido";				
		}
		if (i>3 ||v>3 ||x>3 ||l>3 || c>3 ||d>3 || m>3) {
			throw new RuntimeException("Número romano no válido(tiene + de 3 letras =)");
		}
		
		return intDigit;
	
	}
	public static void main(String[] args)
	{
		//System.out.println(convierte("V"));
		//System.out.println(convierte("Z"));
		//System.out.println(convierte("VIIII"));
		;
	}

}
