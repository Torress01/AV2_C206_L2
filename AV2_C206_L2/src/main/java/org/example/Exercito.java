package org.example;

public class Exercito {
    private String nome;
    private Soldado[] soldados = new Soldado[10];


    public void adicionarSoldados(Soldado S) {
        for (int i = 0; i < soldados.length; i++) {
            if (soldados[i] == null) {
                soldados[i] = S;
                return;
            }
        }
    }

    public void mostraInfo() {
        for (Soldado soldado : soldados) {
            if (soldado != null) {
                if (soldado instanceof Sargento sargento) {
                    sargento.mostraInfos();
                    sargento.UsandoItem();
                    sargento.defender();
                }
                else if (soldado instanceof Oficial oficial){
                    oficial.mostraInfos();
                    oficial.UsandoItem();
                    oficial.defender();
                }
                else if (soldado instanceof MedicoMilitar medicoMilitar){
                    medicoMilitar.mostraInfos();
                    medicoMilitar.UsandoItem();
                    medicoMilitar.curar();
                }
            }
        }
        System.out.println();
        System.out.println("Nome do exercito: " + this.nome);
        System.out.println("Quantidade total de Soldados registrados: " + Soldado.qtdSoldado);
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}