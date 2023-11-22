package state;

public class EstadoFalha implements EstadoConexao {
    private static final String NOME_ESTADO = "Falha";
    private final Conexao conexao;

    public EstadoFalha(Conexao conexao) {
        this.conexao = conexao;
    }

    @Override
    public void conectar() {
        System.out.println("Conexão falhou. Reconectando...");
        conexao.setEstado(new EstadoDesconectado(conexao));
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando após falha...");
        conexao.setEstado(new EstadoDesconectado(conexao));
    }

    @Override
    public void aguardar() {
        System.out.println("Não é possível aguardar após falha na conexão.");
    }

    @Override
    public void falhar() {
        System.out.println("A conexão já está em falha.");
    }

    @Override
    public String getEstado() {
        return NOME_ESTADO;
    }
}

