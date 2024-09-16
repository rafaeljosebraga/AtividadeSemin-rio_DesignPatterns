/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.ExemploBridgeEnviar;

/**
 *
 * @author braga
 */
public class ViaSMS implements Mensageiro {
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS>> "+ mensagem);
    }
}
