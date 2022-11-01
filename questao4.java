import java.util.Scanner;
public class questao4{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float base;
        float altura;
        float area;
        System.out.print("Digite o valor da base:");
        base=leia.nextFloat();
        System.out.print("Digite o valor da altura:");
        altura=leia.nextFloat();
        area=(base*altura)/2;
        System.out.print("O valor da área é:"+area);

    }}
        