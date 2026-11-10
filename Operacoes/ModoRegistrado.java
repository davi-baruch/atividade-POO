package Operacoes;

import Robo.Robo;

public class ModoRegistrado implements ModoOperacao{
    private int gasto;
    private int contador;
    private Robo ultimoRobo;

    public ModoRegistrado(int gasto){
        this.gasto = gasto;
    }

    @Override
    public int calcularGasto(Robo robo){
        contador += 1;
        ultimoRobo = robo;

        return gasto;
    }

    public int getContador(){
        return contador;
    }

    public Robo getUltimoRobo(){
        return ultimoRobo;
    }
}
