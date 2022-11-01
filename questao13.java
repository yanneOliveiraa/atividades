import java.util.Scanner;
public class questao13{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float valor1;
        float valor2;
        float valor3;
        float maior;
        System.out.print("Digite o primeiro valor:");
        valor1=leia.nextFloat();
        System.out.print("Digite o segundo valor:");
        valor2=leia.nextFloat();
        System.out.print("Digite o terceiro valor:");
        valor3=leia.nextFloat();
        if(valor1>=valor2){
           if(valor1>=valor3){
                maior=valor1;
            }
            }else{
                maior=valor3;
            }if(valor2>=valor3){
                maior=valor2;
            
            }else{
                maior=valor3;
            }
            System.out.println("O maior número é:"+ maior);
    }
  }
