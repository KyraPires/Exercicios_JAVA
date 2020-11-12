
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        double bonus=0;
        if (getTotalCompras() > 12000){
            bonus = (anoAtual - getAnoInscricao()) * base;
            return bonus;
                    }
        else{
            return 0;             
        }        
    }

    public String getCPF() {
        return cpf;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    
    
}
