package model;

public class Carro {
    private int id;
    private String marca;
    private String combustivel;
    private int ano;
    private double preco;

    public Carro (){}

    public Carro(int id, String marca, String combustivel, int ano, double preco) {
        this.setId(id);
        this.setMarca(marca);
        this.setCombustivel(combustivel);
        this.setAno(ano);
        this.setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "\nCódigo = " + id +
                "\nMarca = " + marca +
                "\nTipo combustivel = " + combustivel +
                "\nAno de fabricação = " + ano +
                "\nPreco = " + preco;
    }
}
