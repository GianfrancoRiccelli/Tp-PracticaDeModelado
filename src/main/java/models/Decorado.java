package models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Combo")
public abstract class Decorado extends Producto {
    protected Producto producto;

    public Decorado(Producto producto){
        this.producto = producto;
    }

    @Override
    public Integer stock(){
        return this.producto.stock();
    }
}
