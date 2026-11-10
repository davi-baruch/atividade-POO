package Robo;

public class Drone extends Robo{
    private int altitudeMax;

    public Drone(String nome, int id, int bateria, int altitudeMax){
        super(nome, id, bateria);
        this.altitudeMax = altitudeMax;
    }

    public int getAltitudeMax(){
        return altitudeMax;
    }

    @Override
    protected void realizarMovimento(){
        gastarBateria(10);
        System.out.println("o drone '" + getNome() + "' voou até a altitude máxima de " + getAltitudeMax() + " metros\n");
    }
}
