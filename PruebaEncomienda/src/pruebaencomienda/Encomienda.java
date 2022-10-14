
package pruebaencomienda;


public abstract class Encomienda implements IEnviable{
    protected int id;
    protected String nombre;
    protected int precio;
    protected String ciudad;
    
    public Encomienda(){
    }

    public Encomienda(int id, String nombre, int precio, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Encomienda{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", ciudad=" + ciudad + '}';
    }
    
    @Override
    public double obtenerTotal(String dia) {
        double neto = obtenerNeto();
        double descuento = descontar(dia);
        double subtotal = neto - descuento;
        double iva = subtotal * IVA;
        
        return subtotal + iva;
    }
}
