#include <stdio.h>
#include <stdlib.h>

int main(){
    char nome_pai[10];
    char nome_mae[10];
    int idade_pai = 0;
    int idade_mae = 0;

    printf("Nome do pai: ");
    scanf("%s", &nome_pai);

    printf("Nome da mae: ");
    scanf("%s", &nome_mae);

    printf("Idade do pai: ");
    scanf("%d", &idade_pai);

    printf("Idade da mae: ");
    scanf("%d", &idade_mae);

    printf("Nome do pai: %s, idade: %d\n", nome_pai, idade_pai);
    printf("Nome da mae: %s, idade: %d\n", nome_mae, idade_mae);

    if(idade_pai < idade_mae){
        printf("%s e mais novo!\n", nome_pai);
    }else if(idade_mae < idade_pai){
        printf("%s e mais nova!\n", nome_mae);
    }else{
        printf("%s e %s tem a mesma idade!\n", nome_pai, nome_mae);
    }

    return 0;
}