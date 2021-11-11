/**
 * Crea piramide con un caracter del teclado
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio15 {
	
	public static void main (String[] args) {
		String z;
    int direccion;
    
    System.out.print("Introduce el caracter que quieres usar para construir la piramide: ");
    z = System.console().readLine();
    
    System.out.print("Introduce la dirección en la que quieras que apunte el vértice de la piramide: ");
    System.out.println("\n1--> Arriba \n2--> Derecha \n3-->Abajo \n4-->Izquierda");
    System.out.print("Introduce tu respuesta: ");
    direccion = Integer.parseInt(System.console().readLine());
    
    switch((int)direccion){
      case 1:
      System.out.println("\n " + z + " \n " + z + z + z + " ");
      System.out.println(" " + z + z + z + z + z + z + z + " ");
      System.out.println(" " + z + z + z + z + z + z);
      System.out.print(" " + z + z + z + z + z);
      System.out.print(" " + z + z + z + "\n");
      break;
      
      case 2:
      System.out.println("\n" + z); 
      System.out.println(z + " " + z);
      System.out.println(z + " " + z + " " + z);
      System.out.print(z + " " + z);
      System.out.print(z);
      break;
      
      case 3:
      System.out.println("\n" + z + z + z + z + z + z);
      System.out.println(" " + z + z + z + "\n");
      System.out.println(" "+ z + z + z + z + z + z + z + " ");
      System.out.print(" " + z + z + z + z + z + " ");
      System.out.print(" " + z + z + z + "  " + "\n " + z + "\n");
      break;
      
      case 4:
      System.out.println("\n    " + z);
      System.out.println(" " + z + " " + z);
      System.out.println(z + " " + z + " " + z);
      System.out.println(" " + z + " " + z);
      System.out.println(" " + z);
      break;
      
      default:
      System.out.println("Numero erróneo");
      break;
    }
	}
}

