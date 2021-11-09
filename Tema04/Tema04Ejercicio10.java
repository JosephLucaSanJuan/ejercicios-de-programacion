/**
 * Escribe un horóscopo
 * 
 * @author Jospeh Luca San Juan Thompson
 */


public class Tema04Ejercicio10 {
	
	public static void main (String[] args) {
		System.out.print("Introduce el número del mes (1-12): ");
    int mes = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un día: ");
    int día = Integer.parseInt(System.console().readLine());
        
    switch (mes) {
      case 1:
        if ((día>=1) || (día<=20)) {
          System.out.println("Capricornio");
        } else if ((día>=21) || (día<=31)) {
          System.out.println("Acuario. Eres idealista sincero lógico son un sentido de humor, imaginativo empático, soñador, planificador y te gusta divertirte");
        } break;
      case 2:
        if ((día>=1) || (día<=19)) {
          System.out.println("Acuario. Eres idealista sincero lógico son un sentido de humor, imaginativo empático, soñador, planificador y te gusta divertirte");
        } else if ((día>=20) || (día<=29)) {
          System.out.println("Piscis");
        } break;
      case 3:
        if ((día>=1) || (día<=20)) {
          System.out.println("Piscis");
        } else if ((día>=21) || (día<=31)) {
          System.out.println("Aries");
        } break;
      case 4:
        if ((día>=1) || (día<=20)) {
          System.out.println("Aries");
        } else if ((día>=21) || (día<=30)) {
          System.out.println("Tauro");
        } break;
      case 5:
        if ((día>=1) || (día<=20)) {
          System.out.println("Tauro");
        } else if ((día>=21) || (día<=31)) {
          System.out.println("Géminis");
        } break;
      case 6:
        if ((día>=1) || (día<=20)) {
          System.out.println("Géminis");
        } else if ((día>=21) || (día<=30)) {
          System.out.println("Cáncer");
        } break;
      case 7:
        if ((día>=1) || (día<=22)) {
          System.out.println("Cáncer");
        } else if ((día>=23) || (día<=31)) {
          System.out.println("Leo");
        } break;
      case 8:
        if ((día>=1) || (día<=23)) {
          System.out.println("Leo");
        } else if ((día>=24) || (día<=31)) {
          System.out.println("Virgo");
        } break;
      case 9:
        if ((día>=1) || (día<=22)) {
          System.out.println("Virgo");
        } else if ((día>=23) || (día<=30)) {
          System.out.println("Libra");
        } break;
      case 10:
        if ((día>=1) || (día<=22)) {
          System.out.println("Libra");
        } else if ((día>=23) || (día<=31)) {
          System.out.println("Escorpio");
        } break;
      case 11:
        if ((día>=1) || (día<=22)) {
          System.out.println("Escorpio");
        } else if ((día>=23) || (día<=30)) {
          System.out.println("Sagitario");
        } break;
      case 12:
        if ((día>=1) || (día<=21)) {
          System.out.println("Sagitario");
        } else if ((día>=22) || (día<=31)) {
          System.out.println("Capricornio");
        } break;
      default:
    }
	}
}
