package models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Packaging")
public class Packaging extends Decorado {
    private Double precio;

    public Packaging(Producto producto, Double precio) {
        super(producto);
        this.precio = precio;
    }

    @Override
    public Double precio() {
        return super.producto.precio() + this.precio;
    }

}
