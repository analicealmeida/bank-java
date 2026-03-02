package com.bank.exception;

public class ClienteNaoEncontradoException extends RuntimeException {
//essa classe herdará tudo de runtimeexception,

    public ClienteNaoEncontradoException(String mensagem) {
        super(mensagem);
    }

}
