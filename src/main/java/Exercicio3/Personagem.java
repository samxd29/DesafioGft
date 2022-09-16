package Exercicio3;

import java.util.List;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;

    private static int PersonagemCriado;

    public Personagem(){
        PersonagemCriado += 1;
    };

    public static int getPersonagemCriado() {
        return PersonagemCriado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void lvlUp(){
        int habilidades = forca + mana + vida + inteligencia + mana;
        xp = habilidades;
        if (xp > 200){
            level += 1;
            System.out.println("Você subiu 1 level!");
        } else {
            System.out.println("Treine suas habilidades para subir de level!");
        }

    }

}
