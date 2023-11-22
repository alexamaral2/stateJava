package state;

public interface EstadoConexao {
    void conectar();
    void desconectar();
    void aguardar();
    void falhar();
    String getEstado();
}
