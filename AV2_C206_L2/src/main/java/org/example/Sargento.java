package org.example;

public class Sargento extends Soldado implements Defesa {
    private String especializacao;
    private int experienciaCombate = 0;

    @Override
    public void mostraInfos(){
        System.out.println();
        System.out.println("Infos do Sargento:");
        super.mostraInfos();
        System.out.println("Especializacao: " + this.especializacao);
        System.out.println("Experiencia de combate: " + this.experienciaCombate);
    }

    @Override
    public void UsandoItem() {
        if(this.itemEspecial == null)
            System.out.println(this.getNome() + " Não tem item especial");

        System.out.println(this.getNome() + " está utilizando item especial");
        this.experienciaCombate += 300;
    }

    @Override
    public void defender() {
        if(this.experienciaCombate > 650){
            System.out.println(this.getNome() + " Conseguiu se defender");
        }
        else{
        System.out.println(this.getNome() + " nao conseguiu se defender");
        }
    }

    //getters e setters
    public void setEspecializacao(String especialização) {
        this.especializacao = especialização;
    }

    public void setExperienciaCombate(int experienciaCombate) {
        this.experienciaCombate = experienciaCombate;
    }
}

