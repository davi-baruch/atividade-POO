package Operacoes;

import Robo.Robo;

public class ModoTurbo implements ModoOperacao {
    @Override
    public int calcularGasto(Robo robo){
        return 15;
    }
}
