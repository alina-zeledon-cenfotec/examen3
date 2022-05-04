package com.cenfotec.examen3.examen3.Service;

import com.cenfotec.examen3.examen3.Entities.Responsable;
import com.cenfotec.examen3.examen3.Repository.ResponsableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResponsableService {

    @Autowired
    ResponsableRepository responsableRepo;

    public List<Responsable> getAllResponsables(int count) {
        return this.responsableRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<Responsable> getResponsable(int id) {
        return this.responsableRepo.findById(id);
    }

    public Responsable createResponsable(String nombre, String cedula,
                                     String direccion,
                                     String telefonoPrimario, String telefonoSecundario) {
        Responsable responsable = new Responsable();
        responsable.setNombre(nombre);
        responsable.setCedula(cedula);
        responsable.setDireccion(direccion);
        responsable.setTelefonoPrimario(telefonoPrimario);
        responsable.setTelefonoSecundario(telefonoSecundario);
        return this.responsableRepo.save(responsable);
    }

    public void save(Responsable responsableEntity) {
        this.responsableRepo.save(responsableEntity);
    }
}