import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Valquiria Pires
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.80);
        
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020, "Ana Beatriz", "22/07/88", 600);
        
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", 10);
        funcCom.setCargo("Vendedor");
       
       //instanciação de objetos da 
       //classe Departamento
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
       
      //instanciação de  um objeto da 
      //classe Projeto
       Projeto objPrj = new Projeto(1010, "Segurança no Trabalho");
       objPrj.setDtInicio("23/10/2020");
       objPrj.setDtTermino("27/11/2020");
	  
      
      //Estabelecer a associação binária entre um (1) 
      //objeto da classe Departamento com 1 ou mais (1..*)
      //objetos da classe FuncionarioHorista, FuncionarioMensalista
      //e FuncionarioComissionado
       objDep1.addFuncionario(funcHor);
       objDep1.addFuncionario(funcMen);
       objDep1.listarFuncionarios();
      
       objDep2.addFuncionario(funcCom);
       objDep2.listarFuncionarios();
      
       System.out.println("\n\nO Funcionario Horista " + funcHor.getNome() + 
                         " trabalha no Departamento " + funcHor.getDepartamento().getNome());
            
       System.out.println("O Funcionario Mensalista " + funcMen.getNome() + 
                          " trabalha no Departamento " + funcMen.getDepartamento().getNome());
      
       System.out.println("O Funcionario Comissionado " + funcCom.getNome() + 
                         " trabalha no Departamento " + funcCom.getDepartamento().getNome());
      
          
      //estabelecendo a associação binária
      //entre 1 objeto da classe Projeto
      //com 1 ou mais objetos da classe Funcionario 
      //(Horista, Mensalista, Comissionado)
      objPrj.addFuncionario(funcHor);
      objPrj.addFuncionario(funcMen);
      objPrj.addFuncionario(funcCom);
      
      objPrj.listarFuncionarios();
    }    
}
