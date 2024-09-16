/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.abstractfactoryexemplofabricaveiculos;

import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.flex.CarroFlex;
import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.flex.MotoFlex;

/**
 *
 * @author braga
 */
public class FabricaVeiculoFlex implements FabricaVeiculo{

    @Override
    public Carro criarCarro() {
        return new CarroFlex();
    }

    @Override
    public Moto criarMoto() {
        return new MotoFlex();
    }
    
}
