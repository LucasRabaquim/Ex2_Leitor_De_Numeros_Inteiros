package lucas_rafa_02;
import java.util.Scanner;

class Lucas_Rafa_02 {

    public static void main(String[] args) {
        System.out.print("Digite uma sequência de números inteiros: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int soma = 0;
        int contador = 0;
        
        if (num < 0){
            while(num <0){
            System.out.print("O primeiro número não pode ser negativo. Digite outro número: ");
            num = entrada.nextInt();
            }
        }
        while(num >= 0){
            contador++;
            soma += num;
            System.out.print("Digite uma sequência de númeoros inteiros: ");
            num = entrada.nextInt();
        }
        float media = soma/contador;
        System.out.println("A média é de: " + media);
    }
    
}
