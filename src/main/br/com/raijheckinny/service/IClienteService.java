package br.com.raijheckinny.service;

import br.com.raijheckinny.domain.Cliente;

public interface IClienteService {
    public Boolean salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);

    Boolean excluir(Long cpf);

    void alterar(Cliente cliente);
}
