
import fatec.poo.model.Aluno;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Valquiria Pires
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.0"); //colocar entre parenteses o string de formatação
       Scanner entrada = new Scanner(System.in);
       Aluno objAluno = new Aluno();
       
       //não precisa de todas essas variáveis só int
       double nota1, nota2, trab1, trab2, mediaFinal;
       int opcao,RA;
       
       System.out.println("Digite o RA do aluno: ");
       objAluno.setRA(entrada.nextInt());
       //RA = entrada.nextInt();
       System.out.println("Digite a nota da primeira prova: ");
       nota1 = entrada.nextDouble();
       System.out.println("Digite a nota da segunda prova: ");
       nota2 = entrada.nextDouble();
       System.out.println("Digite a nota do primeiro trabalho: ");
       trab1 = entrada.nextDouble();
       System.out.println("Digite a nota do segundo trabalho: ");
       trab2 = entrada.nextDouble();

       objAluno.setNtPrv1(nota1);
       objAluno.setNtPrv2(nota2);
       objAluno.setNtTrab1(trab1);
       objAluno.setNtTrab2(trab2);
       
       do{
           System.out.println("\n\n------------MENU---------------");
           System.out.println("\n1) Consultar notas das provas");
           System.out.println("2) Consultar notas dos trabalhos");
           System.out.println("3) Consultar a Média da prova");
           System.out.println("4) Consultar a Média do Trabalho");
           System.out.println("5) Consultar Média Final");
           System.out.println("6) Sair");
           System.out.println("\nDigite a opção: ");
           opcao = entrada.nextInt();
           
           System.out.println("RA: " + objAluno.getRA());
           
           switch(opcao){
               case 1: 
                   System.out.println("Nota da prova 1: "+ df.format(objAluno.getNtPvr1())+"\nNota da prova 2: "+ df.format(objAluno.getNtPrv2()));
                   break;
               case 2:
                   System.out.println("\nNota do trabalho 1: " + objAluno.getNtTrab1() + "\nNota do trabalho 2: " + objAluno.getNtTrab2());
                   break;
               case 3:
                   System.out.println("Média das provas: " + objAluno.calcMediaProva());
                   break;
               case 4:
                   System.out.println("Média dos trabalhos: " + objAluno.calcMediaTrab());
                   break;
               case 5:
                   System.out.println("Média Final: " + objAluno.calcMediaFinal());
                   if (objAluno.isAprovado()){
                       System.out.println("Situação: Aprovado");
                   }else{
                       System.out.println("Situação: Reprovado");
                   }     
                    break;                       
            }           
        }while(opcao < 6);
        
    }
    
}
