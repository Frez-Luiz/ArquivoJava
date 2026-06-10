import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade que você passou no radar: ");
        double velicade = scanner.nextDouble();
        if(velicade >=80){
            System.out.println("Você foi multado por excesso de velocidade. ");
        }else{
            System.out.println("Você está na velocidade permitida. ");
        }
    }
}