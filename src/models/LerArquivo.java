package models;

import Excecoes.ErroDeLeituraException;
import java.io.*;
import java.util.ArrayList;

public class LerArquivo {
    
    public ArrayList<Pessoa> read() throws ErroDeLeituraException{
        ArrayList<Pessoa> pessoas = new ArrayList();
        try{
            FileInputStream arquivo = new FileInputStream("arquivo.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);
            String linha;
            
            while (br.ready()){
                linha = br.readLine();
                String[] infos = linha.split(";");
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(infos[0]);
                pessoa.setSexo(infos[1]);
                pessoa.setCpf(infos[2]);
                pessoa.setSaldo(Double.parseDouble(infos[3]));
                
                pessoas.add(pessoa);
            }
            
        }catch(IOException | NumberFormatException e){
            System.out.println("Erro ao ler o Arquivo");
            throw new ErroDeLeituraException(e.getMessage());
        }
        
        return pessoas;
    }

}
