
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;

/**
 *
 * @author Valquiria Pires
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //instanciação do obj da classe Aluno
        Aluno objAluno = new Aluno(1010, "Carlos Solveira", "15/03/1978");
        
        objAluno.setMensalidade(1500);
        System.out.println("Registro escolar: " + objAluno.getRegEscolar());
        System.out.println("Nome: " + objAluno.getNome());
        System.out.println("Data Nascimento: " + objAluno.getDataNascimento());
        System.out.println("Mensalidade: " + df.format(objAluno.getMensalidade()));
        
        //instanciação do obj da classe professor
        Professor objProfessor = new Professor(1234, 2000, "João da Silva", "02/09/1959");
        
        objProfessor.setSalario(1345.50);
        System.out.println("Registro Funcionário: " + objProfessor.getRegFuncional());
        System.out.println("Nome: " + objProfessor.getNome());
        System.out.println("Data Nascimento: " + objProfessor.getDataNascimento());
        System.out.println("Salário: " + df.format(objProfessor.getSalario()));
        
        
        
    }
    
}
