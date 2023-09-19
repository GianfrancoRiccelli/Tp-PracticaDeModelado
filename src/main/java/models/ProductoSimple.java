package models;

import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ProductoSimple")
public class ProductoSimple extends Producto {
    private Double precio;
    private Integer stock;

    @Override
    public Double precio() {
        return this.precio;
    }

    @Override
    public Integer stock() {
        return this.stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
