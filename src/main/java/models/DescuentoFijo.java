package models;

import javax.persistence.*;

@Entity
@DiscriminatorValue("descuentoFijo")
public class DescuentoFijo extends Decorado {
    @Column
    private Double valor;

    public DescuentoFijo(Producto producto, Double valor) {
        super(producto);
        this.valor = valor;
    }

    public DescuentoFijo() {}

    @Override
    public Double precio() {
        return super.producto.precio() - this.valor;
    }
}
