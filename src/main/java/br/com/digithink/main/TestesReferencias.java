package br.com.digithink.main;

import br.com.digithink.model.Designer;
import br.com.digithink.model.EditorVideo;
import br.com.digithink.model.Gerente;
import br.com.digithink.service.ControleBonificacao;

public class TestesReferencias {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Giovanna");
        gerente.setSalario(5000.0);
        System.out.println("Autenticou? " +gerente.autentica(123456));

        EditorVideo editorVideo = new EditorVideo();
        gerente.setNome("Ailton");
        editorVideo.setSalario(2500.0);

        Designer designer = new Designer();
        gerente.setNome("Guilherme");
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());

        


    }
    
}
