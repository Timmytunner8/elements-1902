/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elements;

import org.springframework.data.annotation.Id;

/**
 *
 * @author brand
 */
public class User {
    @Id
    private Integer id;
    private String name;
    private Localizacion localizacion;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", localizacion=" + localizacion + '}';
    }

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}
