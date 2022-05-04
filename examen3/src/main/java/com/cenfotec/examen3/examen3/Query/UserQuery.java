package com.cenfotec.examen3.examen3.Query;

import com.cenfotec.examen3.examen3.Entities.User;
import com.cenfotec.examen3.examen3.Service.ResponsableService;
import com.cenfotec.examen3.examen3.Service.UserService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    private UserService userService;
    public List<User> getUsers(int count) {
        return this.userService.getAllResponsables(count);
    }
    public Optional<User> getUser(int id) {
        return this.userService.getResponsable(id);
    }

}