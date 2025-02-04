package edu.vedoque.seguridadbase.repository;

import edu.vedoque.seguridadbase.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAlumno extends JpaRepository<Alumno, Long> {
}
