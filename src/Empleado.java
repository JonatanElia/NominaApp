public class Empleado {
    protected String id;
    protected String Nombre;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        Nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public String info(){
        return " ID:"+ id+" Nombre:"+ Nombre+" Salario base:"+salarioBase   ;
    }

}