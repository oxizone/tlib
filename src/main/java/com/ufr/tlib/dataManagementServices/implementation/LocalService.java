package com.ufr.tlib.dataManagementServices.implementation;

import com.ufr.tlib.dataManagementServices.ILocalService;
import com.ufr.tlib.models.Local;
import com.ufr.tlib.repository.ILocalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService implements ILocalService {

    @Autowired
    private ILocalDao localDao;

    @Override
    public void addLocal(Local local) {
        localDao.save(local);
    }
}
