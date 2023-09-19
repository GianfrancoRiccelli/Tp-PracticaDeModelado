package models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("decorado")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Decorado extends Producto {
    @OneToOne(cascade = CascadeType.ALL)
    protected Producto producto;

    public Decorado(Producto producto){
        this.producto = producto;
    }

    public Decorado() {}

    @Override
    public Integer stock(){
        return this.producto.stock();
    }
}
