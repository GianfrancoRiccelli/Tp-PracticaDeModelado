import io.github.flbulgarelli.jpa.extras.test.SimplePersistenceTest;
import models.Combo;
import models.ProductoSimple;
import repository.RepoCombo;
import repository.RepoProductoSimple;

import javax.persistence.EntityTransaction;

public class Main implements SimplePersistenceTest {
    public static void main(String[] args){
        new Main().start();
    }

    public void start(){
        EntityTransaction tx = entityManager().getTransaction();
        tx.begin();

        RepoCombo repoCombo = new RepoCombo();
        RepoProductoSimple repoProductoSimple = new RepoProductoSimple();

        ProductoSimple guantes = new ProductoSimple();
        guantes.setPrecio(600.00);
        guantes.setStock(10);
        guantes.setNombre("Guantes");
        guantes.setMarca("Alpinestars");

        ProductoSimple casco = new ProductoSimple();
        casco.setPrecio(1200.00);
        casco.setNombre("Casco");

        ProductoSimple chaleco = new ProductoSimple();
        chaleco.setPrecio(400.00);

        ProductoSimple piloto = new ProductoSimple();
        piloto.setPrecio(500.00);

        Combo comboBasico = new Combo();
        comboBasico.agregarProducto(guantes, casco, chaleco);

        Combo comboPremium = new Combo();
        comboPremium.agregarProducto(comboBasico, piloto);

        repoCombo.agregar(comboBasico);

    }
}
