
package hospital;
import javax.swing.JOptionPane;

public class Hospital {

    
    
    public static void main(String[] args) {
        Registro registro = new Registro();
        menu(registro);
    }
    
    public static void menu(Registro registro){
        int seleccion = 0;
        while (seleccion != 2){
            int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opion"
                                             + "\n1.Administrar registro"
                                             + "\n2. Salir "));
            seleccion = ingreso;
            switch (seleccion) {
                case 1 :
                        administrar(registro);break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa....");break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");break;
            }
        }

    }
    
     public static void administrar(Registro registro){
        int seleccion = 0;
        while (seleccion != 5){
             seleccion = Integer.parseInt(JOptionPane.showInputDialog("Escoja una opion"
                                             + "\n1.Agregar Paciente"
                                             + "\n2.Eliminar Paciente"
                                             + "\n3.Buscar Paciente"
                                             + "\n4.Imprimir lista de Pacientes"
                                             + "\n5.Salir"));      
            switch (seleccion) {
                case 1:
                    registro.agregarPaciente();break;
                case 2:
                    registro.eliminarPaciente();break;
                case 3:
                    registro.informacionPaciente();break;
                case 4:
                    registro.imprimirRegistro();break;
                case 5:
                   JOptionPane.showMessageDialog(null,"Saliendo a menu principal...");break;
                default:
                   JOptionPane.showMessageDialog(null,"Opcion incorrecta");break;
            }
        }
    }
    
    
}
