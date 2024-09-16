import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.Carro;
import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.FabricaVeiculoEletrico;
import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.FabricaVeiculoFlex;
import br.edu.ifnmg.abstractfactoryexemplofabricaveiculos.Moto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author braga
 */
public class AbstractFactoryExemploFabricaVeiculos {

    public static void main(String[] args) {
        
        FabricaVeiculoEletrico byd = new FabricaVeiculoEletrico();
        
        Carro Dolphin = byd.criarCarro();
        System.out.println(Dolphin);
        
        Moto Lexian = byd.criarMoto();
        System.out.println(Lexian);
        
        FabricaVeiculoFlex ford = new FabricaVeiculoFlex();
        Carro Fiesta = ford.criarCarro();
        System.out.println(Fiesta);
    }
}
