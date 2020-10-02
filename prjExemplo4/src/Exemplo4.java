
/**
 *
 * @author Valquiria Pires
 */
public class Exemplo4 {

    
    public static void main(String[] args) {
       int cont,num;
       
       num = (int)(Math.random() * 100);
       System.out.println("\t\tTabuada do numero "+ num);
       
      
               
       for(cont = 1;cont <= 10;cont++){
           System.out.println(num+" * " + cont + " = " + num * cont);
       }
    }
    
}
