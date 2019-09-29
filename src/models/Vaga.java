package models;



public class Vaga extends BemAlugavel {
    private int numero;
    private String nomeDono;
    public Vaga(Pessoa dono, String estado, int numero,double valor) {
        super(dono, estado, valor);
        this.numero = numero;
    }

    public Vaga() {
        
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    @Override
    public  double getPreco(){
        return this.preco;
    }
    


}