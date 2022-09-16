package Exercicio1;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int acelerar(){
        return velocidade += 20;
    }

    public boolean abastecer(int combustivel){
        if(litrosCombustivel < 60){
            double espacoTanque = 60 - litrosCombustivel;
                if(combustivel <= espacoTanque){
                    litrosCombustivel += combustivel;
                    System.out.println("Abastecido!");
                    return true;
                } else {
                    System.out.println("O espaço do tanque é: " + espacoTanque + " não é possível abastecer " +
                            combustivel + " pois o limite total é 60");
                    return false;
                }
        } else {
            System.out.println("O limite do tanque de combustível é de 60 litros!");
            return false;
        }

    }

    public boolean frear(){
        if(velocidade > 0){
            velocidade -= 20;
            return true;
        } else {
            System.out.println("Veiculo parado!");
            return false;
        }

    }

    public void pintar(String cor){
        this.cor = cor;
    }

    public void ligar(){
        if (isLigado){
            System.out.println("Carro ja está ligado!");
        } else {
            this.isLigado = true;
            System.out.println("Carro foi ligado!");
        }
    }

    public void desligar(){
        if (isLigado){
            if(velocidade <= 0){
                this.isLigado = false;
                System.out.println("Carro foi desligado!");
            } else {
                System.out.println("Carro está andando!");
            }
        } else {
            System.out.println("Carro está desligado!");
        }
    }
}
