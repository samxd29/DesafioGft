package Exercicio7;

public class Supervisor extends Funcionario{

    @Override
    public int bonificacao() {
        int salarioSupervisor = super.getSalario() + 5000;
        return salarioSupervisor;
    }
}
