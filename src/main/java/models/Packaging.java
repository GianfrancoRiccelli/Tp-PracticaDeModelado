package models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("packaging")
public class Packaging extends Decorado {
    @Column
    private Double precio;

    public Packaging(Producto producto, Double precio) {
        super(producto);
        this.precio = precio;
    }

    public Packaging() {

    }

    @Override
    public Double precio() {
        return super.producto.precio() + this.precio;
    }

}
