package com.usta.proyecto2.Rest;

import com.usta.proyecto2.Entity.PersonaEntity;
import com.usta.proyecto2.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
public class PersonaRest {

    @Autowired
    private IPersonaService iPersonaService;

    @GetMapping("/listar")
    private ResponseEntity<List<PersonaEntity>> listarPersonas() {
        return ResponseEntity.ok(iPersonaService.findAll());
    }

    @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<Void> deleteById(@PathVariable("id")Long id){

        iPersonaService.delete(id);
        return ResponseEntity.ok().build();

    }

    @GetMapping("/findby/{id}")
    private ResponseEntity<Optional<PersonaEntity>> ListarById(@PathVariable("id") @Min(1) Long id) {
        return ResponseEntity.ok(iPersonaService.findById(id));
    }

    @PostMapping("/crear")
    private ResponseEntity<PersonaEntity> guardar(@Validated @RequestBody PersonaEntity persona) {
        try {
            iPersonaService.save(persona);
            ResponseEntity.status(200);
            return ResponseEntity.ok(persona);
        } catch (Exception e) {
            System.out.println("El error es " + e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }

    }

}
