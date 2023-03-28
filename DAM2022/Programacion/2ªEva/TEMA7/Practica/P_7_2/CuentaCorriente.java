public class CuentaCorriente {
    private String nombre;
    private String apellido;
    private String dni;

    public CuentaCorriente(String nombre, String apellido, String dni, String direccion, long numcuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.numcuenta = numcuenta;
        this.saldo = saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String direccion;
    private long numcuenta;

    public double getSaldo() {
        return saldo;
    }

    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double ingresarDinero(double dinero){
        setSaldo(dinero);
        return getSaldo();
    }
    public double sacarDinero(double dinero){
        setSaldo(-dinero);
        return getSaldo();
    }
    public void mostrarDatos(){
        System.out.printf("Numero de cuenta: %d \n1.Nombre: %-9s \n2.Apellido: %s \n3.Dni: %s \n4.Direccion: %s \n",numcuenta,nombre,apellido
        ,dni,direccion);
    }
    public void modificarDatos(short opc,String dato){
        switch (opc){
            case 1:
                setNombre(dato);
                break;
            case 2:
                setApellido(dato);
                break;
            case 3:
                setDni(dato);
                break;
            case 4:
                setDireccion(dato);
                break;
        }
        mostrarDatos();
    }
    public static void menu(){
        System.out.println("=======================Menu=====================");
        System.out.println("||         1.Sacar dinero                     ||");
        System.out.println("||         2.Ingresar dinero                  ||");
        System.out.println("||         3.Consultar saldo                  ||");
        System.out.println("||         4.Modificar datos personales       ||");
        System.out.println("||         5.Terminar                         ||");
        System.out.println("================================================");
    }
}
