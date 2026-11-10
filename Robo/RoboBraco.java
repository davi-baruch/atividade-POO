package Robo;

public class RoboBraco extends Robo{
    private int alcance;

    public RoboBraco(String nome, int id, int bateria, int alcance){
        super(nome, id, bateria);
        this.alcance = alcance;
    }

    public int getAlcance(){
        return alcance;
    }

    @Override
    protected void realizarMovimento(){
        bateria(-15);
        System.out.println("o robô braço '" + getNome() + "' se moveu com seu alcance de " + getAlcance() + " metros\n");
    }
}
