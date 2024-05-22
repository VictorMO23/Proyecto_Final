public class cls_pacientes {

    private String nombreStr;
    private String idStr;
    private int edadInt;
    private String contactoStr;
    private String historiaStr;

    public cls_pacientes (String n, String id, int edad, String c, String h){

        this.nombreStr = n;
        this.idStr = id;
        this.edadInt = edad;
        this.contactoStr = c;
        this.historiaStr = h;

    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public int getEdadInt() {
        return edadInt;
    }

    public void setEdadInt(int edadInt) {
        this.edadInt = edadInt;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public String getHistoriaStr() {
        return historiaStr;
    }

    public void setHistoriaStr(String historiaStr) {
        this.historiaStr = historiaStr;
    }

    
}