package models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DescuentoFijo")
public class DescuentoFijo extends Decorado {
    private Double valor;

    public DescuentoFijo(Producto producto, Double valor) {
        super(producto);
        this.valor = valor;
    }

    @Override
    public Double precio() {
        return super.producto.precio() - this.valor;
    }
}
