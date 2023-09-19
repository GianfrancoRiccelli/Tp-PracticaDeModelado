package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Entity
@DiscriminatorValue("combo")
public class Combo extends Producto{
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "combo_id")
    private List<Producto> productos;

    public Combo(){
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto ... productos){
        Collections.addAll(this.productos, productos);
    }

    @Override
    public Double precio() {
        return null;
    }

    @Override
    public Integer stock() {
        return null;
    }
}
