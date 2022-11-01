import java.util.Scanner;
public class questao10{
    public static Scanner leia=new Scanner(System.in);
    public static void main (String args[]){
        float nota1;
        float nota2;
        float media;
        System.out.print("Digite a primeira nota:");
        nota1=leia.nextFloat();
        System.out.print("Digite a segunda nota:");
        nota2=leia.nextFloat();
        media=(nota1+nota2)/2;
        System.out.println("A média do aluno é:"+media);
        if(media>=7){
            System.out.println("Aluno foi aprovado");
        }else{
            System.out.println("Aluno foi reprovado");
        }




    }
}