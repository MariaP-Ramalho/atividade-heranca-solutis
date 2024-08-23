package br.com.dudadev.models;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){
        this.nome= "Não Informado";
        this.endereco= "Não Informado";
        this.telefone= "Não Informado";
    }

    public Pessoa (String nome,String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.endereco = "Não informado";
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                " Telefone: " + getTelefone() +
                " Endereço: " +getEndereco();
    }
}
