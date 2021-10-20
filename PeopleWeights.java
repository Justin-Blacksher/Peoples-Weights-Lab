import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Sección de variables
      final int maxInputs = 5;    // Valores de entrada máximos
      double[] userWeights = new double[maxInputs]; // valor de peso de formación
      double maxWeight = -99999;       // Valores de peso máximos 
      double averageWeight = -9999;   // Valores de peso promedio
      double totalWeight = -9999;     // Valores de peso suma
      int i; // Valores de iteración i
      
      // Sección de Entradas 
      for (i = 0; i <= maxInputs - 1; i++){  // Crea una iteración de i
         System.out.println("Enter weight " + (i + 1) + ":");
         userWeights[i] = scnr.nextDouble();
         
         }
      
      System.out.print("You entered: ");
      
      for (i = 0; i < userWeights.length; i++){   // Crea una iteración de i
         System.out.print(userWeights[i] + " ");   // Imprime el peso ingresado
         }
      System.out.println("");
      System.out.println("");
      
      // Calcule la suma de los pesos ingresados
      totalWeight = 0;
      for (i = 0; i < userWeights.length; i++){
         totalWeight = totalWeight + userWeights[i];
         }
      // Calcule el promedio de los pesos ingresados
      averageWeight = 0;
      averageWeight = totalWeight / userWeights.length;
      // Calcule y mostrar el peso máximo
      maxWeight = 0;
      for (i = 0; i < userWeights.length; i++){
         if (userWeights[i] > maxWeight){
            maxWeight = userWeights[i];
            }
         else{
            continue;
            }
         
         }
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + averageWeight);
      System.out.println("Max weight: " + maxWeight);
   }  
}
