package tema03.cadenes.exemples;

import java.util.Scanner;
//Llegeix un enter, comprovant que siga correcte.
public class LlegirEnter {
  public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valor = 0;
    System.out.print("Escriu un valor enter: ");
    if (entrada.hasNextInt()) { //comprova que allò introduït és un enter
      valor = entrada.nextInt();  // obté valor enter
      System.out.println("El valor era " + valor + ".");
    } else {
      entrada.next(); // descarta el token introduït
      System.out.print("El valor no era enter.");
    }
    entrada.nextLine(); //descarta la resta de l'entrada, la neteja
    entrada.close();
  }
}
