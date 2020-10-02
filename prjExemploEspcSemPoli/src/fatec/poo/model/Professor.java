
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class Professor extends Pessoa{
    
    private int regFuncional;
    private double salario;

    public Professor(int regFuncional, double salario, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.regFuncional = regFuncional;
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRegFuncional() {
        return regFuncional;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
}
