package negocios.figurasdesuperheroes;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void aniadirFigura(Figura figura) {
        listaFiguras.add(figura);
    }

    public void subirPrecio(double cantidad,String id) {
        for (Figura fig : listaFiguras
        ) {
            if (fig.getCodigo().equals(id)) {
                fig.subirPrecio(cantidad);
            }
        }
    }
    public String conCapa() {
        String cadena = "Figuras de superhéroes con capa\n---------------\n";
        for (Figura fig : listaFiguras
        ) {
            if (fig.getSuperheroe().isCapa()) {
                cadena += fig+"\n";
            }
        }
        return cadena;
    }

    public Figura masValioso() {
        double precio = 0.0;
        Figura figuraMayorPrecio = null;

        for (Figura fig : listaFiguras
        ) {
            if (fig.getPrecio()<precio) {
                figuraMayorPrecio = fig;
            }
        }
        return figuraMayorPrecio;
    }

    public double getValorColeccion() {
        double precioTotal = 0.0;
        for (Figura fig : listaFiguras
        ) {
            precioTotal += fig.getPrecio();
        }
        return precioTotal;
    }

    public double getVolumenColeccion() {
        double volumenTotal = 0.0;
        for (Figura fig : listaFiguras
        ) {
            volumenTotal += fig.getDimension().getVolumen();
        }
        return volumenTotal+200;
    }
    @Override
    public String toString() {
        String cadena = "Colección "+nombreColeccion+"\n---------------\n";
        for(Figura f:listaFiguras) {
            cadena += f+"\n";
        }

        return cadena;
    }
}
