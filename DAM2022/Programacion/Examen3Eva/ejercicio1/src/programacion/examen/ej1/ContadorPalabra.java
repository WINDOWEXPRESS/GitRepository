package programacion.examen.ej1;


public class ContadorPalabra implements Comparable<ContadorPalabra>{
    private String palabra;

    public String getPalabra() {
        return palabra;
    }

    public Integer getNumeroDeVeces() {
        return numeroDeVeces;
    }

    private Integer numeroDeVeces;

    public ContadorPalabra(String palabra, Integer numeroDeVeces) {
        this.palabra = palabra;
        this.numeroDeVeces = numeroDeVeces;
    }

    @Override
    public int compareTo(ContadorPalabra o) {
        return numeroDeVeces.compareTo(o.numeroDeVeces);
    }
}
