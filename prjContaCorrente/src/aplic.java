
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Valquiria Pires
 */
public class aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int option, num;
        double valSaldo, valDep, valSaq;
        
        System.out.println("Digite o número da conta: ");
        num = entrada.nextInt();
        System.out.println("Digite o saldo inicial: ");
        valSaldo = entrada.nextDouble();
        
        //Instanciação do objeto da classe ContaCorrente
        //e fazer a chamada do método construtor
        ContaCorrente objConta = new ContaCorrente(num, valSaldo);
       

        System.out.println("\nNúmero da conta: " + objConta.getNumero());
        
        do {
            System.out.println(
                    "\n1-Depositar"
                    + "\n2-Sacar"
                    + "\n3-Consultar Saldo"
                    + "\n4-Sair"
            );

            System.out.println("\nOpção: ");
            option = entrada.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Valor a ser depositado: ");
                    valDep = entrada.nextDouble();
                    objConta.depositar(valDep);
                    break;
                }
                
                case 2: {
                    System.out.println("Valor a ser sacado: ");
                    valSaq = entrada.nextDouble();
                    if (valSaq <= objConta.getSaldo()){
                        objConta.sacar(valSaq);
                    } else {
                        System.out.println("\nSaldo insuficiente");
                    }
                    break;
                }
                case 3: {
                    System.out.println("\nSaldo: " + df.format(objConta.getSaldo()));
                    break;
                }
                
                }
            }while (option < 4);
        }
    }
