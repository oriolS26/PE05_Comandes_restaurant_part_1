import java.util.Scanner;

public class Ticket {
    //Variables globals
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Ticket program = new Ticket();
        program.inici();
    }

    public void inici() {
        String opcio1;

        do {
        System.out.println("Benvingut al sistema de venda d'entrades!");
        System.out.println("-------------------------------------------");
        System.out.println("===============MENU PRINCIPAL===============");
        System.out.println("1: Crear nova comanda");
        System.out.println("2: Actualitzar comanda anterior");
        System.out.println("3: Visualitzar ultim tiquet");
        System.out.println("4: Sortir");
        opcio1 = scanner.nextLine();

       switch (opcio1) {
        case "1":
            novaComanda();
            break;
        case "2":
            actualitzarComanda();
            break;
        case "3":
            visualitzarComanda();
            break;
        case "4":
            System.out.println("Sortint del programa...");
            break;
       
        default:
            System.out.println("Opcio Invalida");
            break;
        }
        } while (!opcio1.equalsIgnoreCase("4"));
    }

    public void novaComanda() {
        String nomClient, nomProducte;
        float preuUnitari;
        int quantitat;

        
    }
    }

