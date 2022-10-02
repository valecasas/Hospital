
package hospital;

 public class Paciente implements Cloneable{

    

    //Atributos Hospital.Paciente
    private String nombrePaciente;
    private String apellidoPaciente;
    private int codigoPaciente;
    private String sexoPaciente;
    private String direccionPaciente;
    private String centroMedicoPaciente;
    private String motivoPaciente;
    private String medicoPaciente;
    private String fechacPaciente;
    
    /**
     * @return the nombrePaciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * @param nombrePaciente the nombrePaciente to set
     */
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * @return the apellidoPaciente
     */
    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    /**
     * @param apellidoPaciente the apellidoPaciente to set
     */
    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    /**
     * @return the codigoPaciente
     */
    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * @param codigoPaciente the codigoPaciente to set
     */
    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    /**
     * @return the sexoPaciente
     */
    public String getSexoPaciente() {
        return sexoPaciente;
    }

    /**
     * @param sexoPaciente the sexoPaciente to set
     */
    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    /**
     * @return the direccionPaciente
     */
    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    /**
     * @param direccionPaciente the direccionPaciente to set
     */
    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    /**
     * @return the centromedicoPaciente
     */
    public String getCentroMedicoPaciente() {
        return centroMedicoPaciente;
    }

    /**
     * @param centroMedicoPaciente the centromedicoPaciente to set
     */
    public void setCentroMedicoPaciente(String centroMedicoPaciente) {
        this.centroMedicoPaciente = centroMedicoPaciente;
    }

    /**
     * @return the motivoPaciente
     */
    public String getMotivoPaciente() {
        return motivoPaciente;
    }

    /**
     * @param motivoPaciente the motivoPaciente to set
     */
    public void setMotivoPaciente(String motivoPaciente) {
        this.motivoPaciente = motivoPaciente;
    }

    /**
     * @return the medicoPaciente
     */
    public String getMedicoPaciente() {
        return medicoPaciente;
    }

    /**
     * @param medicoPaciente the medicoPaciente to set
     */
    public void setMedicoPaciente(String medicoPaciente) {
        this.medicoPaciente = medicoPaciente;
    }
    
    /**
     * @return the fechacPaciente
     */
    public String getFechacPaciente() {
        return fechacPaciente;
    }

    /**
     * @param fechacPaciente the fechacPaciente to set
     */
    public void setFechacPaciente(String fechacPaciente) {
        this.fechacPaciente = fechacPaciente;
    }

    //Constructor del Paciente
    public Paciente(String nombre,String apellido,int codigo,String sexo, String direccion, 
            String centroMedico, String motivo, String medico, String fecha){
        
        this.nombrePaciente = nombre;
        this.apellidoPaciente =  apellido;
        this.codigoPaciente = codigo;
        this.sexoPaciente = sexo;
        this.direccionPaciente = direccion;
        this.centroMedicoPaciente = centroMedico;
        this.motivoPaciente = motivo;
        this.medicoPaciente = medico;
        this.fechacPaciente = fecha;
    }
    
     //Imprimir el objeto
    @Override
    public String toString(){
        return  "\nCodigo del Paciente: " + codigoPaciente +
                "\nNombres y Apellidos del Paciente: " + nombrePaciente + " " + apellidoPaciente +
                "\nSexo del Paciente: " + sexoPaciente +
                "\nDireccion recidencia del Paciente: " + direccionPaciente +
                "\nEl lugar donde fue atendido el Paciende: " + centroMedicoPaciente +
                "\nMotico por el cual fue atendido el Paciente: " + motivoPaciente +
                "\nMedico que atendio al Paciente: " + medicoPaciente +
                "\nFecha en la cual fue atendido el Paciente: " + fechacPaciente;
    }

     @Override
    public Paciente clone() {
        try {
            Paciente clone = (Paciente) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    
}
