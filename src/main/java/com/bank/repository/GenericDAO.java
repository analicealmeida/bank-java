package com.bank.repository;

public interface GenericDAO<V, K> {

    boolean create(V v);
    V read(K k);
    boolean update(K k, V v);
    boolean delete(K k);
}
