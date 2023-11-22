package state;

// Classe Conexao que faz uso do padrão State
public class Conexao {
    private EstadoConexao estado;

    public Conexao() {
        this.estado = new EstadoDesconectado(this);
    }

    public void setEstado(EstadoConexao estado) {
        this.estado = estado;
    }

    public void conectar() {
        estado.conectar();
    }

    public void desconectar() {
        estado.desconectar();
    }

    public void aguardar() {
        estado.aguardar();
    }

    public void falhar() {
        estado.falhar();
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
}
