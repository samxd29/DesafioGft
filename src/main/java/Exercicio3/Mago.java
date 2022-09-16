package Exercicio3;

import java.util.ArrayList;
import java.util.List;


public class Mago extends Personagem{
    private List<String> magia = new ArrayList<>();

    public Mago(){};


    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public void lvlUp(){
        int habilidadesMago = super.getMana() + super.getInteligencia();
        System.out.println("Habilidade do mago é: " + habilidadesMago);
        super.lvlUp();

    }

    public void attack(){
        int minimoValor = 0;
        int maximoValor = 300;
        double ataqueMago = ((super.getInteligencia() + super.getLevel()) + (Math.random() * (maximoValor - minimoValor)));
        System.out.println("Ataque do mago é de: " + ataqueMago);

    }

    public void aprenderMagia(String magiaAprendida){
        magia.add(magiaAprendida);
    }
}
