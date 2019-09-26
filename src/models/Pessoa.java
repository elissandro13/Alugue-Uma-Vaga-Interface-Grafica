package models;

public class Pessoa {

    private final String nome;
    private String cpf;
    private double saldo;
    private String sexo;

    public Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Pessoa(String nome,String cpf,double saldo,String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.sexo = sexo;
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

    @Override
    public String toString() {
        return "\n\t######################\n\t" + this.nome + "\n\tCPF : "  + this.cpf + "\n\tSaldo : " + this.saldo +"\n\t######################";
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}