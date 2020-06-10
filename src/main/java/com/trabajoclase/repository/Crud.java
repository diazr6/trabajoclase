package com.trabajoclase.repository;
import java.util.List;

public abstract class Crud<T, E> {

    protected E repository;

    // Constructor de la clase
    public Crud(E repository){
        this.repository = repository;
    }

    public abstract List<T> list();
    public abstract T get(int id);
    public abstract void add(T o);
    public abstract void update(T o, int id);
    public abstract void delete(int id);

}