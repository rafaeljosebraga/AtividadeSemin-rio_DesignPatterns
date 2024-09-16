/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.ExemploBridgeEnviar;

/**
 *
 * @author braga
 */
public abstract class Mensagem {
    protected Mensageiro mensageiro;
    public Mensagem(Mensageiro mensageiro){
        this.mensageiro=mensageiro;
    }
    public abstract void enviar(String mensagem);
}
