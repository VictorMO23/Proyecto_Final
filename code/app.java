import java.util.LinkedList;
import javax.swing.JOptionPane;

public class app {
    
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>();
    public static void main(String[] args) {
        fnt_MenuPrincipal(true);
    }

    private static void fnt_pacientes(){
        String opcionesPac = JOptionPane.showInputDialog(null,
                "============== Menú Pacientes ==============\n\n" +
                "1. Registrar\n"
                + "2. Consultar\n"
                + "3. Salir\n");

                if(opcionesPac.equals("1")){
                    String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    String id = JOptionPane.showInputDialog(null, "ID: ");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
                    String contacto = JOptionPane.showInputDialog(null, "Contacto: ");
                    String historia = JOptionPane.showInputDialog(null, "Historia: ");
                    pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                    JOptionPane.showMessageDialog(null,"Paciente registrado con éxito");
                }
    }

    private static void fnt_MenuPrincipal(boolean m){
        while (m == true){
            String opcionesStr = JOptionPane.showInputDialog(null,
            "============== Menú Principal ==============\n\n" +
            "1. Nuevo Paciente"
            + "\n2. Nueva Cita"
            + "\n 3. Salir");

            if(opcionesStr.equals("1")){
                fnt_pacientes();
            }
        }
    }

}
