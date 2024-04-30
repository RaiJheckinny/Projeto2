package br.com.raijheckinny.service;

import br.com.raijheckinny.dao.IClienteDAO;
import br.com.raijheckinny.domain.Cliente;

public class ClienteService implements IClienteService{
    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }

    @Override
    public Boolean excluir(Long cpf) {
        clienteDAO.excluir(cpf);
        return true;
    }

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }
    @Override
    public Boolean salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
        return true;
    }

    @Override
    public Cliente buscarPorCpf(Long cpf) {
        Cliente cliente = clienteDAO.buscarPorCpf(cpf);
        return cliente;
    }
}
