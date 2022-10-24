package state;

import java.time.LocalDate;
import java.util.ArrayList;

public class Artigo {

    private String estado;
    private ArrayList<String> logHistorico = new ArrayList<>();

    public Artigo() {
        this.estado = "RASCUNHO";
    }

    public String getEstado() {
        return estado;
    }

    public String getLogHistorico() {
        StringBuilder log = new StringBuilder();
        for (String s : logHistorico) {
            log.append(s).append("\n");

        }
        System.out.println(log);
        return log.toString();
    }

    public void publicar(){
        GerenteSeguranca gerenteSeguranca = GerenteSeguranca.getInstance();

        if("RASCUNHO".equals(this.estado)){
            if(gerenteSeguranca.ehUsuarioAutor()){
                this.estado = "REVISANDO";
                this.logHistorico.add("Transitado para REVISANDO em: " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuário não tem permissão para publicar o artigo");
            }
        }

        if("REVISANDO".equals(this.estado)){
            if(gerenteSeguranca.ehUsuarioModerador()){
                this.estado = "APROVADO";
                this.logHistorico.add("Transitado para APROVADO em: " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuário não tem permissão para publicar o artigo");
            }
        }

        if("APROVADO".equals(this.estado)){
            return;
        }
    }

    public void reprovar(){
        GerenteSeguranca gerenteSeguranca = GerenteSeguranca.getInstance();

        if("RASCUNHO".equals(this.estado)){
            return;
        }

        if("REVISANDO".equals(this.estado)){
            if(gerenteSeguranca.ehUsuarioModerador()){
                this.estado = "RASCUNHO";
                this.logHistorico.add("Transitado para RASCUNHO em: " + LocalDate.now());
                return;
            }else{
                throw new RuntimeException("Usuário não tem permissão para reprovar o artigo");
            }
        }

        if("APROVADO".equals(this.estado)){
            return;
        }
    }

}
