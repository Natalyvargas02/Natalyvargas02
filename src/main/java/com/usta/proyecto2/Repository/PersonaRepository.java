package com.usta.proyecto2.Repository;

import com.usta.proyecto2.Entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
