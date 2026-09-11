public abstract class Persona implements IPersona{

    private String rut;

    public Persona(String rut) {
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    public void setRut (String rut) {
        this.rut = rut;
    }


}
