/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Excecoes.ErroDeLeituraException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Arthur Nunes
 */
public class LerArquivoVaga {
    public ArrayList<Vaga> read() throws ErroDeLeituraException{
        ArrayList<Vaga> vagas = new ArrayList();
        try{
            FileInputStream arquivoVaga = new FileInputStream("vaga.txt");
            InputStreamReader input = new InputStreamReader(arquivoVaga);
            BufferedReader br = new BufferedReader(input);
            String linha;
            
            while (br.ready()){
                linha = br.readLine();
                String[] infos = linha.split(";");
                Vaga vaga = new Vaga();
                vaga.setNomeDono(infos[0]);
                vaga.setNumero(Integer.parseInt(infos[1]));
                vaga.setEstado(infos[2]);
                vaga.setPreco(Double.parseDouble(infos[3]));
                
                vagas.add(vaga);
            }
            
        }catch(IOException | NumberFormatException e){
            System.out.println("Erro ao ler o Arquivo");
            throw new ErroDeLeituraException(e.getMessage());
        }
        
        return vagas;
    }
    
}
