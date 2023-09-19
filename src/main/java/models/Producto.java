package models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Producto")
public abstract class Producto {

    private String marca;
    private String nombre;

    public abstract Double precio();
    public abstract Integer stock();



}
