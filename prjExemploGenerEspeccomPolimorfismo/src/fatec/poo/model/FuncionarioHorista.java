
package fatec.poo.model;

/**
 *
 * @author Valquiria Pires
 */
public class FuncionarioHorista extends Funcionario {
    private double valHorTrab;
    private int qtdeHorTrab;

    //prestar atenção na hora de criar o método construtor automaticamento pela ordem dos parametros estar diferente da modelagem
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        super(registro, nome, dtAdmissao); //chamada do me´todo construtor da superclasse Funcionario
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    //polimorfismo: 
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab); //implementação da operação herdade
    }
    
    
    
}
