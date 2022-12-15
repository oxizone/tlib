package com.ufr.tlib.dataManagementServices;

import com.ufr.tlib.excepetion.UserNotFoundException;
import com.ufr.tlib.model.User;
import com.ufr.tlib.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    public static final String ROLE_USER = "ROLE_USER";
    @Autowired
    private IUserRepo userDao;

    @Override
    public void addUser(User user) throws DataIntegrityViolationException {
        userDao.save(user);
    }

    @Override
    public void updateProfil(User olduser) throws UserNotFoundException {

    }

    @Override
    public void updateUser(User user) throws DataIntegrityViolationException {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(int id) throws UserNotFoundException {
        User user = this.getUserById(id);
        userDao.delete(user);
    }

    @Override
    public User getUserById(int userId) throws UserNotFoundException {
        return userDao.findById(userId).orElseThrow(UserNotFoundException::new);
    }
}
