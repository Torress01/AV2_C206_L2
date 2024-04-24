package org.example;

public class Oficial extends Soldado implements Defesa {
    private String patente;

    @Override
    public void mostraInfos(){
        System.out.println();
        System.out.println("Infos do Oficial:");
        super.mostraInfos();
        System.out.println("Patente: " + this.patente);
    }

    @Override
    public void UsandoItem() {
        if(this.itemEspecial == null)
            System.out.println(this.getNome() + " Não tem item especial");

        System.out.println(this.getNome() + " está utilizando item especial");
    }


    public void defender() {
        if (this.itemEspecial != null) {
            System.out.println(this.getNome() + " Conseguiu se defender");
        } else {
            System.out.println(this.getNome() + "nao conseguiu se defender");
        }
    }

    //getters e setters
    public void setPatente(String patente) {
        this.patente = patente;
    }
}

