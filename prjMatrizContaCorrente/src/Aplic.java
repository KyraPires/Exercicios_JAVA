
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Valquiria Pires
 */
public class Aplic {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int option, num, i;
        double valSaldo, valDep, valSaq;
        ContaCorrente[] banco = new ContaCorrente[15];
        
        for (i=0; i < 15; i++){
           
            System.out.println("Digite o número da conta corrente: ");
            num = entrada.nextInt();
            System.out.println("Digite o saldo inicial: ");
            valSaldo = entrada.nextDouble();
            //Instanciação do objeto da classe ContaCorrente
            //e fazer a chamada do método construtor            
            banco[i] = new ContaCorrente(num, valSaldo);
        } 
       
        do {
            System.out.println(
                    "\n1-Depositar"
                    + "\n2-Sacar"
                    + "\n3-Consultar Saldo"
                    + "\n4-Consultar Contas"
                    + "\n5-Sair"                    
                );

            System.out.println("\nOpção: ");
            option = entrada.nextInt();
                                                               //passagem de mensagens
            System.out.println("\nNúmero da conta corrente: " + banco[i].getNumero());

            switch (option) {
                case 1: {
                    System.out.println("\nValor a ser depositado: ");
                    valDep = entrada.nextDouble();
                    banco[i].depositar(valDep);
                    break;
                }
                case 2: {
                    System.out.println("Valor a ser sacado: ");
                    valSaq = entrada.nextDouble();
                    if (valSaq <= banco[i].getSaldo()){
                        banco[i].sacar(valSaq);
                    } else {
                        System.out.println("\nSaldo insuficiente");
                    }
                    break;
                }
                case 3: {
                    System.out.println("\nValor do Saldo: " + df.format(banco[i].getSaldo()));
                    break;
                }     
            }
        }while (option < 4);
        
        
        
    }
}

                 
        
        

    

