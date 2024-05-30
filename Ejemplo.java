import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejemplo {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;
    

    public static void main(String[] args) throws Exception{
        mostrarMenu();
    }

    public static void mostrarMenu() throws Exception{
        int opcion =-1;
        do {
            out.println("**** Sistema empleados ***");
            out.println("1. Registrar Empleado.");
            out.println("2. Editar empleado.");
            out.println("3. Listar empleados.");
            out.println("4. Eliminar empleados");
            out.println("0. Salir");
            out.print("Por favor, digite una opción: ");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
        }while(opcion!=0);
    }

    public static void procesarOpcion (int opcion) throws Exception{
        switch (opcion){
            case 1: registrarEmpleado();
                break;
            case 2: editarEmpleados();
                break;
            case 3: //listarEmpleados();
                break;
            case 4: //();
                break;
            case 0:
                out.println("Gracias por su visita!");
                break;
            default: out.println("Opción invalida");
                break;
        }
    }

    public static void registrarEmpleado() throws Exception
    {
        out.print("Digite el nombre del empleado: ");
        String nombre = in.readLine();
        out.print("Digite el apellido del empleado: ");
        String apellido = in.readLine();
        out.print("Digite el puesto del empleado: ");
        String puesto = in.readLine();
    }

    public static void editarEmpleados() throws Exception
    {
        out.print("Digite el nombre del empleado a editar el puesto: ");
        String nombreEmpleado = in.readLine();

        out.print("Digite el nuevo puesto del empleado ");
        String puestoEmpleado = in.readLine();

        //String mensaje = pGestor.editarEmpleado(nombreEmpleado, puestoEmpleado);
        //out.println(mensaje);
    }


}