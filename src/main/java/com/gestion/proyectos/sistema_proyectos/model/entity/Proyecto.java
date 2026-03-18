package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table (name = "Proyectos" )
public class Proyecto extends  BaseEntity {
    String nombre;
    String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoProyecto estadoProyecto;

    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;

    @Embedded
    private ContactoCliente contactoCliente;




}
