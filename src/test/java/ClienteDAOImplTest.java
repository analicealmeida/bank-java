import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteDAOImplTest {

    @Test
    public void createTeste() {
        //instancia a classe
        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();

        //cria dados para testar
        Cliente cliente = new Cliente("Ana", "ana@gmail.com");

        //executa o metodo
        boolean resultado = clienteDAO.create(cliente);
        //verifica se o resultado esta correto
        assertTrue(resultado);

    }

    @Test
    public void readTeste() {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente cliente = new Cliente("Ana", "ana@gmail.com", "123");
        clienteDAO.create(cliente);
        Cliente resultado = clienteDAO.read("123");

        assertEquals("123", resultado.getCpf());

    }

    @Test
    public void updateTeste() {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente cliente = new Cliente("Ana", "ana@gmail.com", "123456");
        clienteDAO.create(cliente);
        Cliente atualizado = new Cliente("Maria", "maria@gmail.com", "123456");
        boolean resultado = clienteDAO.update("123456", atualizado);
        assertTrue(resultado);

        Cliente resultado2 = clienteDAO.read("123456");
        assertEquals(resultado2.getNome(), "Maria");


    }

    @Test
    public void deleteTeste() {
        ClienteDAOImpl clienteDAO = new ClienteDAOImpl();
        Cliente cliente = new Cliente("Ana", "ana@gmail.com", "123");
        clienteDAO.create(cliente);

        boolean resultado = clienteDAO.delete("123");
        assertTrue(resultado);

        Cliente resultado2 = clienteDAO.read("123");
        assertNull(resultado2);

    }

    @Test
    public void validacaoTest() {

    }
}
