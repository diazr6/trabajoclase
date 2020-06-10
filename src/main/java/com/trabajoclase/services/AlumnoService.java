package com.trabajoclase.services;

import com.trabajoclase.models.Alumno;
import com.trabajoclase.repository.Crud;
import com.trabajoclase.repository.AlumnoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService extends Crud<Alumno, AlumnoRepositorio> {

    public AlumnoService(AlumnoRepositorio repository) {
        super(repository);
    }

    @Override
    public List<Alumno> list() {
        return repository.findAll();
    }

    @Override
    public Alumno get(int id) {
        return null;
    }

    @Override
    public void add(Alumno o) {
        // Envía el objeto a la tabla de la base de datos: Persistencia
        repository.save(o);

    }

    @Override
    public void update(Alumno o, int id) {

        o.setId(id);

        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}