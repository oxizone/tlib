package com.ufr.tlib.dataManagementServices.implementation;

import com.ufr.tlib.dataManagementServices.ILocalService;
import com.ufr.tlib.dataManagementServices.IUserService;
import com.ufr.tlib.excepetions.LocalNotFoundException;
import com.ufr.tlib.excepetions.UserNotFoundException;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.models.User;
import com.ufr.tlib.repository.ILocalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService implements ILocalService {

    @Autowired
    private ILocalDao localDao;

    @Autowired
    private IUserService userService;

    @Override
    public Local getLocalById(long id) throws LocalNotFoundException {
        return localDao.findById(id).orElseThrow(LocalNotFoundException::new);
    }

    @Override
    public void addLocal(Local local, String username) throws UserNotFoundException {
        User manager = userService.getUserByUserName(username);
        local.setManager(manager);
        local.setEnabled(false);
        localDao.save(local);
    }

    @Override
    public List<Local> getListLocal() {
        return localDao.findAll();
    }

    @Override
    public List<Local> getListLocalByManager(String username) throws UserNotFoundException {
        User manager = userService.getUserByUserName(username);
        return localDao.getLocalByManager(manager);
    }

    @Override
    public void updateLocal(Local local) {
        localDao.save(local);
    }
}
