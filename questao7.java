import java.util.Scanner;
public class questao7{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float n;
        System.out.print("Digite um valor:");
        n=leia.nextFloat();
        if(n>10){
        System.out.println("É MAIOR QUE 10!");
        }else{ 
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}