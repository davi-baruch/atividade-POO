package Robo;

import Operacoes.ModoOperacao;

public class Robo{
    // Estados
    private String nome;
    private int id;
    private int bateria;

    // Construtor
    public Robo(String nome, int id, int bateria){
        if (nome != null){
            this.nome = nome;
        }
        else{
            this.nome = "robo";
        }
        if (id > 0){
            this.id = id;
        }
        if (bateria >= 0 && bateria <= 100){
            this.bateria = bateria;
        }
    }

    // Métodos
    public void ligar(){
        System.out.printf("%s foi ligado\n", nome);
    }

    protected void realizarMovimento(){
        System.out.printf("%s se moveu\n", nome);
    }

    protected void verificarBateria(){
        if(getBateria() < 20){
            System.out.println("ALERTA: O robô '" + getNome() + "' precisar ser carregado\nBateria atual em " + getBateria() + "%");
        }
    }

    public void mover(){
        realizarMovimento();
        verificarBateria();
    }

    public void exibirStatus(){
        System.out.printf("Status atual\nnome: %s\nid: %d\nbateria: %s\n", nome, id, bateria);
    }

    protected void gastarBateria(int quantidade){
        if (quantidade > 0){
            bateria = bateria - quantidade;

            if (bateria < 0){
                bateria = 0;
            }
        }
    }

    public void ativarModo(ModoOperacao modo){
        if(modo != null){
            gastarBateria(modo.calcularGasto(this));
            verificarBateria();
        }
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getBateria(){
        return bateria;
    }

    public int getId(){
        return id;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
}