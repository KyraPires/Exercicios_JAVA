
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Valquiria Pires
 */
public class Turma{
    private String sigla;
    private int qtdeVagas;
    private Curso curso;
    private Professor professor;
    private ArrayList<Aluno> alunos;   

    public Turma(String sigla, int qtdeVagas) {
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
        alunos = new ArrayList<Aluno>();
    }
    
    public String getSigla() {
        return sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void addAluno (Aluno a){
        alunos.add(a);        
    }
    
    public void listarAlunos(){
        System.out.println("Lista de Frequência");
        System.out.println("Sigla do curso: " + curso.getSigla()+ "\t\tNome do Curso: " + curso.getDescricao());
        System.out.println("Sigla Turma: " + sigla);
        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("\n\nRA\t| Nome");
        System.out.println("----------------------------------");
        
        for (int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getRa() + "\t| " + alunos.get(i).getNome());
        }
               
    }
}
