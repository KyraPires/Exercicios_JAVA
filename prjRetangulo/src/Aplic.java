
import fatec.poo.model.Retangulo;
import java.util.Scanner;


/**
 *
 * @author Valquiria Pires
 */
public class Aplic {    
    public static void main(String[] args) {
        //instanciação de um objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        //instanciação de um objeto da classe Retangulo
        Retangulo objRet = new Retangulo();
        
        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble(); //passagem de mensagem 
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1-Consultar Área");
            System.out.println("2-Consultar Perímetro");
            System.out.println("3-Consultar Diagonal");
            System.out.println("4-Sair");
            System.out.println("\tDigite sua opção: ");
            opcao = entrada.nextInt(); //passagem de mensagem
            
            System.out.println("Altura: "+ objRet.getAltura());
            System.out.println("Base: "+ objRet.getBase());
            switch(opcao){
                case 1 :  System.out.println("Medida da Área: "+ objRet.calcArea());
                          break;
                case 2 :  System.out.println("Medida de Perimetro: " + objRet.calcPerimetro());
                          break;
                case 3 :  System.out.println("Medida da Diagonal: " + objRet.calcDiagonal());
                          break;
            }
        }while(opcao < 4);
    }
    
}
