package state;

public class GerenteSeguranca {

    private static GerenteSeguranca instance;

    private GerenteSeguranca(){}

    public static GerenteSeguranca getInstance(){
        if(instance == null){
            instance = new GerenteSeguranca();
        }
        return instance;
    }
    private String usuarioLogado;

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public boolean ehUsuarioAutor(){
        return "AUTOR".equals(this.usuarioLogado);
    }

    public boolean ehUsuarioModerador(){
        return "MODERADOR".equals(this.usuarioLogado);
    }

}
