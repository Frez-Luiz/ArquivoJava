import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos anos vocẽ tem: ");
        int idade1 = scanner.nextInt();

        if (idade1 >= 18) {
            System.out.println("Você já é maior de idade, e já pode ser preso");
        } else{
            System.out.println("Você ainda é menor de idade");
        }
    }
}
