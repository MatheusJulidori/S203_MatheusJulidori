package state;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EstadoRevisando implements Estado{

    private Artigo artigo;

    public EstadoRevisando(Artigo artigo) {
        super();
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if(seguranca.ehUsuarioModerador()) {
            this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
            this.artigo.getLogHistorico().add("Transitado para APROVADO em "+ LocalDateTime.now());
            return;
        }else {
            throw new RuntimeException("Usuario não tem permissao para publicar");
        }

    }

    @Override
    public void reprovar() {
        GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();

        if(seguranca.ehUsuarioModerador()) {
            this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
            this.artigo.getLogHistorico().add("Transitado para RASCUNHO em " + LocalDate.now());
            return;
        }else {
            throw new RuntimeException("Usuario nao tem permissao para reprovar");
        }


    }

}