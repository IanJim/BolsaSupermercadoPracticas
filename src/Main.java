
public class Main {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo("Lala", 28.99, 250, 13));
        bolsaLacteos.addProducto(new Lacteo("Nutrileche", 15.26, 25, 6));
        bolsaLacteos.addProducto(new Lacteo("Yoghurt", 12.0, 20, 30));
        bolsaLacteos.addProducto(new Lacteo("Queso", 45.50, 230, 40));
        bolsaLacteos.addProducto(new Lacteo("Crema Norteñita", 30.50, 200, 50));

        bolsaFrutas.addProducto(new Fruta("Platano", 25.8, 23.3, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Mango", 18.5, 23.3, "Anaranjado"));
        bolsaFrutas.addProducto(new Fruta("Manzana", 14.1, 20.0, "Roja"));
        bolsaFrutas.addProducto(new Fruta("Melon", 25.50, 200.0, "Crema"));
        bolsaFrutas.addProducto(new Fruta("Uva", 14.50, 130.20, "Morado"));

        bolsaLimpiezas.addProducto(new Limpieza("Salvo", 15.5, "limon, bicarbonato", 15.2));
        bolsaLimpiezas.addProducto(new Limpieza("Blanca nieves", 12.2, "Bicarbonato", 13.5));
        bolsaLimpiezas.addProducto(new Limpieza("Flash", 14.50, "Lavanda", 12.5));
        bolsaLimpiezas.addProducto(new Limpieza("Shampoo", 15.50, "Jazmin de la india", 23.50));
        bolsaLimpiezas.addProducto(new Limpieza("Pasta dental", 12.50, "Bicarbonato", 12.0));

        bolsaNoPerecibles.addProducto(new NoPerecible("Atún", 25.99, 130, 13));
        bolsaNoPerecibles.addProducto(new NoPerecible("Miel", 30.99, 500, 11));
        bolsaNoPerecibles.addProducto(new NoPerecible("Legumbres", 12.50, 120, 5));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos", 13.0, 25, 12));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina", 14.0, 30, 11));

        System.out.println("-------------------------------- Frutas ---------------------------------");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("-------------------------------- " +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaLimpiezas.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaNoPerecibles.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }

    }
}