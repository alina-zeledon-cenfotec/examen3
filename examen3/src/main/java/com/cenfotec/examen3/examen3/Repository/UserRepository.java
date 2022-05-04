package com.cenfotec.examen3.examen3.Repository;

import com.cenfotec.examen3.examen3.Entities.Responsable;
import com.cenfotec.examen3.examen3.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
