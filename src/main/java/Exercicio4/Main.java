package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João",15));
        pessoas.add(new Pessoa("Leandro",21));
        pessoas.add(new Pessoa("Paulo",17));
        pessoas.add(new Pessoa("Jessica",18));

        int valoMaximo = 0;
        int valorMinimo = 0;

        for(int i = 0; i < pessoas.size(); i++){
            for(int j = 0; j < pessoas.size(); j++){
                if (pessoas.get(i).getIdade() == pessoas.get(j).getIdade()){
                    valoMaximo = Math.max(valoMaximo,pessoas.get(i).getIdade());
                }
            }
        }

        System.out.println("A pessoa de maior idade é: " + valoMaximo);
        System.out.println("A quantidade de pessoas é: " + pessoas.size());

        for(int i = 0; i < pessoas.size(); i++){
            if (pessoas.get(i).getIdade() < 18){
                pessoas.remove(i);
            }
        }

        System.out.println("A quantidade de pessoa maiores de idade é: " + pessoas.size());

        for(int i = 0; i < pessoas.size(); i++){
            if(pessoas.get(i).getNome().equals("Jessica")){
                System.out.println("Sua idade é: " + pessoas.get(i).getIdade());
            }
        }

    }
}
