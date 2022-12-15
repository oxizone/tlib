package com.ufr.tlib.dataManagementServices;

import com.ufr.tlib.excepetion.UserNotFoundException;
import com.ufr.tlib.model.User;
import org.springframework.dao.DataIntegrityViolationException;

public interface IUserService {

    public void addUser(User user) throws DataIntegrityViolationException;
    public void updateUser(User user) throws DataIntegrityViolationException;
    public void updateProfil(User user) throws UserNotFoundException;
    public void deleteUserById(int id) throws UserNotFoundException;
    public User getUserById(int id) throws UserNotFoundException;
}


