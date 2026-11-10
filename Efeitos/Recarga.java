package Efeitos;
import Robo.Robo;

public class Recarga implements Efeito{
    @Override
    public int aplicarEfeito(Robo robo){
        return 20;
    }
}
