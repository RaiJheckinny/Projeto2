package br.com.raijheckinny.dao;

import br.com.raijheckinny.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO{
    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Boolean excluir(Long cpf) {
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = new Cliente("Pedro",1234567890L,232223L,"fdasjflkjasd",123431,"Sao Paulo","asdjfasdlk");
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Boolean salvar(Cliente cliente) {

        return true;
    }
}
