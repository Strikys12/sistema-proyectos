package com.gestion.proyectos.sistema_proyectos.model.embeddable;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter

public class ContactoCliente {
    private String nombreRepresentante;
    private String emailContacto;
    private String telefono;

}
