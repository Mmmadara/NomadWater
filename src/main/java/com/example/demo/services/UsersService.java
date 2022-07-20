package com.example.demo.services;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UsersRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepo usersRepo;

    public UsersService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public Users createUser(Users users){
        return usersRepo.save(users);
    }

    public Users updateUserFirstNameAndLastName(String userId, String firstName, String lastName){
        Users toUpdateUser = usersRepo.findById(Long.parseLong(userId)).orElseThrow();
        toUpdateUser.setFirstname(firstName);
        toUpdateUser.setLastname(lastName);

        return usersRepo.save(toUpdateUser);
    }

    public void deleteUser(String userId){
        Users toDeleteUser = usersRepo.findById(Long.parseLong(userId)).orElseThrow();
        usersRepo.delete(toDeleteUser);
    }

    public List<Users> getAllUsers(){
        return usersRepo.findAll();
    }
}
