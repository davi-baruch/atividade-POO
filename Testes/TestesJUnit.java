package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Robo.*;
import Operacoes.*;
import feitos.*;

public class TestesJUnit {
    @Test
    void reatribuirVariavelNaoTrocaModo(){
        Robo robo1 = new RoboTerrestre("Optimus", 1, 100, 4);
        ModoOperacao modo= new ModoTurbo();

        robo1.ativarModo(modo);

        modo = new ModoNormal();

        assertEquals(85, robo1.getBateria());
        assertEquals(-5, modo.calcularGasto(robo1));
    }

    @Test
    void acrescentaCargaAoGastoTurbo(){
        Robo robo1 = new Drone("Fly", 2, 50, 100);
        ModoOperacao operacaoComCarga = new ModoComCarga(new ModoEconomico());

        robo1.ativarModo(operacaoComCarga);

        assertEquals(45, robo1.getBateria());
    }

    @Test
    void delegaUmaVezComOMesmoRobo(){
        Robo robo1 = new RoboBraco("Arm", 3, 80, 3);
        ModoRegistrado base = new ModoRegistrado(40);
        ModoOperacao operacaoComCarga = new ModoComCarga(base);

        int gasto1 = operacaoComCarga.calcularGasto(robo1);

        assertEquals(37, gasto1);
        assertEquals(1, base.getContador());
        assertEquals(true, base.getUltimoRobo() == robo1);
    }
}
