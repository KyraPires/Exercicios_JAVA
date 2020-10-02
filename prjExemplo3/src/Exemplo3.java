
/**
 *
 * @author Valquiria Pires
 */
public class Exemplo3 {

    
    public static void main(String[] args) {
        int x;
       //exemplo de cast
        x = (int)(Math.random() * 100);
        
        if (x < 50){
            System.out.println("O valor " + x + " é menor que 50");
        }    
        else{
            System.out.println("O valor " + " é menor ou maior que 50");
        }    
    }
    
}
