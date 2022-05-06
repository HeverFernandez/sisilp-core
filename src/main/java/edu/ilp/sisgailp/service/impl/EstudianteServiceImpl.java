package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IEstudianteDao;
import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);
    }
}
