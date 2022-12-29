package com.ufr.tlib.dataManagementServices;

import com.ufr.tlib.excepetions.UserNotFoundException;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.models.User;

import java.util.List;

public interface ILocalService {

    public void addLocal(Local local, String username) throws UserNotFoundException;

    public List<Local> getListLocal();
    public List<Local> getListLocalByManager(String username) throws UserNotFoundException;


}
