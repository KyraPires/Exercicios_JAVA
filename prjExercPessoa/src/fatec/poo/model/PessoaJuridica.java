
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class PessoaJuridica extends Pessoa{
    private String CGC;
    private Double taxaIncentivo;

    public PessoaJuridica(String CGC, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;
    }

    public void setTaxaIncentivo(Double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    public Double getTaxaIncentivo() {
        return taxaIncentivo;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        return(taxaIncentivo/100 * getTotalCompras())* (anoAtual - getAnoInscricao());                
    }

    public String getCGC() {
        return CGC;
    }
    
}
