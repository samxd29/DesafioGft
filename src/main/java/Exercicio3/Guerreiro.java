package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{
    private List<String> habilidade = new ArrayList<>();

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public void lvlUp() {
        int habilidadesGuerreiro = super.getForca() + super.getVida();
        System.out.println("Habilidade do Guerreiro: " + habilidadesGuerreiro);
        super.lvlUp();
    }

    public void attack(){
        int minimoValor = 0;
        int maximoValor = 300;
        double ataqueGuerreiro = ((super.getForca() + super.getLevel()) + (Math.random() * (maximoValor - minimoValor)));
        System.out.println("Ataque do Guerreiro é de: " + ataqueGuerreiro);

    }

    public void aprenderHabilidade(String habilidadeAprendida){
        habilidade.add(habilidadeAprendida);
    }
}
