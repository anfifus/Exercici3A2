import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = createName();
        String surname = createSurname();
        surname = changeOrder(surname);
        fuseNameSurname(name,surname);

    }

    private static String createName() {
        System.out.println("Write the name");
        Scanner scan =new Scanner(System.in);
        return scan.nextLine();

    }


    private static String createSurname() {
        System.out.println("Write the surname");
        Scanner scan =new Scanner(System.in);
        return scan.nextLine();
    }

    private static String changeOrder(String surname) {
        String surnameINV="";
        for(int cont=surname.length()-1;cont > 0;cont--)
        {
            surnameINV += surname.charAt(cont);
            //surnameINV = surnameINV + surname.charAt(cont);
        }
        return surnameINV;
    }

    private static void fuseNameSurname(String name,String surname) {
        String nameComplete = name.concat(surname);
        System.out.println("El nombre con el apellido fusionado es: "+nameComplete);
    }
}
