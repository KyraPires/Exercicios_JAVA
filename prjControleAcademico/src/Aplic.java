
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Professor;
import fatec.poo.model.Turma;


/**
 *
 * @author Valquiria Pires
 */
public class Aplic {

    
    public static void main(String[] args) {
        Professor objProf = new Professor("1010", "Josenildo Fonseca");
        
        Turma objTurma = new Turma("ADS-NO", 40);
        
        Curso objCurso = new Curso("ADS", "Análise e Desenvolvimento de Sistemas", "360 horas");
        
        Aluno objAluno1 = new Aluno("303312", "Frida Gonçalves");
        Aluno objAluno2 = new Aluno("303313", "Sara de Oliveira");
        Aluno objAluno3 = new Aluno("303314", "Alexandre o Grande");
        Aluno objAluno4 = new Aluno("303315", "Bjorn Ragnarson");
        Aluno objAluno5 = new Aluno("303316", "Brunhild Valkyrja");
        
        //associações binárias unidirecional
       //entre Turma e Curso, Turma e Professor,
       //Turma e Aluno
       objTurma.setCurso(objCurso);
       objTurma.setProfessor(objProf);
       objTurma.addAluno(objAluno1);
       objTurma.addAluno(objAluno2);
       objTurma.addAluno(objAluno3);
       objTurma.addAluno(objAluno4);
       objTurma.addAluno(objAluno5);
        
       objTurma.listarAlunos(); 
                
    }
    
}
