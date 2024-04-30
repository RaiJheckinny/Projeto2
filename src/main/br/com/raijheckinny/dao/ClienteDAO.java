package br.com.raijheckinny.dao;

import br.com.raijheckinny.domain.Cliente;

import java.util.LinkedList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {
    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Boolean excluir(Long cpf) {
        return false;
    }

    List<Cliente> clienteDao;
    public ClienteDAO(){
        clienteDao = new LinkedList<>();
    }
    @Override
    public Cliente buscarPorCpf(Long cpf) {
        for (Cliente cliente : clienteDao){
            if(cliente.getCpf() == cpf){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        clienteDao.add(cliente);
        return false;
    }
}
