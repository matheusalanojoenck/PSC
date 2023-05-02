import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        int a = 4;
        int b = 2;
        System.out.println(a + " + " + b + " = " + calc.soma(a,b));
        System.out.println(a + " - " + b + " = " + calc.subtracao(a,b));
        System.out.println(a + " * " + b + " = " + calc.multiplicacao(a,b));
        System.out.println(a + " / " + b + " = " + calc.divisao(a,b));


        /* Cliente cliente = new Cliente();

        Scanner sc = new Scanner(System.in);

        //int id = sc.nextInt();
        System.out.print("Id: ");
        cliente.setId(sc.nextInt());

        sc.nextLine();
        System.out.print("Nome: ");
        cliente.setNome(sc.nextLine());

        System.out.print("CPF: ");
        cliente.setCpf(sc.nextLine());

        System.out.print("Email: ");
        cliente.setEmail(sc.nextLine());


        System.out.println(cliente.toString()); */

    }
}