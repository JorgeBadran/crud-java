package com.api.Crud.models;

import javax.persistence.*;

/**
 * Clase que representa el modelo de usuario de la aplicación.
 * <p>
 * Esta clase contiene los campos de datos básicos de un usuario:
 * identificador, nombre, apellido y correo electrónico.
 *
 * @author [nombre del autor]
 * @version [número de versión]
 */
@Entity
@Table(name = "Users")
public class UserModel {

    /**
     * Identificador único del usuario.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Primer nombre del usuario.
     */
    @Column
    private String firstName;

    /**
     * Apellido del usuario.
     */
    @Column
    private String lastName;

    /**
     * Correo electrónico del usuario.
     */
    @Column
    private String email;


    /**
     * Obtiene el identificador único del usuario.
     *
     * @return identificador único del usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único del usuario.
     *
     * @param id identificador único del usuario.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el primer nombre del usuario.
     *
     * @return primer nombre del usuario.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el primer nombre del usuario.
     *
     * @param firstName primer nombre del usuario.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return apellido del usuario.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param lastName apellido del usuario.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    /* Obtiene el correo electrónico del usuario.
     *
     * @return correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /*
     * Establece el correo electrónico del usuario.
     *
     * @param email correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }




}