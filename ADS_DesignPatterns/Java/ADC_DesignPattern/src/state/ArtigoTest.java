package state;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArtigoTest {

    GerenteSeguranca gerenteSeguranca = GerenteSeguranca.getInstance();

    @Test
    public void deveArtigoTrasitarDeRascunhoAteAprovado(){

        Artigo artigo = new Artigo();
        assertEquals("RASCUNHO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("AUTOR");
        artigo.publicar();
        assertEquals("REVISANDO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("MODERADOR");
        artigo.publicar();
        assertEquals("APROVADO", artigo.getEstado());
    }

    @Test
    public void deveArtigoTrasitarDeRascunhoAteReprovado(){
        Artigo artigo = new Artigo();
        assertEquals("RASCUNHO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("AUTOR");
        artigo.publicar();
        assertEquals("REVISANDO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("MODERADOR");
        artigo.reprovar();
        assertEquals("RASCUNHO", artigo.getEstado());
    }

    @Test
    public void deveFalharPorNaoTerAutorizacaoDeModerador(){
        Artigo artigo = new Artigo();
        assertEquals("RASCUNHO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("AUTOR");
        artigo.publicar();
        assertEquals("REVISANDO", artigo.getEstado());
        try{
            artigo.publicar();

            fail("Deveria ter dado erro de autorização");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        assertEquals("REVISANDO", artigo.getEstado());
    }

    @Test
    public void deveFalharPorNaoTerAutorizacaoDeAutor(){
        Artigo artigo = new Artigo();
        assertEquals("RASCUNHO", artigo.getEstado());
        gerenteSeguranca.setUsuarioLogado("OUTRO");
        try{
            artigo.publicar();

            fail("Deveria ter dado erro de autorização");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        assertEquals("RASCUNHO", artigo.getEstado());
    }

    @Test
    public void deveExibirLog(){
        Artigo artigo = new Artigo();
        gerenteSeguranca.setUsuarioLogado("AUTOR");
        artigo.publicar();
        gerenteSeguranca.setUsuarioLogado("MODERADOR");
        artigo.reprovar();
        gerenteSeguranca.setUsuarioLogado("AUTOR");
        artigo.publicar();
        gerenteSeguranca.setUsuarioLogado("MODERADOR");
        artigo.publicar();
        assertNotNull(artigo.getLogHistorico());
    }
}
