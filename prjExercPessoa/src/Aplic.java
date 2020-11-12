
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;


/**
 *
 * @author Valquiria Pires
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica fisica = new PessoaFisica("31135682807","Leticia Garcia", 2015);
        PessoaJuridica juridica = new PessoaJuridica("44561180000105", "Empresa Legal", 2017);
        
        fisica.setBase(100);
        fisica.addCompras(2500);
        fisica.addCompras(200);
        fisica.addCompras(8500);
        
        //ano atual
        System.out.println("CPF:                " + fisica.getCPF());
        System.out.println("Nome:               " + fisica.getNome());
        System.out.println("Ano de inscrição:   " + fisica.getAnoInscricao());
        System.out.println("Base:               " + fisica.getBase());
        System.out.println("Total de compras:   " + fisica.getTotalCompras());
        System.out.println("Bônus:              " + df.format(fisica.calcBonus(2020)));
        
        juridica.setTaxaIncentivo(2.4);
        juridica.addCompras(10000);
        juridica.addCompras(5000);
        juridica.addCompras(6000);
        
        System.out.println("CGC:                " + juridica.getCGC());
        System.out.println("Nome:               " + juridica.getNome());
        System.out.println("Ano de inscrição:   " + juridica.getAnoInscricao());
        System.out.println("Taxa de incentivo:  " + juridica.getTaxaIncentivo());
        System.out.println("Total de compras:   " + juridica.getTotalCompras());
        System.out.println("Bônus:              " + df.format(juridica.calcBonus(2020)));

        
        
        
        
        
        
    }
    
}
