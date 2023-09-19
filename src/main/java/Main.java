import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;
import models.Combo;
import models.ProductoSimple;
import repository.RepoCombo;
import repository.RepoProductoSimple;

public class Main implements WithSimplePersistenceUnit {
    public static void main(String args[]){
        start();
    }

    public static void start(){
        RepoCombo repoCombo = new RepoCombo();

        ProductoSimple guantes = new ProductoSimple();
        guantes.setPrecio(600.00);
        guantes.setStock(10);

        ProductoSimple casco = new ProductoSimple();
        casco.setPrecio(1200.00);

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
