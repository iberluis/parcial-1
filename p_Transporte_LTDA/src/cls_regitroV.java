public class cls_regitroV {
    String nombre_conduString;
    String descripcionst;
    String rutast;
    String marcast;
    String modelost;
    String placast;
    public cls_regitroV(String nombre_conduString, String descripcionst, String rutast, String marcast, String modelost,
            String placast) {
        this.nombre_conduString = nombre_conduString;
        this.descripcionst = descripcionst;
        this.rutast = rutast;
        this.marcast = marcast;
        this.modelost = modelost;
        this.placast = placast;
    }
    public String getNombre_conduString() {
        return nombre_conduString;
    }
    public void setNombre_conduString(String nombre_conduString) {
        this.nombre_conduString = nombre_conduString;
    }
    public String getDescripcionst() {
        return descripcionst;
    }
    public void setDescripcionst(String descripcionst) {
        this.descripcionst = descripcionst;
    }
    public String getRutast() {
        return rutast;
    }
    public void setRutast(String rutast) {
        this.rutast = rutast;
    }
    public String getMarcast() {
        return marcast;
    }
    public void setMarcast(String marcast) {
        this.marcast = marcast;
    }
    public String getModelost() {
        return modelost;
    }
    public void setModelost(String modelost) {
        this.modelost = modelost;
    }
    public String getPlacast() {
        return placast;
    }
    public void setPlacast(String placast) {
        this.placast = placast;
    }

    Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}