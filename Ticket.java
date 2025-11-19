import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

public class Ticket {
    //Variables globals
     Scanner scanner = new Scanner(System.in);
     String nomProducte;
     float preuUnitari;
     int quantitat;
     boolean altreProducte = true;   

     String llistaProductes = "";
     float totalSenseIVA = 0;
     String ultimClient = "";
     boolean hiHaComanda = false;

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
        String nomClient;
        try {

        llistaProductes = "";
        totalSenseIVA = 0;
        altreProducte = true;
        
        System.out.println("============= NOVA COMANDA =============");
        System.out.println("Introduexi el seu nom siusplau: ");
        nomClient = scanner.nextLine();
        ultimClient = nomClient;
        
        afegirProducte();
        generarTiquet(nomClient);
    }
    catch (ArithmeticException e){
        System.out.println("Error: Operacio aritmetica no valida.");
    }
    catch (InputMismatchException e) {
        System.out.println("Error: Tipus de dada incorrecte.");
    }
    catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }

    public void actualitzarComanda() {
        System.out.println("Funcio no implementada encara.");
    }
    public void visualitzarComanda() {
        System.out.println("Funcio no implementada encara.");
    }
    public void afegirProducte() {
        String demanarMes;
        try {
        while (altreProducte == true) {
        System.out.println("Introdueixi el nom del seu producte: ");
        nomProducte = scanner.nextLine();
        System.out.println("Introdueixi el preu unitari del seu producte: ");
        preuUnitari = scanner.nextFloat();
        System.out.println("Introdueixi la quantitat: ");
        quantitat = scanner.nextInt();
        System.out.println();

        System.out.println("Vols afegir una altre comanda? (Si o no) ");
        scanner.nextLine();
        demanarMes = scanner.nextLine();
        if (demanarMes.trim().equalsIgnoreCase("no")) {
            altreProducte = false;
        }
        }
        
    }catch (ArithmeticException e){
        System.out.println("Error: Operacio aritmetica no valida.");
    }
    catch (InputMismatchException e) {
        System.out.println("Error: Tipus de dada incorrecte.");
    }
    catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
    public void generarTiquet(String nomClient) {

        float iva = totalSenseIVA * 0.10f;
        float total = totalSenseIVA + iva;

        System.out.println("______________________________________");
        System.out.println("=============== TIQUET ===============");
        System.out.println("______________________________________");
        System.out.println("Client: " + nomClient + "\n");

        System.out.println("Producte        Quantitat   Preu unit.   Subtotal");
        System.out.println("--------------------------------------------------");
        System.out.print(llistaProductes);
        System.out.println("--------------------------------------------------");

        System.out.printf("Total sense IVA:                 %.2f €\n", totalSenseIVA);
        System.out.printf("IVA (10%%):                       %.2f €\n", iva);
        System.out.printf("TOTAL A PAGAR:                   %.2f €\n", total);
        System.out.println("==================================================");
    }

    }
    }

