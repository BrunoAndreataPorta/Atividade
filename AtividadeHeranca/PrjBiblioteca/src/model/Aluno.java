package model;

public class Aluno extends Usuario {
    private String curso;
    private String matricula;

    public Aluno(int idUsuario, String nome, String email, String curso, String matricula){
        super(idUsuario, nome, email);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCurso: " + curso
                + "\nMatricula: " + matricula + "\n";
    }
}
