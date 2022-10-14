package pruebaencomienda;

public final class Paquete extends Encomienda {
    
    private double peso;


    public Paquete(double peso, int id, String nombre, int precio, String ciudad) {
        super(id, nombre, precio, ciudad);
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Paquete{" + "peso=" + peso + '}';
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double obtenerNeto() {
        double recargo = 0;
        if(peso < 1){
            recargo = 500;
        }else if(peso <= 10){
            recargo = 500 * peso;
        }else{
            recargo = 650 * peso;
        }
        return this.precio + recargo;
    }

    @Override
    public double descontar(String dia) {
        double descuento = 0;
        if(dia.equalsIgnoreCase("Sabado")){
            descuento = obtenerNeto() * DESCTO_PAQUETE;
        }
        return descuento;
    }


    @Override
    public String resumen(String dia) {
        return null;
    }
    
}
