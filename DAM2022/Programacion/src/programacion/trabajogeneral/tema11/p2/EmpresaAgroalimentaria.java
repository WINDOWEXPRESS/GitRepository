package trabajogeneral.tema11.p2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class EmpresaAgroalimentaria {

    //Variable de la instancia. 
    ArrayList<AbstractProducto> listadoProducto = null;
    public EmpresaAgroalimentaria() {
        listadoProducto= new ArrayList<>();
    }

    public void insertIntoCsv(AbstractProducto producto) throws IOException {
        File file =  new File(producto.getFILENAME());
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file,true);
        FileReader fileReader = new FileReader(file);
        if (fileReader.read() == -1) {
            System.out.println("Cabecera");
            fileWriter.write(producto.getFILEHEADER());
        } else {
            fileWriter.write("\n"+producto.toCSVLine());
        }

        fileWriter.close();
    }

}
