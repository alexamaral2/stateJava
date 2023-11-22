package state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConexaoTest {

    @Test
    public void testTransicaoDeEstadoConexao() {
        Conexao conexao = new Conexao();

        assertEquals("Desconectado", conexao.getNomeEstado());

        conexao.conectar();
        assertEquals("Conectado", conexao.getNomeEstado());

        conexao.desconectar();
        assertEquals("Desconectado", conexao.getNomeEstado());

        conexao.aguardar();
        assertEquals("Aguardando", conexao.getNomeEstado());

        conexao.falhar();
        assertEquals("Falha", conexao.getNomeEstado());

        conexao.desconectar();
        assertEquals("Desconectado", conexao.getNomeEstado());
    }
}

