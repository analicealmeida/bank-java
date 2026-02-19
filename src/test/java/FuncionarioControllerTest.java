import com.bank.controller.ClienteController;
import com.bank.controller.FuncionarioController;
import com.bank.model.Cliente;
import com.bank.model.Funcionario;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioControllerTest {

    @Test
    public void numeroCargoIntern() {

        FuncionarioController funcionarioController = new FuncionarioController();
        Funcionario func1 = new Funcionario("234", "Carolina", "carolina@gmail.com");
        Funcionario func2 = new Funcionario("876", "Camila", "camila@gmail.com");
        Funcionario func3 = new Funcionario("362", "Lucas", "lucas@gmail.com");

        funcionarioController.create(func1);
        funcionarioController.create(func2);
        funcionarioController.create(func3);

        List<Funcionario> funcionarioScore = funcionarioController.numeroCargoIntern();

        assertEquals(15, funcionariosEstagiarios.size());


    }
}
