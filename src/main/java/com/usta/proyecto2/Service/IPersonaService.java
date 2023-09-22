package com.usta.proyecto2.Service;

import com.usta.proyecto2.Entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<PersonaEntity> findAll();
    public Optional<PersonaEntity> findById(Long id);
    public void save(PersonaEntity persona);
    public  void delete(Long id);

}
