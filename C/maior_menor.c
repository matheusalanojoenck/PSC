#include <stdio.h>
#include <stdlib.h>

int main(){
    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;
    int maior = 0;
    int menor = 0;

    printf("Numero 1: ");
    scanf("%d", &n1);

    printf("Numero 2: ");
    scanf("%d", &n2);

    printf("Numero 3: ");
    scanf("%d", &n3);

    printf("Numero 4: ");
    scanf("%d", &n4);

    printf("Numero 5: ");
    scanf("%d", &n5);
    
    maior = n1;
    menor = n1;

    if (n2 > maior){
        maior = n2;
    }
    if (n3 > maior){
        maior = n3;
    }
    if (n4 > maior){
        maior = n4;
    }
    if (n5 > maior){
        maior = n5;
    }

    if (n2 < menor){
        menor = n2;
    }
    if (n3 < menor){
        menor = n3;
    }
    if (n4 < menor){
        menor = n4;
    }
    if (n5 < menor){
        menor = n5;
    }

    printf("Maior numero: %d\n", maior);
    printf("Menor numero: %d\n", menor);

    return 0;
}