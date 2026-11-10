package Efeitos;
import Robo.Robo;

public class Colisao implements Efeito{
    @Override
    public int aplicarEfeito(Robo robo){
        return -10;
    }
}
