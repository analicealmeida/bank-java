package com.bank.repository.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private Funcionario[] funcionarios = new Funcionario[100];
    private int contador = 0;
    @Override
    public boolean create (Funcionario funcionario) {

        funcionarios[contador] = funcionario;
        contador++;
        return true;
    }

    @Override
    public Funcionario read(String cpf) {
        //percorre o array para encontrar os dados para ser lido
        for(int i=0; i<funcionarios.length; i++){
            //se o indice com o cpf por compativel com o cpf do usuario, retorne funcionario
            if (funcionarios[i].getCpf().equalsIgnoreCase(cpf)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    @Override
    public boolean update(String cpf, Funcionario funcionario) {
        //percorre o array
        for(int i=0; i<funcionarios.length; i++){

            if(funcionarios[i].getCpf().equalsIgnoreCase(cpf)){

                   funcionarios[i] = funcionario;
                System.out.println("Atualizado com sucesso");
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean delete(String cpf) {
        //variavel com o valor -1 de não encontrado
        int indiceDelete = -1;
        //percorre o array, se o o cpf armazenado no indice de funcionários for igual ao cpf do usuario
        //armazene o cpf no indiceDelete
        for (int i=0; i<funcionarios.length; i++){
            if(funcionarios[i].getCpf().equalsIgnoreCase(cpf)){
                indiceDelete = i;
                break;
            }
        }
        //se não encontrado retorne falso
        if(indiceDelete == -1){
            return false;
        }
        //Substitui o funcionário que será deletado pelo último funcionário válido do array, evitando buracos na estrutura
        funcionarios[indiceDelete] = funcionarios[contador -1];
        //Remove a referência duplicada no final do array recevendo null
        funcionarios[contador -1] = null;
        //Atualiza o contador para refletir a nova quantidade de elementos.
        contador --;
        return true;
    }

}
