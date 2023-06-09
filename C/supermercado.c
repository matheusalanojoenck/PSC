#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    char prod1[10] = "", prod2[10] = "", prod3[10] = "", prod4[10] = "", prod5[10] = ""; //variaveis para o nome dos produtos
    int qtd1 = 0, qtd2 = 0, qtd3 = 0, qtd4 = 0, qtd5 = 0; // variaves para a qtd
    float preco1 = 0.0, preco2 = 0.0, preco3 = 0.0, preco4 = 0.0, preco5 = 0.0; //variaveis para os preços
    
    //Variaves para guardar as informaçoes do produto mais caro
    char nome_maior[10] = "";
    float preco_maior = 0.0;
    int qtd_maior = 0;
    
    // lendo nome, quantidade e preço do produtos
    printf("Nome produto 1: ");
    scanf("%s", &prod1);
    printf("Quantidade produto 1: ");
    scanf("%d", &qtd1);
    printf("Preco produto 1: ");
    scanf("%f", &preco1); 

    printf("Nome produto 2: ");
    scanf("%s", &prod2);
    printf("Quantidade produto 2: ");
    scanf("%d", &qtd2);
    printf("Preco produto 2: ");
    scanf("%f", &preco2);

    printf("Nome produto 3: ");
    scanf("%s", &prod3);
    printf("Quantidade produto 3: ");
    scanf("%d", &qtd3);
    printf("Preco produto 3: ");
    scanf("%f", &preco3);

    printf("Nome produto 4: ");
    scanf("%s", &prod4);
    printf("Quantidade produto 4: ");
    scanf("%d", &qtd4);
    printf("Preco produto 4: ");
    scanf("%f", &preco4);

    printf("Nome produto 5: ");
    scanf("%s", &prod5);
    printf("Quantidade produto 5: ");
    scanf("%d", &qtd5);
    printf("Preco produto 5: ");
    scanf("%f", &preco5);
    
    // calculando valor total a pagar
    float total = qtd1 * preco1 + qtd2 * preco2 + qtd3 * preco3 + qtd4 * preco4 + qtd5 * preco5;
    
    printf("Total a ser pago: R$ %.2f\n", total);
    
    // Definindo qual o produto mais caro
    if (preco1 > preco_maior){
        strncpy(nome_maior, prod1, sizeof(nome_maior)); //copiando o nome do produto
        preco_maior = preco1;
        qtd_maior = qtd1;
    }
    if (preco2 > preco_maior){
        strncpy(nome_maior, prod2, sizeof(nome_maior));
        preco_maior = preco2;
        qtd_maior = qtd2;
    }
    if (preco3 > preco_maior){
        strncpy(nome_maior, prod3, sizeof(nome_maior));
        preco_maior = preco3;
        qtd_maior = qtd3;
    }
    if (preco4 > preco_maior){
        strncpy(nome_maior, prod4, sizeof(nome_maior));
        preco_maior = preco4;
        qtd_maior = qtd4;
    }
    if (preco5 > preco_maior){
        strncpy(nome_maior, prod5, sizeof(nome_maior));
        preco_maior = preco5;
        qtd_maior = qtd5;
    }
    
    //mostando o produto mais caro
    printf("Produto mais caro!\n");
    printf("Nome: %s\nPreco: R$ %.2f\nQuantidade: %d", nome_maior, preco_maior, qtd_maior);
    

    return 0;
}
