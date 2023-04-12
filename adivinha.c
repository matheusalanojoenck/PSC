#include <stdio.h>
#include <stdlib.h>

int main(){
    int min = 0, max = 10;
    int cpu = rand() % (max - min + 1) + min;
    printf("CPU: %d\n", cpu);

    int erros = 0;
    int guess = 0;
    int lifes = 5;
    int n[lifes];
    while (erros < lifes)
    {
        printf("Seu chute: ");
        scanf("%d", &guess);
        if (guess != cpu)
        {
            n[erros] = guess;
            erros++;
            printf("Vidas restantes: %d\n", lifes-erros);
            printf("Errado! \nSeus chutes:\n");
            for (int i = 0; i < erros; i++)
            {
                printf("%d\t", n[i]);
            }
            printf("\n");
        }else{
            printf("Acertou!\n");
            return 0;
        }
        
    }
}