package products;

public class Product {

    // Private faz com que os atributos sejam visíveis apenas na classe correspondente.

    private String name;
    private double value;
    private int quantity;

    // Três construtores funcionais é um exemplo de "Sobrecarga".

    public Product() {
    }

    public Product(String name, double value, int quantity) {
        this.name = name; // This é usado para diferenciar os "atributos" dos "parâmetros".
        this.value = value;
        this.quantity = quantity;
    }

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
        // quantity = 0; Opcional. Em Java o valor de variáveis e arrays é iniciado com "0" ou "null".
    }

    public void setName(String name) { // setX serve para atribuir um valor a um campo correspondente.
        this.name = name;
    }

    public String getName() { // getX serve para retornar um valor do campo correspondente preenchido.
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return value * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " +
                String.format("%.2f", value) +
                ", " + quantity +
                " units, Total: $ " +
                String.format("%.2f", totalValueInStock());
    }

}
