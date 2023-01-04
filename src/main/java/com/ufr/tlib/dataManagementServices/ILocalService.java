package com.ufr.tlib.dataManagementServices;

import com.ufr.tlib.excepetions.UserNotFoundException;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.models.User;

import java.util.List;

public interface ILocalService {

    public Local getLocalById(long id) throws LocalNotFoundException;
    public void addLocal(Local local, String username) throws UserNotFoundException;

    public List<Local> getListLocal();
    public Page<Local> getAllLocalPage(int page,int size);
    public Page<Local> getLocalPageByKeyword(String keyword,int page,int size);
    public Page<Local> getLocalPageByKeywordAndServiceType(String keyword, Service service, int page, int size);
    public List<Local> getListLocalByManager(String username) throws UserNotFoundException;

    public void updateLocal(Local local);




    public Local getLocal(long id);
}
