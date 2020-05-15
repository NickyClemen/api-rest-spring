package com.zirearl.shmuebles.models.services;

import com.zirearl.shmuebles.models.dao.IMuebleDao;
import com.zirearl.shmuebles.models.entity.Muebles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MueblesService implements IMueblesService {
    @Autowired
    private IMuebleDao muebleDao;

    @Override
    @Transactional(readOnly = true)
    public List<Muebles> findAll() {
        return (List<Muebles>) muebleDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Muebles findById(Muebles muebles) {
        return muebleDao.findById(muebles.getIdMueble()).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Muebles> findByCategory(Muebles muebles) {
        return muebleDao.findByCategory(muebles.getCategoria());
    }

}
