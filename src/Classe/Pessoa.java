package Classe;;

public abstract class Pessoa {
    private String nomecompleto;
    private int idade;
    private String cpf;
    private String endereco;
    private String celular;

    /* public Pessoa(String nomecompleto, int idade, String cpf, String endereco, String celular){
        this.nomecompleto = nomecompleto;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
    } */

    public void setNomeCompleto(String nomecompleto){
        this.nomecompleto = nomecompleto;
    }

    public String getNomeCompleto(){
        return this.nomecompleto;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getCelular(){
        return this.celular;
    }
}
