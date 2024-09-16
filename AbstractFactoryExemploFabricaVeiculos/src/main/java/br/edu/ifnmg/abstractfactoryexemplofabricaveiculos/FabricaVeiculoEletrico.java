/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.abstractfactoryexemplofabricaveiculos;

import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.eletrico.CarroEletrico;
import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.eletrico.MotoEletrica;

/**
 *
 * @author braga
 */
public class FabricaVeiculoEletrico implements FabricaVeiculo {

    @Override
    public Carro criarCarro() {
        return new CarroEletrico();
    }

    @Override
    public Moto criarMoto() {
        return new MotoEletrica();
    }
    
}
