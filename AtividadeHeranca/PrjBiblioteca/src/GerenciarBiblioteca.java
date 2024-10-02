import model.*;

public class GerenciarBiblioteca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Bruno", "bruno.porta@fatec.sp.gov.br", "ADS", "13844");
        Professor professor = new Professor(1, "Maromo", "marcos.moraes@fatec.sp.gov.br", "TI", "64910");
        Funcionario funcionario = new Funcionario(1, "Gabriel", "gabriel.silva@fatec.sp.gov.br", "Administracao", "Proprietario");

        Livro livro1 = new Livro("Java para iniciantes", "Maromo", 1);
        Livro livro2 = new Livro("Engenharia de Software para novatos", "Paulo Cesar", 2);
        Livro livro3 = new Livro("Como treinar seu dragao", "Cressida Cowel", 3);

        System.out.println(ControleEmprestimo.registroEmprestimo(1, aluno, livro3));
        System.out.println(ControleEmprestimo.registroEmprestimo(2, professor, livro2));
        System.out.println(ControleEmprestimo.registroEmprestimo(3, funcionario, livro1));

        System.out.println(ControleEmprestimo.registraDevolucao(1, aluno, livro3));
        System.out.println(ControleEmprestimo.registraDevolucao(2, professor, livro2));
        System.out.println(ControleEmprestimo.registraDevolucao(3, funcionario, livro1));
    }
}
