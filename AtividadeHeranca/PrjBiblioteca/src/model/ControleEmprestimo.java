package model;

import java.time.LocalDate;

public class ControleEmprestimo {
    public static String registroEmprestimo(int idEmprestimo, Usuario usuario, Livro livro){
        if(!livro.isDisponivel()){return "Livro Indisponivel\n";}
        livro.setDisponivel(false);
        RegistroEmprestimo emprestimo = new RegistroEmprestimo(idEmprestimo, usuario, livro);
        System.out.println("Emprestimo registrado para: " + emprestimo.getUsuario().getNome() +
                            "\nLivro: " + emprestimo.getLivro().getTitulo() +
                            "\nData Emprestimo: " + emprestimo.getDataEmprestimo());
        return "Emprestimo realizado com sucesso!\n";
    }

    public static String registraDevolucao(int idEmprestimo, Usuario usuario, Livro livro){
        if(livro.isDisponivel()){return "Livro ja devolvido\n";}
        livro.setDisponivel(true);
        RegistroEmprestimo emprestimo = new RegistroEmprestimo(idEmprestimo, usuario, livro);
        emprestimo.setDataDevolucao(LocalDate.now());
        System.out.println("Devolucao registrada para: " + emprestimo.getUsuario().getNome() +
                "\nLivro: " + emprestimo.getLivro().getTitulo() +
                "\nData emprestimo: " + emprestimo.getDataEmprestimo() +
                "\nData devolucao: " + emprestimo.getDataDevolucao());
        return "Devolucao realizada com sucesso!\n";
    }
}
