
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */

//extends especifica o vinculo de herança da superclasse
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, String dataNascimento) {
        super(nome, dataNascimento); //chamada do método construtor da superclasse pessoa
        this.regEscolar = regEscolar;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }
    
    
}
