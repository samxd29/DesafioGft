package Exercicio7;

public class Vendedor extends Funcionario{

    @Override
    public int bonificacao() {
        int salarioVendedor = super.getSalario() + 3000;
        return salarioVendedor;
    }
}
