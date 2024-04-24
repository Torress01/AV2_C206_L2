package org.example;

public class Main {
    public static void main(String[] args) {
        //criando exercito
    Exercito exercito1 = new Exercito();
    exercito1.setNome("Tropa");

    //criando itens especiais
    ItemEspecial item1 = new ItemEspecial();
    item1.tipo = "tipo A";

    ItemEspecial item2 = new ItemEspecial();
    item2.tipo = "tipo B";

    //criando oficial
    Oficial oficial = new Oficial();
    oficial.setNome("Gabriel");
    oficial.setCpf(414121413);
    oficial.setPatente("Oficial 2");
    oficial.itemEspecial = item1;

    //criando sargento
    Sargento sargento = new Sargento();
    sargento.setNome("Matheus");
    sargento.setCpf(412214023);
    sargento.setEspecializacao("Guerrilheiro");
    sargento.setExperienciaCombate(500);
    sargento.itemEspecial= item1;

    //criando medicomilitar
    MedicoMilitar medicomilitar = new MedicoMilitar();
    medicomilitar.setNome("Julio Cesar");
    medicomilitar.setCpf(891284198);
    medicomilitar.setAnosExperiencia(30);
    medicomilitar.setCapacidadeEmergencia(500);
    medicomilitar.itemEspecial = item2;

    //adicionando soldados
    exercito1.adicionarSoldados(oficial);
    exercito1.adicionarSoldados(sargento);
    exercito1.adicionarSoldados(medicomilitar);

    //mostrando informaçoes
    exercito1.mostraInfo();

    }
}