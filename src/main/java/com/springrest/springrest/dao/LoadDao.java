package com.springrest.springrest.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springrest.springrest.entities.Load;

@Repository
public interface LoadDao extends JpaRepository<Load, Long> {
    List<Load> findAllByShipperId(String shipperId);
}
