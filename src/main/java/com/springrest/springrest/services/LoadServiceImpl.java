package com.springrest.springrest.services;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    private LoadDao loadDao;

    @Override
    public void addLoad(Load load) {
        loadDao.save(load);
    }

    @Override
    public List<Load> getLoadsByShipperId(String shipperId) {
        return loadDao.findAllByShipperId(shipperId);
    }

    @Override
    public Load getLoadById(long loadId) {
        Optional<Load> optionalLoad = loadDao.findById(loadId);
        return optionalLoad.orElse(null);
    }

    @Override
    public Load updateLoad(long loadId, Load load) {
        load.setId(loadId);
        return loadDao.save(load);
    }

    @Override
    public void deleteLoad(long loadId) {
        loadDao.deleteById(loadId);
    }
}
