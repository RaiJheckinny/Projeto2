package br.com.raijheckinny;

import br.com.raijheckinny.dao.ClienteDAO;
import br.com.raijheckinny.dao.ClienteDaoMock;
import br.com.raijheckinny.dao.IClienteDAO;
import br.com.raijheckinny.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDAO = new ClienteDaoMock();
    }

    @Before
    public void init(){
        cliente = new Cliente("Pedro",1234567890L,232223L,"fdasjflkjasd",123431,"Sao Paulo","asdjfasdlk");
    }
    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente(){
        Boolean retorno = clienteDAO.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        Boolean retorno = clienteDAO.excluir(cliente.getCpf());
        Assert.assertTrue(retorno);
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Rai Jheckinny");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("Rai Jheckinny", cliente.getNome());
    }

}
