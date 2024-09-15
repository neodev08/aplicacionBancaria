import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int opcion = 0;


        System.out.println("************************************************");
        System.out.println("\nCliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo Disponible: " + saldoDisponible + "$");
        System.out.println("\n************************************************");

        String menu = """
                *** Ingrese la opcion deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            if(opcion == 1){
                System.out.println("El saldo actualizado es: " + saldoDisponible + "$");
            } else if(opcion == 2){
                System.out.println("Ingrese la cantidad a retirar:");
                double debito = teclado.nextInt();
                System.out.println("Haz hecho un retiro de :" + debito + "$");
                saldoDisponible -= debito;
                System.out.println("El saldo actual es: " + saldoDisponible + "$");
            } else if (opcion == 3) {
                System.out.println("Ingrese el monto del deposito:");
                double deposito = teclado.nextDouble();
                System.out.println("Haz hecho un deposito de: " + deposito + "$");
                saldoDisponible += deposito;
                System.out.println("Tu nuevo balance es: " + saldoDisponible + "$");

            }
        }
    }
}