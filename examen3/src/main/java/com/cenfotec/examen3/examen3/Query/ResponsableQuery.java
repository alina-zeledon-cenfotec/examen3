package com.cenfotec.examen3.examen3.Query;

import com.cenfotec.examen3.examen3.Entities.Responsable;
import com.cenfotec.examen3.examen3.Service.ResponsableService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ResponsableQuery implements GraphQLQueryResolver {

    @Autowired
    private ResponsableService responsableService;

    public List<Responsable> getResponsables(int count) {
        return this.responsableService.getAllResponsables(count);
    }
    public Optional<Responsable> getResponsable(int id) {
        return this.responsableService.getResponsable(id);
    }


}