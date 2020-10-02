
import fatec.poo.model.FuncionarioHorista;
import java.text.DecimalFormat;


/**
 *
 * @author Valquiria Pires
 */
public class Aplic {
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silva", "14/05/2015", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        System.out.println("Salário Bruto   ==> R$ " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto        ==> R$ " + df.format(funcHor.calcDesconto()));
        System.out.println("Salário Liquido ==> R$ " + df.format(funcHor.calcSalLiquido()));
        
    }
    
}
