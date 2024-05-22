import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    
    static LinkedList <cls_pacientes> pacientes = new LinkedList<>();
    public static void main(String[] args) {
        fnt_MenuPrincipal(true);
    }

    private static void fnt_pacientes(boolean m_p){
        while(m_p == true){
            String opcionesPac = JOptionPane.showInputDialog(null,
                    "============== Menú Pacientes ==============\n\n" +
                    "1. Registrar\n"
                    + "2. Consultar\n"
                    + "3. Salir\n");

                    if (opcionesPac.equals("3")){
                        m_p = false;
                    }

                    if(opcionesPac.equals("1")){

                        boolean sw = false;

                        String id = JOptionPane.showInputDialog(null, "ID: ");
                        for (int i = 0; i < pacientes.size(); i++){
                            if(pacientes.get(i).getIdStr().equals(id)){
                                sw = true;
                                break;
                            }
                        }
                        if(sw == false){
                            String nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: "));
                            String contacto = JOptionPane.showInputDialog(null, "Contacto: ");
                            String historia = JOptionPane.showInputDialog(null, "Historia: ");
                            pacientes.add(new cls_pacientes(nombre, id, edad, contacto, historia));
                            JOptionPane.showMessageDialog(null,"Paciente registrado con éxito");
                        }else{
                            JOptionPane.showMessageDialog(null,"El paciente con ID: " + id + " ya se encuentra registrado");
                        }
                    }
                    if(opcionesPac.equals("2")){
                        boolean sw = false;
                        int pos = 0;

                        String id = JOptionPane.showInputDialog(null, "ID: ");
                        for (int i = 0; i < pacientes.size(); i++){
                            if(pacientes.get(i).getIdStr().equals(id)){
                                sw = true;
                                pos = i;
                                break;
                            }
                        }
                        if(sw == true){
                            JOptionPane.showMessageDialog(null, "====== Información ======\n\n" + "Nombre: " + pacientes.get(pos).getNombreStr() + "\nEdad: " + pacientes.get(pos).getEdadInt() + "\nContacto: " + pacientes.get(pos).getContactoStr() + "\nHistoria: " + pacientes.get(pos).getHistoriaStr());
                        }else{
                            JOptionPane.showMessageDialog(null,"El paciente con ID: " + id + " no se encuentra registrado");
                        }
                    }
        }
    }

    private static void fnt_MenuPrincipal(boolean m){
        while (m == true){
            String opcionesStr = JOptionPane.showInputDialog(null,
            "============== Menú Principal ==============\n\n" +
            "1. Nuevo Paciente"
            + "\n2. Nueva Cita"
            + "\n3. Reportes"
            + "\n4. Salir");

            if(opcionesStr.equals("1")){
                fnt_pacientes(true);
            }
        }
    }

}
