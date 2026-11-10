package Operacoes;

import Robo.Robo;

public class ModoNormal implements ModoOperacao{

    @Override
    public int calcularGasto(Robo robo){
        return -5;
    }
}
