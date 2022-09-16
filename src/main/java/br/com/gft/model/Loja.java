package br.com.gft.model;

import java.util.List;

public class Loja{
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja(){

    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros(){

        for (int i = 0; i < livros.size(); i++){
            if (livros.isEmpty()){
                System.out.println("A loja não tem livros no seu estoque!");
            } else {
                System.out.println(livros.get(i).getAutor());
            }
        }
    }

    public void listaVideoGames(){

        for (int i = 0; i < videoGames.size(); i++){
            if (videoGames.isEmpty()){
                System.out.println("A loja não tem videogames no seu estoque");
            } else {
                System.out.println(videoGames.get(i).getMarca());
            }
        }
    }

    public double calculaPatrimonio(){
        double soma = 0;
        double somaLivro = 0;
        double somaVideoGame = 0;
        for (int i = 0; i < livros.size(); i++){
            // quando for acumular valor a variavel recebe ela mesma mais o valor;
            somaLivro =  somaLivro + livros.get(i).getQtd() * livros.get(i).getPreco();
        }

        for (int i = 0; i < videoGames.size();i++){
            // quando for acumular valor a variavel recebe ela mesma mais o valor;
            somaVideoGame = somaVideoGame + videoGames.get(i).getQtd() * videoGames.get(i).getPreco();
        }

        soma = somaLivro + somaVideoGame;
        return soma;
    }
}
