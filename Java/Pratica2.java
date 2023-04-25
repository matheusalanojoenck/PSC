import java.util.Scanner;

public class Pratica2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = 10;
        String[] x = new String[size];
        for (int i = 0; i < size; i++) {
            x[i] = scn.nextLine();
        }

        System.out.println("Mostrando nomes desordenados: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        //ordena nomes
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                //Se x[j] vem depois alfabeticamente que x[j + 1]
                if (x[j].compareTo(x[j + 1]) > 0) {
                    //troca x[j+1] e x[j]
                    String temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        System.out.println("Mostrando nomes ordenados: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}