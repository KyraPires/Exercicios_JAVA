
import java.util.Scanner;



/**
 *
 * @author Valquiria Pires
 */
public class Exemplo8 {

    public static void main(String[] args) {
        int codProd;
        double precUnit, qtdeVend, valComp, desc,valPagar=0;
        String descricao;
        //toda vez q um identificador vem precedido de uma classe é um ponteiro
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o código : ");
        codProd = entrada.nextInt(); // similar ao scanf do C ==> scanf("%d",codProd&)
        while(codProd > 0){
            System.out.println("Digite a descrição: ");
            descricao = entrada.next(); //scanf("%s", &descricao) faz a entrada de uma sequencia de caracteres sem espaço
            System.out.println("Digite o preço unitário: ");
            precUnit = entrada.nextDouble(); //scanf("%lf",&precUnit)
            System.out.println("Digite quantidade vendida: ");
            qtdeVend = entrada.nextDouble();        
            valComp = precUnit * qtdeVend;
            System.out.println("Valor da Compra: R$ " + valComp);
        
            if(valComp < 800){
                desc = 0;
            }else{
                desc = 0.1 * valComp;
            }
        
            valPagar = valPagar - desc;
            System.out.println("Valor da compra: " + valComp);
            System.out.println("Valor do desconto: " + desc);
            System.out.println("Valor a pagar: R$ " + valPagar);
            
            System.out.println("Digite o código : ");
            codProd = entrada.nextInt();
            
        }
    }
    
}
