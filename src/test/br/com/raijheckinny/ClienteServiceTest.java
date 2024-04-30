package br.com.raijheckinny;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.raijheckinny.dao.ClienteDaoMock;
import br.com.raijheckinny.dao.IClienteDAO;
import br.com.raijheckinny.domain.Cliente;
import br.com.raijheckinny.service.ClienteService;
import br.com.raijheckinny.service.IClienteService;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init(){
        cliente = new Cliente("Pedro",1234567890L,232223L,"fdasjflkjasd",123431,"Sao Paulo","asdjfasdlk");
        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente(){
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente(){
        Boolean retorno = clienteService.excluir(cliente.getCpf());
        Assert.assertTrue(retorno);
    }

    @Test
    public void alterarCliente(){
        cliente.setNome("Rai Jheckinny");
        clienteService.alterar(cliente);
        Assert.assertEquals("Rai Jheckinny", cliente.getNome());
    }
}
