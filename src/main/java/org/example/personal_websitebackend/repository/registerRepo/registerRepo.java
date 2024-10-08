package org.example.personal_websitebackend.repository.registerRepo;

import org.example.personal_websitebackend.presentation.login;
import org.example.personal_websitebackend.presentation.userRegister.register;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface
registerRepo extends JpaRepository<register, Integer> {
    register findByEmailAndPassword(String email, String password);

    register findByEmail(String email);

    register findByemail(String email);


}
