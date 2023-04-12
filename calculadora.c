#include <stdio.h>
#include <stdlib.h>

int main(){
    float n[2];
    
    for (int i = 0; i < 2; i++)
    {
        printf("Informe numero %d: ", i+1);
        scanf("%f", &n[i]);
    }

    int choise = 0;
    
    do
    {
        printf("Qual operacao?\n");
        printf("1 - Soma\n");
        printf("2 - Subtrair\n");
        printf("3 - multiplicar\n");
        printf("4 - Dividir\n");
        scanf("%d", &choise);
    }while (choise < 1 || choise > 4);

    float result = 0;
    switch (choise)
    {
        case 1:
            result = n[0] + n[1];
            break;
        case 2:
            result = n[0] - n[1];
            break;
        case 3:
            result = n[0] * n[1];
            break;
        case 4:
            result = n[0] / n[1];
            break;

    }
        
    printf("Resultado: %f\n", result);
}