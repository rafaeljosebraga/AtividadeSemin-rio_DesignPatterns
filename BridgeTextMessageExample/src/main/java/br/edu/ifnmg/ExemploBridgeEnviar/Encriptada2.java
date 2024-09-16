/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.ExemploBridgeEnviar;



/**
 *
 * @author braga
 */
public class Encriptada2 extends Mensagem{

    public Encriptada2(Mensageiro mensageiro) {
        super(mensageiro);
    }

    @Override
    public void enviar(String mensagem) {
        mensageiro.enviar("Criptografada:"+criptografarCesar(mensagem,1));
    }
    public static String criptografarCesar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (Character.isLetter(caractere)) {
                char base = Character.isLowerCase(caractere) ? 'a' : 'A';
                caractere = (char) ((caractere - base + deslocamento) % 26 + base);
            }
            resultado.append(caractere);
        }

        return resultado.toString();
    }
}
