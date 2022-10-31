package state;

import java.time.LocalDateTime;

public class EstadoRascunho implements Estado{

    private Artigo artigo;

    public EstadoRascunho(Artigo artigo) {
        super();
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if(seguranca.ehUsuarioAutor()) {
            this.artigo.transitarEstadoPara(new EstadoRevisando(artigo));
            this.artigo.getLogHistorico().add("Transitado para REVISANDO em " + LocalDateTime.now());
            return;
        } else {
            throw new RuntimeException("Usuario não tem permissao para publicar");
        }
    }

    @Override
    public void reprovar() {
        //faz nada
    }


}