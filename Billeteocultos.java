
package Billete;

import java.util.Random;

 /*El profesor ha escondido todos sus ahorros
(20€) en uno de los sitios de una clase de 8 filas por 4 columnas. Desarrolla
un programa en Java que dibuje las coordenadas X e Y del billete (“€”) de
manera aleatoria empleando una tabla bidimensional. Ejemplos:*/
public class Billeteocultos {
   public static void main(String[] args) {
    int rows = 8;
    int columns = 4;
    String[][] table = new String[rows][columns];
    Random random = new Random();

    // Inicializar la tabla con espacios en blanco
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        table[i][j] = " ";
      }
    }

    // Colocar un billete de 20€ de manera aleatoria
    int billeteRow = random.nextInt(rows);
    int billeteColumn = random.nextInt(columns);
    table[billeteRow][billeteColumn] = "€";

    // Imprimir la tabla con las coordenadas
    System.out.println("  0 1 2 3");
    System.out.println(" -------");
    for (int i = rows - 1; i >= 0; i--) {
      System.out.print(i + "|");
      for (int j = 0; j < columns; j++) {
        System.out.print(table[i][j] + " ");
      }
      System.out.println("|");
    }
    System.out.println(" -------");
  }
}


