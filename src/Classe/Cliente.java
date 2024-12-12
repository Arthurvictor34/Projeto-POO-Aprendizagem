package Classe;

public class Cliente extends Pessoa{
    private int cadastro;
    private String aniversario;

    /*public Cliente(String nomecompleto, int idade, String cpf, String endereco, String celular, int cadastro, String aniversario){
        super(nomecompleto, idade, cpf, endereco, celular);
        this.cadastro = cadastro;
        this.aniversario = aniversario;
    } */
   
    public void setCadastro(int cadastro){
        this.cadastro = cadastro;
    }

    public int getCadastro(){
        return this.cadastro;
    }

    public void setAniversario(String aniversario){
        this.aniversario = aniversario;
    }

    public String getAniversario(){
        return this.aniversario;
    }
}
