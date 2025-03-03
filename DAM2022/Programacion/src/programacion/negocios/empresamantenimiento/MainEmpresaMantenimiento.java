package negocios.empresamantenimiento;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEmpresaMantenimiento {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Servicio servi = new Servicio("Pepe",LocalDate.of(2022, 8, 15),"Zapatos García");

        TrabajoPintura tp1 = new TrabajoPintura("Antonio", LocalDate.of(2022,9,10), "Seguros Martínez", 20,4);
        //System.out.println(tp1.detalleServicio());

        RevisionAlarma ra1 = new RevisionAlarma(LocalDate.of(2022,8,6),"Colegio Santa Maria",34);
        //System.out.println(ra1.detalleServicio());

        TrabajoPintura tp2 = new TrabajoPintura("Ana",LocalDate.of(2022,8,8),"Fruteria La Pera", 10, 3);
        TrabajoPintura tp3 = new TrabajoPintura("Juan",LocalDate.of(2022,9,30),"Restaurante El Boqueron", 200,2.5);
        RevisionAlarma ra2 = new RevisionAlarma(LocalDate.of(2022,10,1),"Hotel Las Palmeras",70);

        ArrayList<Servicio> trabajos = new ArrayList<>();
        trabajos.add(tp1);
        trabajos.add(ra1);
        trabajos.add(tp2);
        trabajos.add(tp3);
        trabajos.add(ra2);

        double costeTotal = 0;
        double costeManoObra = 0;

        for(Servicio t: trabajos) {
            costeTotal += t.costeTotal();
            costeManoObra += t.costeManoObra();

            System.out.println(t.detalleServicio()+"\n\n");
        }
        System.out.println("Coste total de todos los trabajos: "+String.format("%.2f",costeTotal)+"e");
        System.out.println("Coste total de mano de obra: "+String.format("%.2f",costeManoObra)+"e");
    }
}
