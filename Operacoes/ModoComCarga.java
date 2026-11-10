package Operacoes;

import Robo.Robo;

public class ModoComCarga implements ModoOperacao {
    private ModoOperacao modoBase;

    public ModoComCarga(ModoOperacao modoBase) {
        if (modoBase != null){
            this.modoBase = modoBase;
        }
    }

    @Override
    public int calcularGasto(Robo robo) {
        return modoBase.calcularGasto(robo) - 3;
    }
}
