package com.zirearl.shmuebles.models.services;

import com.zirearl.shmuebles.models.dao.IFormularioDao;
import com.zirearl.shmuebles.models.entity.Formulario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormularioService implements IFormularioService {
    @Autowired
    private IFormularioDao formularioDao;

    @Override
    @Transactional
    public Formulario saveForm(Formulario formulario) {
        return formularioDao.save(formulario);
    }
}
