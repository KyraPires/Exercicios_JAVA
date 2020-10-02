
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */

//Classe abstrata possui um ou mais métodos abstratos
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    //metodo abstrato é um método que só tem assinatura
    abstract public double calcSalBruto(); //indica apenas a operação
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
    
}
