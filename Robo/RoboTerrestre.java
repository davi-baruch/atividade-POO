package Robo;

public class RoboTerrestre extends Robo{
    private int rodas;

    public RoboTerrestre(String nome, int id, int bateria, int rodas){
        super(nome, id, bateria);
        this.rodas = rodas;
    }

    public int getRodas(){
        return rodas;
    }

    @Override
    protected void realizarMovimento(){
        gastarBateria(5);
        System.out.println("o robô terrestre '" + getNome() + "' se moveu com suas " + getRodas() + " rodas\n");
    }
}
