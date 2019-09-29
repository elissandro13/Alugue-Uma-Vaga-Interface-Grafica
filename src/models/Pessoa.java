package models;

public class Pessoa {

    private String nome;
    private String cpf;
    private double saldo;
    private String sexo;
    private String vaga;

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public Pessoa() {
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Pessoa(String nome, String cpf, double saldo, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
     this.nome = nome;
    }
       
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}