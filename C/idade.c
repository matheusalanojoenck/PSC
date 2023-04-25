#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h> 

int main()
{
    char nome[20] = "";
    int ano_nascimento = 0;
    printf("Qual seu nome?: ");
    scanf("%s", &nome);
    printf("Qual o ano do seu nascimento?: ");
    scanf("%d", &ano_nascimento);

    printf("%s, sua idade e: %d", nome, 2023-ano_nascimento);
}