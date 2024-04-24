package org.example;

public class MedicoMilitar extends Soldado implements Curar {
    private int anosExperiencia;
    private int capacidadeEmergencia;

    @Override
    public void mostraInfos(){
        System.out.println();
        System.out.println("Infos do Medico:");
        super.mostraInfos();
        System.out.println("Especializacao: " + this.anosExperiencia);
        System.out.println("Experiencia de combate: " + this.capacidadeEmergencia);
    }

    @Override
    public void UsandoItem() {
        if(this.itemEspecial == null)
            System.out.println(this.getNome() + " não tem item especial");

        System.out.println(this.getNome() + " está utilizando item especial");
        this.capacidadeEmergencia += 100;
    }

    @Override
    public void curar() {
        if (capacidadeEmergencia > 920) {
            System.out.println(this.getNome() + " Conseguiu curar");
        } else {
            System.out.println(this.getNome() + " Não conseguiu curar");
        }
    }

    //getters e setters
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }
}

