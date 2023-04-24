package com.api.Crud.repository;

import com.api.Crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz que define la capa de acceso a datos para la entidad de usuario.
 *
 * Esta interfaz extiende de JpaRepository para heredar los métodos CRUD básicos
 * y define los métodos específicos de acceso a datos para la entidad UserModel.
 *
 * @author [nombre del autor]
 * @version [número de versión]
 */
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}

