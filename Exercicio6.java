import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100 && valorCompra <=200) {
            Double valorDescontado = valorCompra * 0.10;
            System.out.println("O valor de seu desconto ficou R$" + valorDescontado);

            
        }else if(valorCompra > 200 ){
            Double valorDescontado = valorCompra * 0.20;
            System.out.println("O valor de seu desconto ficou R$" + valorDescontado);

        }else {
            System.out.println("Você não tem desconto!");
        }
    }

}