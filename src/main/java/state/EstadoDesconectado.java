package state;

// Estado Desconectado
public class EstadoDesconectado implements EstadoConexao {
    private static final String NOME_ESTADO = "Desconectado";
    private final Conexao conexao;

    public EstadoDesconectado(Conexao conexao) {
        this.conexao = conexao;
    }

    @Override
    public void conectar() {
        System.out.println("Conectando...");
        conexao.setEstado(new EstadoConectado(conexao));
    }

    @Override
    public void desconectar() {
        System.out.println("Já está desconectado.");
    }

    @Override
    public void aguardar() {
        System.out.println("Aguardando conexão...");
        conexao.setEstado(new EstadoAguardando(conexao));
    }

    @Override
    public void falhar() {
        System.out.println("Não é possível falhar, a conexão não está ativa.");
    }

    @Override
    public String getEstado() {
        return NOME_ESTADO;
    }
}
