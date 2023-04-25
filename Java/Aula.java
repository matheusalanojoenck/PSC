import java.util.Random;

public class Aula{
    public static void main(String[] args) {
        Random rnd = new Random();

        int size = 100;
        int[] x = new int[size]; 
        for (int i = 0; i < size; i++){
            x[i] = rnd.nextInt(1000);
        }

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        //Mostra numeros e verifica o maior e menor
        for (int i = 0; i < size; i++){
            System.out.printf("%dº: %d\n",i+1, x[i]);

            //Verifica se o numero atual é maior que o maior valor atual
            if (x[i] > maior) maior = x[i];

            //Verifica se o numero atual é menor que o menor valor atual
            if (x[i] < menor) menor = x[i];

            //Soma todo os valores do vetor x
            soma += x[i];
        }

        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + soma/size);

        //Ordena vetor
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - i - 1; j++){
                if (x[j] > x[j + 1]) {
                    //swap x[j+1] and x[j]
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        //Mostra vetor ordenado
        for (int i = 0; i < size; i++){
            System.out.printf("%dº: %d\n",i+1, x[i]);
        }
    }
}