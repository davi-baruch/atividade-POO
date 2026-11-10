package Operacoes;

import Robo.Robo;

public class ModoEconomico implements ModoOperacao{
    @Override
    public int calcularGasto(Robo robo){
        return 2;
    }
}
