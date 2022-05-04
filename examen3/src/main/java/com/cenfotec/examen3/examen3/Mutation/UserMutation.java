package com.cenfotec.examen3.examen3.Mutation;

import com.cenfotec.examen3.examen3.Entities.Responsable;
import com.cenfotec.examen3.examen3.Service.ResponsableService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserMutation {

    @Autowired
    private ResponsableService responsableService;

    public Responsable createResponsable(String nombre, String cedula,
                                         String direccion,
                                         String telefonoPrimario, String telefonoSecundario) {

        return this.responsableService.createResponsable(nombre, cedula, direccion, telefonoPrimario,telefonoSecundario);
    }

    public Responsable updateResponsable(int id, String nombre, String cedula,
                                         String direccion,
                                         String telefonoPrimario, String telefonoSecundario) {
        Optional<Responsable> responsable = this.responsableService.getResponsable(id);
        if (responsable.isPresent()) {
            Responsable responsableEntity = responsable.get();
            if (nombre!=null)
                responsableEntity.setNombre(nombre);
            if (cedula != null)
                responsableEntity.setCedula(cedula);
            if (direccion != null)
                responsableEntity.setDireccion(direccion);
            if (telefonoPrimario != null)
                responsableEntity.setTelefonoPrimario(telefonoPrimario);
            if (telefonoSecundario != null)
                responsableEntity.setTelefonoSecundario(telefonoSecundario);
            responsableService.save(responsableEntity);
            return responsableEntity;
        }
        return null;
    }
}
