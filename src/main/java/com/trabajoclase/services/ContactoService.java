package com.trabajoclase.services;

import com.trabajoclase.models.Contacto;
import com.trabajoclase.repository.Crud;
import com.trabajoclase.repository.ContactoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService extends Crud<Contacto, ContactoRepositorio> {

    public ContactoService(ContactoRepositorio repository) {
        super(repository);
    }

    @Override
    public List<Contacto> list() {
        return repository.findAll();
    }

    @Override
    public Contacto get(int id) {
        return null;
    }

    @Override
    public void add(Contacto o) {
        // Envía el objeto a la tabla de la base de datos: Persistencia
        repository.save(o);

    }

    @Override
    public void update(Contacto o, int id) {

        o.setId(id);

        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}