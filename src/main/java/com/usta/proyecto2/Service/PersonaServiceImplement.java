package com.usta.proyecto2.Service;


import com.usta.proyecto2.Entity.PersonaEntity;
import com.usta.proyecto2.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImplement implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<PersonaEntity> findAll() {return personaRepository.findAll();
    }

    @Override
    public Optional<PersonaEntity> findById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(PersonaEntity persona) {
        personaRepository.save(persona);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }


}
