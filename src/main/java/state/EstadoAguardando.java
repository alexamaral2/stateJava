package state;

public class EstadoAguardando implements EstadoConexao {
    private static final String NOME_ESTADO = "Aguardando";
    private final Conexao conexao;

    public EstadoAguardando(Conexao conexao) {
        this.conexao = conexao;
    }

    @Override
    public void conectar() {
        System.out.println("Conexão já está aguardando.");
    }

    @Override
    public void desconectar() {
        System.out.println("Cancelando aguardo de conexão...");
        conexao.setEstado(new EstadoDesconectado(conexao));
    }

    @Override
    public void aguardar() {
        System.out.println("Aguardando conexão...");
    }

    @Override
    public void falhar() {
        System.out.println("A conexão falhou ao aguardar.");
        conexao.setEstado(new EstadoFalha(conexao));
    }

    @Override
    public String getEstado() {
        return NOME_ESTADO;
    }
}