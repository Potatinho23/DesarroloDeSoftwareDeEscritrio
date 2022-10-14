
package pruebaencomienda;


public interface IEnviable {
    double IVA = 0.19;
    double DESCTO_SOBRE = 0.1;
    double DESCTO_PAQUETE = 0.05;

    double obtenerNeto();
    double descontar(String dia);
    double obtenerTotal(String dia);
    String resumen(String dia);
}
