package EjercicioExamen;
import java.util.Scanner;
public class RRHHEmpresa {

	 public static int Datos(String codigo, String nombre, String antig, String plus) {
		  
		  if ((codigo.length() > 3) || (codigo.length() < 3) || (codigo == "000")){
	    		
	    		throw new RuntimeException();
	    	}   

	    int cod2 = Integer.valueOf(codigo).intValue();
	    
	    if ((nombre.length() > 20) || (nombre.length() == 0)){
	      
	    		throw new RuntimeException();
	    	}	    

	    if ((antig.length() > 2) || (antig.length() < 2)){
	      
	    		throw new RuntimeException();
	    	}
	    
	    int anti2 = Integer.valueOf(antig).intValue();
	    
	    if (anti2 < 0){	    	
	    		throw new RuntimeException();
	    	}
	    
	    if (plus.equalsIgnoreCase("SI")){
	    	
	    		if (anti2 >= 5) {	    	
	    			return 1000;
	    		}	      
	    		return 300;
	    	}
	    
	    if (plus.equalsIgnoreCase("NO")){
	     
	    	if (anti2 >= 5) {
	    		return 500;
	    	}	      
	    		return 100;
	    	}	    
	    if ((!plus.equalsIgnoreCase("SI")) || (!plus.equalsIgnoreCase("NO"))){
	      
	    	throw new RuntimeException();	    	
	    	}
	        return -1;
	  }
	  
	  

	  public static void Validar(String cadena)
	  {
	    if (cadena.length() > 27) {
	      throw new RuntimeException();
	    }
	    
	    Scanner sc = new Scanner(cadena);
	    sc.useDelimiter(";");
	    String codigo = sc.next();
	    String nombre = sc.next();
	    String antiguedad = sc.next();
	    String plus = sc.next();
	    
	    if (Datos(codigo, nombre, antiguedad, plus) == 0) {
	      throw new RuntimeException();
	    }
	  }
	  
	  public static void main(String[] args) {}

	public static void Datos1(String codigo, String nombre, String antig, String plus) {
		// TODO Auto-generated method stub
		
	}
}
