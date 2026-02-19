import com.bank.controller.ClienteController;
import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteControllerTest {


    @Test
    public void scoreMaiorQue500() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente1 = new Cliente("Maria", "maria@gmail.com", "7653", 550 );
        Cliente cliente2 = new Cliente("Ana", "ana@gmail.com", "5467", 430);
        Cliente cliente3 = new Cliente("Jose", "jose@yahoo.com", "5793", 800);

        clienteController.create(cliente1);
        clienteController.create(cliente2);
        clienteController.create(cliente3);

        List<Cliente> clientesScore = clienteController.scoreMaiorQue500();

        assertEquals(2, clientesScore.size());


    }
}
