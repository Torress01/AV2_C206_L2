package org.example;

public abstract class Soldado {
    public static int qtdSoldado = 0;
    private String nome;
    private long cpf;

    ItemEspecial itemEspecial;

    Soldado(){
        Soldado.qtdSoldado++;
    }

    public void mostraInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
    }

    public abstract void UsandoItem();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


}

