package com.cenfotec.examen3.examen3.Service;


import com.cenfotec.examen3.examen3.Entities.Responsable;
import com.cenfotec.examen3.examen3.Entities.User;
import com.cenfotec.examen3.examen3.Repository.ResponsableRepository;
import com.cenfotec.examen3.examen3.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public List<User> getAllResponsables(int count) {
        return this.userRepo.findAll().stream().limit(count).collect(Collectors.toList());
    }

    public Optional<User> getResponsable(int id) {
        return this.userRepo.findById(id);
    }

    public User createUser(String nombre, String plan,
                                         String alergias,
                                         Responsable responsable) {
        User user = new User();
        user.setNombre(nombre);
        user.setPlan(plan);
        user.setAlergias(alergias);
        user.setResponsableId(responsable);

        return this.userRepo.save(user);
    }

    public void save(User userEntity) {
        this.userRepo.save(userEntity);
    }
}