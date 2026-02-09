package com.bank.repository.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    //quero trabalhar com a estrutura de dados da classe Cliente
    List<Cliente> dataBase = new ArrayList<>();

    @Override
    public boolean create(Cliente cliente) {
        return dataBase.add(cliente);
    }

    @Override
    public Cliente read(String cpf) {
        for(Cliente c : dataBase) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    //TODO
    // anotação para sobrescrever um metodo da interface
    //assinatura do método com cpf como parametros, cpf será o dado para identificar que cliente atualizar
    @Override
    public boolean update(String cpf, Cliente cliente) {
        //para atualizar uma lista temos que percorrer a lista para acharmos o dado que o cliente quer atualizar
        for (int i = 0; i < dataBase.size(); i++)
            //pegamos o objeto da posição i, acessamos o cpf dele e comparamos com o do usuario
            if (dataBase.get(i).getCpf().equals(cpf)){
                //set para alterar, get para obter os dados
                dataBase.set(i, cliente);
                //retorna true se deu sucesso a atualização
                return true;

            }
        //retorna falso se não encontrou o cpf
        return false;

    }

    //TODO
    @Override
    public boolean delete(String cpf){
        //percorre a lista em busca do elemento a ser deletado
        for (int i=0; i<dataBase.size();i++) {
            //obtem o cpf do indice da lista e compara com o cpf que o usuario quer deletar
            if (dataBase.get(i).getCpf().equalsIgnoreCase(cpf)) {
                //metodo remove para deletar o indice
                dataBase.remove(i);
                //retorna true se obtiver sucesso
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Cliente> getAll() {
        return this.dataBase;
    }
}
