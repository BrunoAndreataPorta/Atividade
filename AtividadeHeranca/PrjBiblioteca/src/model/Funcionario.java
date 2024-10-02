package model;

public class Funcionario extends Usuario{
    private String setor;
    private String cargo;

    public Funcionario(int idUsuario, String nome, String email, String setor, String cargo){
        super(idUsuario, nome, email);
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSetor: " + setor
                + "\nCargo: " + cargo + "\n";
    }
}
