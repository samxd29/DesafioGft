package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        veiculo.setCor("Vermelho");
        veiculo.setVelocidade(20);
        veiculo.setLitrosCombustivel(10);
        veiculo.setMarca("Hyundai");
        veiculo.setModelo("Hb20");
        veiculo.setPlaca("Br2345");
        veiculo.setKm(veiculo.getKm());



        veiculo.pintar("Azul");


        veiculo.ligar();
        veiculo.ligar();
        System.out.println("A marca do meu carro é: " + veiculo.getMarca());
        System.out.println("O modelo do carro: " + veiculo.getModelo());
        System.out.println("A cor do carro: " + veiculo.getCor());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Qual quantidade pretende abastecer? " + veiculo.getLitrosCombustivel());
        System.out.println(veiculo.abastecer(50));
        System.out.println("Velocidade atual: " + veiculo.getVelocidade());
        System.out.println("Pisou no freio!" +veiculo.frear());
        System.out.println("Pisou no freio!" +veiculo.frear());
        System.out.println("A velocidade do veiculo é de: "+ veiculo.getVelocidade());
//        System.out.println("Estou acelerando e a velocidade é: " + veiculo.acelerar());
//        System.out.println("Estou acelerando e a velocidade é: " + veiculo.acelerar());

        veiculo.desligar();
        veiculo.desligar();


    }
}
