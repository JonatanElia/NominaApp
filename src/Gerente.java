public class Gerente extends Empleado{
    private double bonoFijo;
    private int empleadosACargo;

    public Gerente() {
    }

    public Gerente(String id, String nombre, double salarioBase, double bonoFijo, int empleadosACargo) {
        super(id, nombre, salarioBase);
        this.bonoFijo = bonoFijo;
        this.empleadosACargo = empleadosACargo;
    }

    public double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        this.bonoFijo = bonoFijo;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    @Override
    public String toString() {
        return super.toString()+"Gerente{" +
                "bonoFijo=" + bonoFijo +
                ", empleadosACargo=" + empleadosACargo +
                '}';
    }
    public double calcularIncentivoLiderazgo(){
        if(empleadosACargo>10){
            return salarioBase*0.05;
        }else {
            return 0;
        }
    }

    @Override
    public double calcularSalario(){
        return salarioBase+bonoFijo+calcularIncentivoLiderazgo();
    }
    @Override
    public String info(){
        return "Gerente "+super.info()+ " Bono fijo:"+bonoFijo+" Empleados a cargo:"+empleadosACargo;
    }
}
