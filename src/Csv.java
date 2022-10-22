import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Csv{

    private BufferedReader lector; //Lee el archivo
    private String linea;//Recibe las lineas
    private String partes[];//Almacena cada linea leida

    public void leerArchivo(String nombreArchivo) {

        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {

                partes = linea.split(",");
                imprimirlinea();
                System.out.println();
                
            }

            lector.close();
            linea=null;
            partes=null;
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    public void imprimirlinea() {
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]+"  | ");
            
        }
    }

}