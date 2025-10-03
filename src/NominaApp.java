import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NominaApp {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opcion,contadorVendedor=0,contadorGerente=0;
        String id;
        boolean bandera=true;
        Scanner teclado=new Scanner(System.in);
        List <Empleado> listEmpleado= new ArrayList<>();
        Vendedor vendedor=new Vendedor();
        Gerente gerente=new Gerente();
        do{
            double nomina=0,promedioSalario=0,mayorSalario=0;
            boolean noEncontrado=true;
            System.out.println("=== SISTEMA DE NÓMINA TECHMARKET ===");
            System.out.println("1. Registrar Vendedor ");
            System.out.println("2. Registrar Gerente ");
            System.out.println("3. Listar empleados");
            System.out.println("4. Calcular nómina total");
            System.out.println("5. Mostrar empleado con mayor salario");
            System.out.println("6. Calcular salario promedio");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("0. Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 0:
                    bandera=false;
                    break;
                case 1:
                    System.out.println("Ingrese ID:");
                    vendedor.setId(teclado.next());
                    System.out.println("Ingrese Nombre");
                    vendedor.setNombre(teclado.next());
                    System.out.println("Ingrese Salario base");
                    vendedor.setSalarioBase(teclado.nextInt());
                    System.out.println("Ingrese ventas Mensuales");
                    vendedor.setVentasMensuales(teclado.nextDouble());
                    System.out.println("Ingrese Porcentaje de comision");
                    vendedor.setPorcentajeComision(teclado.nextDouble());
                    listEmpleado.add(vendedor);
                    contadorVendedor+=1;
                    break;
                case 2:
                    System.out.println("Ingrese ID:");
                    gerente.setId(teclado.next());
                    System.out.println("Ingrese Nombre");
                    gerente.setNombre(teclado.next());
                    System.out.println("Ingrese Salario base");
                    gerente.setSalarioBase(teclado.nextInt());
                    System.out.println("Ingrese Bono fijo");
                    gerente.setBonoFijo(teclado.nextDouble());
                    System.out.println("Ingrese trabajadores a cargo");
                    gerente.setEmpleadosACargo(teclado.nextInt());
                    listEmpleado.add(gerente);
                    contadorGerente+=1;
                    break;
                case 3:
                    for(Empleado p:listEmpleado){
                        System.out.println(p.info());
                    }
                    break;
                case 4:
                    for(Empleado p:listEmpleado){
                        nomina+=p.calcularSalario();
                    }
                    break;
                case 5:
                    for(Empleado p:listEmpleado){
                        if(p.calcularSalario()>mayorSalario){
                            mayorSalario=p.calcularSalario();
                        }
                    }
                    for(Empleado p:listEmpleado){
                        if(p.calcularSalario()==mayorSalario){
                            System.out.println(p.info());
                        }
                    }
                    break;
                case  6:
                    for(Empleado p:listEmpleado){
                        promedioSalario+=p.calcularSalario();
                    }
                    promedioSalario=promedioSalario/listEmpleado.size();
                    System.out.println("El promedio de salarios es:"+promedioSalario);
                    break;
                case 7:
                    System.out.println("Ingrese el id del empleado");
                    id= teclado.next();
                    for(Empleado p:listEmpleado){
                        if(p.getId().equalsIgnoreCase(id)){
                            System.out.println(p.info());
                            noEncontrado=false;
                        }
                    }
                    if(noEncontrado){
                        System.out.println("Id no valido");
                    }

                    break;
                case 8:
                    System.out.println("Hay un total de vendedores:"+contadorVendedor);
                    System.out.println("Hay un total de gerente:"+contadorGerente);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while (bandera);
    }
}