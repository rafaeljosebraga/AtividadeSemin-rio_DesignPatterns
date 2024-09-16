/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.ExemploBridgeEnviar;

/**
 *
 * @author braga
 */
public class Encriptada extends Mensagem{

    public Encriptada(Mensageiro mensageiro) {
        super(mensageiro);
    }

    @Override
    public void enviar(String mensagem) {
        mensageiro.enviar("Criptografada:"+criptografarXor(mensagem,'a'));
    }
    
    private static String criptografarXor(String texto, char chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            resultado.append((char) (texto.charAt(i) ^ chave)); // Operação XOR
        }

        return resultado.toString();
    }
}
