public class Fruta extends Producto {
    private Double peso;
    private String color;

    public Fruta(String nombre, Double precio, Double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
