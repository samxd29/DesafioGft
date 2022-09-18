package Exercicio7;

public class Gerente extends Funcionario{

    @Override
    public int bonificacao() {
        int salarioGerente = super.getSalario() + 10000;
        return salarioGerente;
    }
}