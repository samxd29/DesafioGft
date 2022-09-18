package Exercicio7;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Vendedor vendedor = new Vendedor();
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(800);

        gerente.setNome("Tony Stark");
        gerente.setIdade(30);
        gerente.setSalario(1500);

        supervisor.setNome("John Snow");
        supervisor.setIdade(29);
        supervisor.setSalario(1200);

        vendedor.setNome("Jack Black");
        vendedor.setIdade(25);
        vendedor.setSalario(1000);

        System.out.println("Bonificação do Gerente " + gerente.getNome() + " de idade "
                + gerente.getIdade() + " seu salário mais bonificação é " + gerente.bonificacao());


        System.out.println("Bonificação do Supervisor " + supervisor.getNome() + " de idade "
                + supervisor.getIdade() + " seu salário mais bonificação é " + supervisor.bonificacao());


        System.out.println("Bonificação do Vendedor " + vendedor.getNome() + " de idade "
                + vendedor.getIdade() + " seu salário mais bonificação é " + vendedor.bonificacao());
    }
}