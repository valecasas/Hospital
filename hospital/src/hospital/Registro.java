
package hospital;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Registro {
    //Atributos
    private List<Paciente> registroHospital = new ArrayList<Paciente>();
    
    
    //Getters y Setters
    public List<Paciente> getRegistroHospital() {
        return registroHospital;
    }

    public void setRegistroHospital(List<Paciente> registroHospital) {
        this.registroHospital = registroHospital;
    }
    
     //Metodos
    public void agregarPaciente(){
        String nombre;
        String apellido;
        int codigo;
        String sexo;
        String direccion;
        String centroMedico;
        String motivo;
        String medico;
        String fecha;
                     
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente(Primera letra en "
                                              + "mayuscula y el resto en minuscula)");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del paciente");
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del paciente"));
        sexo = JOptionPane.showInputDialog("Ingrese el sexo del paciente");
        direccion = JOptionPane.showInputDialog("Ingrese la direccion del paciente");
        centroMedico = JOptionPane.showInputDialog("Ingrese el centro medico del paciente (Primera letra en "
                                              + "mayuscula y el resto en minuscula)");
        motivo = JOptionPane.showInputDialog("Ingrese el motivo del paciente");
        medico = JOptionPane.showInputDialog("Ingrese el medico del paciente(Primera letra en "
                                              + "mayuscula y el resto en minuscula)");
        fecha = JOptionPane.showInputDialog("Ingrese el codigo del paciente");
       
        registroHospital.add(new Paciente(nombre, apellido, codigo, sexo,
                                        direccion, centroMedico, motivo,
                                        medico, fecha));
    }
    
     public void eliminarPaciente(){
         String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente (Primera letra en "
                                              + "mayuscula y el resto en minuscula)");
        
         Paciente seleccionado = null;
       // String nombre = entrada.nextLine().toLowerCase();
       
        for (Paciente paciente:registroHospital) {
            if (nombre.equals(paciente.getNombrePaciente())){
               seleccionado = paciente;
            }
        }
        registroHospital.remove(seleccionado);
    }
     public void informacionPaciente(){
          Paciente seleccionado = null;
         int caso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese metodo por el cual ubicar al pacinte"
                                     + "\n1.Nombre del Paciente \n2.Medico del Paciente \n3.Centro medico del Paciente" ));
         switch (caso) {
             case 1:
                 String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente (Primera letra en "
                                              + "mayuscula y el resto en minuscula)");
                  for (Paciente paciente:registroHospital) {
                  if (nombre.equals(paciente.getNombrePaciente())){
                    seleccionado = paciente;
                     } 
                   }
                 break;
             case 2:
                 String medico = JOptionPane.showInputDialog("Ingrese el medico del paciente (Primera letra en "
                                                      + "mayuscula y el resto en minuscula)");
                  for (Paciente paciente:registroHospital) {
                  if (medico.equals(paciente.getMedicoPaciente())){
                    seleccionado = paciente;
                     } 
                   }
                 break;
             case 3:
                  String centroMedico = JOptionPane.showInputDialog("Ingrese el centro medico del paciente (Primera letra en "
                                                       + "mayuscula y el resto en minuscula)");
                   for (Paciente paciente:registroHospital) {
                  if (centroMedico.equals(paciente.getCentroMedicoPaciente())){
                    seleccionado = paciente;
                     } 
                   }
                  
                 break;
             default:
                  JOptionPane.showMessageDialog(null, "No digio lo solicitado");
         }
       // String nombre = entrada.nextLine().toLowerCase();
        JOptionPane.showMessageDialog(null, seleccionado);
    }
    
     public void imprimirRegistro(){
        for (Paciente paciente:registroHospital) {
            System.out.println(paciente);
        }
    }
    
}
