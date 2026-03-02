package com.bank.repository;

import com.bank.model.Funcionario;

public interface GenericDAO<V, K> {

    boolean create(V v);
    V read(K k);
    boolean update(String k, V v);
    boolean delete(K k);
}
