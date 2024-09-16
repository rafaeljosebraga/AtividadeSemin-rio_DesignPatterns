/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.ExemploBridgeEnviar;

/**
 *
 * @author braga
 */
public class Normal extends Mensagem{

    public Normal(Mensageiro mensageiro) {
        super(mensageiro);
    }

    @Override
    public void enviar(String mensagem) {
        mensageiro.enviar("Normal:"+mensagem);
    }
    
}
