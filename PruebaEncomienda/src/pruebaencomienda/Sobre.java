package pruebaencomienda;


public final class Sobre extends Encomienda {
    private String tamanio;

    public Sobre(String tamanio, int id, String nombre, int precio, String ciudad) {
        super(id, nombre, precio, ciudad);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Sobre{" + "tamanio=" + tamanio + '}';
    }
    
    
    @Override
    public double obtenerNeto() {
        double recargo = 0;
        if(tamanio.equalsIgnoreCase("Pequeño")){
            recargo = 500;
        }else if(tamanio.equalsIgnoreCase("Mediano")){
            recargo = 1000;
        }else{
            recargo = 2000;
        }
        return this.precio + recargo;
    }

    @Override
    public double descontar(String dia) {
        double descuento = 0;
        if(dia.equalsIgnoreCase("Domingo")){
            descuento = obtenerNeto() * DESCTO_SOBRE;
        }
        return descuento;
    }

    @Override
    public String resumen(String dia) {
        return "Sobre:" + ciudad + " " + 
                obtenerTotal(dia)+ " " +
                "Tamaño: " + tamanio;
    }
    
}
