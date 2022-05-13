package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
