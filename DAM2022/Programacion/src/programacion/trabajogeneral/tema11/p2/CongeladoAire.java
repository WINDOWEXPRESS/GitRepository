package trabajogeneral.tema11.p2;

import java.util.Arrays;

public class CongeladoAire {
    final private String[] AIRE_CONGELADO = {"Nitrogeno", "Oxigeno", "Dioxido de carbono", "Vapor de ague"};
    private float[] porcentajeAireCongelado = new float[3];

    public void setPorcentajeAireCongelado(float[] porcentajeAireCongelado) {
        this.porcentajeAireCongelado = porcentajeAireCongelado;
    }

    @Override
    public String toString() {
        return "CongeladoAire{" +
                "AIRE_CONGELADO=" + Arrays.toString(AIRE_CONGELADO) +
                ", porcentajeAireCongelado=" + Arrays.toString(porcentajeAireCongelado) +
                '}';
    }
}
