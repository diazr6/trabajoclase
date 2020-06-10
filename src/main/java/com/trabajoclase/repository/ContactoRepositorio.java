package com.trabajoclase.repository;

import com.trabajoclase.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {

}
