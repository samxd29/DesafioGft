package br.com.gft.main;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Harry Potter ", 40, 50," J. K. Rowlling ", " fantasia ", 300);
        Livro l2 = new Livro("Senhor dos Aneis ", 60, 30," J. R. R. Tolkien ", " fantasia ", 500);
        Livro l3 = new Livro("Java Poo ", 20, 50," GFT ", "educativo", 500);

        VideoGame ps4 = new VideoGame("PS4 ", 1800, 100, " Sony", " Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4 ", 1000, 7, " Sony", " Slim", true);
        VideoGame xbox = new VideoGame("XBOX ", 1500, 500, " Microsoft", " One", false);


        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas ", "12345678", livros, games);

        americanas.listaLivros();
        americanas.listaVideoGames();

        System.out.println("R$ " + l2.calculaImposto() + " sobre o livro " + l2.getNome());
        System.out.println("Livro " + l3.getNome() + " imposto: " + l3.calculaImposto());
        System.out.println("==================================================================");

        System.out.println( "Imposto " + ps4.getNome() + ps4.getModelo() + " usado, R$ " + ps4Usado.calculaImposto());
        System.out.println( "Imposto " + ps4.getNome() + ps4.getModelo() + ", R$ " + ps4.calculaImposto());
        System.out.println("==========================================================================================");
        System.out.println("A loja " + americanas.getNome() + "possui estes livros para a venda: ");
        System.out.println("Titulo: "+ l1.getNome() + " preço: " + l1.getPreco()+ " quantidade " + l1.getQtd()+ " em estoque");
        System.out.println("Titulo: "+ l2.getNome() + " preço: " + l2.getPreco()+ " quantidade " + l2.getQtd()+ " em estoque");
        System.out.println("Titulo: "+ l3.getNome() + " preço: " + l3.getPreco()+ " quantidade " + l3.getQtd()+ " em estoque");
        System.out.println("===========================================================================================");
        System.out.println("A loja " + americanas.getNome() + "possui estes video games para a venda: ");
        System.out.println("Titulo: "+ ps4.getNome() + " preço: " + ps4.getPreco()+ " quantidade " + ps4.getQtd()+ " em estoque");
        System.out.println("Titulo: "+ ps4Usado.getNome() + " preço: " + ps4Usado.getPreco()+ " quantidade " + ps4Usado.getQtd()+ " em estoque");
        System.out.println("Titulo: "+ xbox.getNome() + " preço: " + xbox.getPreco()+ " quantidade " + xbox.getQtd()+ " em estoque");
        System.out.println("==============================================================================================");
        System.out.println("O patrimonio da loja: "+ americanas.getNome() + " é de R$ " + americanas.calculaPatrimonio());


    }
}