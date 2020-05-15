package com.zirearl.shmuebles.models.dao;

import com.zirearl.shmuebles.models.entity.Muebles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMuebleDao extends JpaRepository<Muebles, Integer> {
    @Query(value="SELECT * FROM muebles WHERE categoria = ?1", nativeQuery = true)
    List<Muebles> findByCategory(@Param("categoria") String categoria);
}
