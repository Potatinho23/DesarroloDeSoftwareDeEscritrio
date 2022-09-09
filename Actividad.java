CLASE INSANA

package labancaelestao;


public class LaBancaElEstao {


    public static void main(String[] args) {
            Usuario usu1 = new Usuario();
            usu1.setRut("111-1");
            usu1.setNombre(" EL YORDAN");
            usu1.setClave("E854");
            System.out.println(usu1);
            
            
            Cuenta cta1 = new Cuenta();
            cta1.setUsuario(usu1);
            cta1.setNumeroInsano(111);
            cta1.setSaldo(10321);
            cta1.setTipoCuenta('C');
            cta1.setTipoUsuario(true);
            System.out.println(cta1);
            
    }
    
}
----------------------------------------------------------------------------------------------------------
Clase con clae foranea (cuenta)
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labancaelestao;

/**
 *
 * @author CETECOM Concepcion
 */
public class Cuenta {
    private int numeroInsano;
    private int saldo;
    private char tipoCuenta;
    private boolean tipoUsuario;
    
    private Usuario usuario; //FK
    //Agregar Constructor vacio

    public Cuenta() {
        usuario = new Usuario();//Enlazar 
        
    }

    public Cuenta(int numeroInsano, int saldo, char tipoCuenta, boolean tipoUsuario, Usuario usuario) {
        this.numeroInsano = numeroInsano;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        
    }

    public int getNumeroInsano() {
        return numeroInsano;
    }

    public void setNumeroInsano(int numeroInsano) {
        this.numeroInsano = numeroInsano;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        if(tipoCuenta == 'C'||tipoCuenta == 'V'||tipoCuenta == 'c'||tipoCuenta == 'v'){
            this.tipoCuenta = tipoCuenta;
        }else{
            System.out.println("Tipo de cuenta invalido HAHAHAHAHA");
        }
    }

    public boolean isTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(boolean tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroInsano: " + numeroInsano + ", saldo: " + saldo + ", tipoCuenta: " + tipoCuenta + ", tipoUsuario: " + tipoUsuario + ", usuario: " + usuario + '}';
    }
    public void listarDatos(){
    String tip = "Cuenta corriente";
    if(this.tipoCuenta == 'V'){
        tip = "Cuenta Vista";
    }
    System.out.println("        DATOS CUENTA        ");
    System.out.println("----------------------------");
    System.out.print(this.usuario.getNombre() +" " );
    System.out.print(this.usuario.getRut() + " ");
    System.out.print(this.saldo + " ");
    System.out.println(tip);
    System.out.println("----------------------------");
        
    }
}
    public int maxGiro(){
        if(this.tipoUsuario == true){
            if(this.saldo > 1000000){
                return 1000000;
            }else{
                return this.saldo;
            }

        }else{
            if(this.saldo > 200000){
                return 200000;
            }else{
                return this.saldo;
            }
        }
    }
}
----------------------------------------------------------------------------------------------------------
Clase usuario

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labancaelestao;

/**
 *
 * @author CETECOM Concepcion
 */
public class Usuario {
    private String Nombre;
    private String rut;
    private String clave;

    public Usuario() {
        
    }

    public Usuario(String Nombre, String rut, String clave) {
        this.Nombre = Nombre;
        this.rut = rut;
        this.clave = clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
       if(Nombre.length()>0){
        this.Nombre = Nombre;
       }else
           this.Nombre = null;
           System.out.println("Error, Nombre obligatorio");
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if(clave.length()==4){
            //verificar que todos los char sean numericos
            boolean solodigitos = true;
            for (int i = 0; i < 4; i++) {
                if(clave.charAt(i)<'0'||clave.charAt(i)>'9'){
                    solodigitos = false;
                }
            }
            if(solodigitos == true){
            this.clave = clave;
            }else{
            this.clave = null;
            System.out.println("Error, la clae tiene que tener 4 digitos");
            }
    }
    }
    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", rut=" + rut + ", clave=" + clave + '}';
    }
    public boolean validar(String rut, String clave){
    return this.rut.equals(rut) && this.clave.equals(clave);
    }
}
                                                      
