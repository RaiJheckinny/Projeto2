package br.com.raijheckinny.dao;

import br.com.raijheckinny.domain.Cliente;

public interface IClienteDAO {
    public Boolean salvar(Cliente cliente);
    public Cliente buscarPorCpf(Long cpf);

    public Boolean excluir(Long cpf);

    public void alterar(Cliente cliente);
}
