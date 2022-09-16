package Exercicio3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago();
        mago.setNome("Harry Potter");
        mago.setInteligencia(20);
        mago.setForca(40);
        mago.setMana(60);
        mago.setVida(100);
        mago.setForca(30);
        mago.setLevel(1);
        mago.setXp(116.0F);

        mago.attack();
        mago.lvlUp();

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.setNome("Turim Escudo de Carvalho");
        guerreiro.setInteligencia(30);
        guerreiro.setForca(80);
        guerreiro.setVida(30);
        guerreiro.setMana(50);
        guerreiro.setLevel(1);
        guerreiro.setXp(119.0F);
        guerreiro.attack();
        guerreiro.lvlUp();

        Personagem personagem = new Personagem();
        Personagem personagem1 = new Personagem();
        System.out.println(Personagem.getPersonagemCriado());

        mago.aprenderMagia("Obliviate");
        mago.aprenderMagia("Alohomora");

        guerreiro.aprenderHabilidade("defender");

    }
}
