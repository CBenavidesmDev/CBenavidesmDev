package tana5vector;

/**
 *
 * @author crist
 * 5.Dado un vector, si el tamaño es par invertir los elementos de la mitad de la lista,
 * si es impar sumarlos.

Ej: vector = [1, 2, 3, 4, 5, 6], output → [3, 2, 1, 6, 5, 4]
Ej2: vector = [1, 2, 3, 4, 5], output → 15


 */
public class Tana5Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] vector = new int[6];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        vector[4] = 5;
        vector[5] = 6;

      int[]vector2=new int[5];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        vector[4] = 5;
      int resto = vector.length%2; // Nos devuelve el resto de la división de la logitud de la lista entre 2
      if(resto==0){
          
      }
        while(i<vector.length){
            System.out.println("Valor del Vector en la posicion "+i+" es "+vector[i]); 
                i++;
        }
    }
    
}
