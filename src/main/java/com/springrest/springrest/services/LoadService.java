package com.springrest.springrest.services;

import com.springrest.springrest.entities.Load;

import java.util.List;

public interface LoadService {

    void addLoad(Load load);

    List<Load> getLoadsByShipperId(String shipperId);

    Load getLoadById(long loadId);

    Load updateLoad(long loadId, Load load);

    void deleteLoad(long loadId);
}
