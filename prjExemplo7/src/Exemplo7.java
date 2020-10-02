
/**
 *
 * @author Valquiria Pires
 */
public class Exemplo7 {

    
    public static void main(String[] args) {
        int[] tabNum;
        tabNum = new int[10];
        int cont;
        
        for(cont = 0;cont < tabNum.length;cont++){
            tabNum[cont] = (int)(Math.random() * 100);
            System.out.println("tabNum[" + cont + "] = " + tabNum[cont]);
        }
    }
    
}
