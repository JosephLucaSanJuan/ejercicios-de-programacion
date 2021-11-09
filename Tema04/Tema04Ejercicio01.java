/**
 * Pedir día de la semana y aprimera signatura diaria
 * 
 * @author Joseph Luca San Juan TYhompson
 */


public class Tema04Ejercicio01 {
  
	public static void main (String[] args) {
		System.out.print("¿Qué día de la semana es?: ");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("lunes")) {
      System.out.println("A primera hora tenemos Programación");
    } else if (respuesta.equals("martes")) {
      System.out.println("A primera hora tenemos Programación");
    } else if (respuesta.equals("miercoles")) {
      System.out.println("A primera hora tenemos Sistemas Informáticos");
    } else if (respuesta.equals("jueves")) {
      System.out.println("A primera hora tenemos Programación");
    }  else if (respuesta.equals("viernes")) {
      System.out.println("A primera hora tenemos Sistema Informáticos");
    } else if (respuesta.equals("sabado")) {
      System.out.println("No hay clase ese día");
    } else if (respuesta.equals("domingo")){
      System.out.println("No hay clase ese día");
    } else {
      System.out.println("Eso no es una opción");
    }
	}
}

