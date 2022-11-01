import java.util.Scanner;
public class questao8{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
    float n;
    System.out.print("Digite um valor:");
    n=leia.nextFloat();
    if(n>=0){
        System.out.println("O número é positivo!");
    }else{
        System.out.println("O número é negativo!");
    }
    
  }
}