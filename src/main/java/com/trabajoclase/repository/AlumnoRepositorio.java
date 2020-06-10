package com.trabajoclase.repository;

import com.trabajoclase.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer> {
}
