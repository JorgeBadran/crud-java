package com.api.Crud.services;

import com.api.Crud.models.UserModel;
import com.api.Crud.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Clase que define los servicios para la entidad de usuario.
 *
 * Esta clase define los métodos de servicio para obtener, crear, actualizar y eliminar
 * usuarios a través del acceso a datos proporcionado por IUserRepository.
 *
 * @author [nombre del autor]
 * @version [número de versión]
 */
@Service
public class UserServices {

    @Autowired
    IUserRepository userRepository;

    /**
     * Obtiene una lista de todos los usuarios.
     *
     * @return ArrayList con los usuarios existentes
     */
    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    /**
     * Crea un nuevo usuario.
     *
     * @param userModel el objeto UserModel que representa al nuevo usuario
     * @return el objeto UserModel creado
     */
    public UserModel saveUsers(UserModel userModel) {
        return userRepository.save(userModel);
    }

    /**
     * Obtiene un usuario por su ID.
     *
     * @param id el ID del usuario a buscar
     * @return un Optional que contiene al usuario si se encuentra, o un valor vacío si no se encuentra
     */
    public Optional<UserModel> getById(Long id) {
        return userRepository.findById(id);
    }

    /**
     * Actualiza un usuario existente por su ID.
     *
     * @param request el objeto UserModel que contiene los nuevos datos del usuario
     * @param id el ID del usuario a actualizar
     * @return el objeto UserModel actualizado
     */
    public UserModel upDateById(UserModel request, Long id){
        UserModel user =  userRepository.findById(id).get();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());

        return user;
    }

    /**
     * Elimina un usuario por su ID.
     *
     * @param id el ID del usuario a eliminar
     * @return true si se elimina correctamente, false si ocurre un error
     */
    public Boolean deleteUser (Long id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
