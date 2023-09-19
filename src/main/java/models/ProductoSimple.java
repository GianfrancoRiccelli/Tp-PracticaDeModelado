package models;

import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("simple")
public class ProductoSimple extends Producto {
    @Setter
    @Column
    private Double precio;

    @Setter
    @Column
    private Integer stock;

    @Override
    public Double precio() {
        return this.precio;
    }

    @Override
    public Integer stock() {
        return this.stock;
    }

}
