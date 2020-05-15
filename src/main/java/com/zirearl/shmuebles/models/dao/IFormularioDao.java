package com.zirearl.shmuebles.models.dao;

import com.zirearl.shmuebles.models.entity.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFormularioDao extends JpaRepository<Formulario, Long> {
}
