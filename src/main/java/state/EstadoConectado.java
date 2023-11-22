package state;

public class EstadoConectado implements EstadoConexao {
    private static final String NOME_ESTADO = "Conectado";
    private final Conexao conexao;

    public EstadoConectado(Conexao conexao) {
        this.conexao = conexao;
    }

    @Override
    public void conectar() {
        System.out.println("Já está conectado.");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando...");
        conexao.setEstado(new EstadoDesconectado(conexao));
    }

    @Override
    public void aguardar() {
        System.out.println("Aguardando não é possível quando está conectado.");
    }

    @Override
    public void falhar() {
        System.out.println("A conexão falhou.");
        conexao.setEstado(new EstadoFalha(conexao));
    }

    @Override
    public String getEstado() {
        return NOME_ESTADO;
    }
}
