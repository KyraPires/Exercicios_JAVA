
import fatec.poo.model.GameShop;
import java.util.Scanner;

/**
 *
 * @author Valquiria Pires
 */
public class Aplic {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao, cod, idade;
        double horas;
        
        System.out.println("Digite o código: ");
        cod = entrada.nextInt();
        System.out.println("\nDigite sua idade: ");
        idade = entrada.nextInt();
        
        GameShop objGame = new GameShop(cod, idade);
        
        do {
            System.out.println(
                    "\n1-Comprar Horas"
                    + "\n2-Jogar"
                    + "\n3-Brinde"
                    + "\n4-Consultar Saldo de Horas"
                    + "\n5-Sair"
            );
            System.out.println("Digite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("Código: " + objGame.getCodigo());
            
            switch(opcao){
                case 1: System.out.println("Adicione a quantidade de horas: ");
                        horas = entrada.nextDouble();
                        objGame.comprar(horas);
                        break;
                
                case 2: System.out.println("Digite a quantidade de horas a jogar: ");
                        horas = entrada.nextDouble();
                        if (horas <= objGame.getQtdeHoras()){
                            objGame.jogar(horas);
                        }else{
                            System.out.println("Saldo de horas insuficiente!");
                        }
                        break;
                        
                case 3: objGame.brinde();
                        break;
                        
                case 4: System.out.println("Seu saldo de horas é " + objGame.getQtdeHoras());      
                        break;                  
                            
            }
            
        }while (opcao < 5);
        
        
        
        
    }
    
}
