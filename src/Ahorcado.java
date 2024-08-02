import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta= "perro";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean isGano = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!isGano && intentos<intentosMaximos) {
            
            System.out.println("palabra a adivinar "+ String.valueOf(letrasAdivinadas));


            System.out.println("Introduce la letra");

            char letra = scanner.next().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i]= letra;
                    letraCorrecta = true;
                    System.out.println("Adivinaste la letra!");

                }
            }
                if (!letraCorrecta){
                    intentos++;
                    System.out.println("Nop, te queda "+ (intentosMaximos-intentos));
                }
                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                    isGano = true;
                    System.out.println("Ganaste!!");
                }
            

        }
        if(!isGano){
            System.out.println("No hay mas intentos");
        }
        scanner.close();


    }
}
