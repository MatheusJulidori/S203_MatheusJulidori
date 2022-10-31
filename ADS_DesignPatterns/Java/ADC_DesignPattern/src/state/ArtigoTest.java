package state;

import org.junit.Test;

import static org.junit.Assert.*;

class ArtigoTest {

    @Test
    void deveArtigoTransitarDeRascunhoAteAprovado() {
        GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

        Artigo artigo = new Artigo();

        assertTrue(artigo.getEstado() instanceof EstadoRascunho);

        //1-Rascunho -> Revisando
        gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
        artigo.publicar();

        assertTrue(artigo.getEstado() instanceof EstadoRevisando);

        //2-Revisando -> Aprovado
        gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
        artigo.publicar();

        assertTrue(artigo.getEstado() instanceof EstadoAprovado);

        //imprime o historico
        artigo.getLogHistorico().forEach(System.out::println);

    }

    @Test
    void deveArtigoTransitarDeRascunho_Revisando_Rascunho() {
        GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

        Artigo artigo = new Artigo();

        assertTrue(artigo.getEstado() instanceof EstadoRascunho);

        //1-Rascunho -> Revisando
        gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
        artigo.publicar();

        assertTrue(artigo.getEstado() instanceof EstadoRevisando);

        //2-Revisando -> Rascunho
        gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
        artigo.reprovar();

        assertTrue(artigo.getEstado() instanceof EstadoRascunho);

        //imprime o historico
        artigo.getLogHistorico().forEach(System.out::println);
    }

}