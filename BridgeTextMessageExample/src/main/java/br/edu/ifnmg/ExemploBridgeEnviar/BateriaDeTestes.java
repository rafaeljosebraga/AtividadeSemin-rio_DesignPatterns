/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.ExemploBridgeEnviar;

/**
 *
 * @author braga
 */
public class BateriaDeTestes {

    public static void main(String[] args) {
        Mensageiro emailer;
        emailer = new ViaEmail();
        //1 teste
        Mensagem mensagem=new Normal(emailer);
        String texto="Eu gosto de carros";
        mensagem.enviar(texto);
        //2 teste
        mensagem=new Encriptada(emailer);
        mensagem.enviar(texto);
        //3 teste
        emailer = new ViaSMS();
        mensagem=new Encriptada2(emailer);
        mensagem.enviar(texto);
    }
    
}
