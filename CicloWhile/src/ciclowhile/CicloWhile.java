package ciclowhile;
import java.util.Scanner;
//iterar los numeros
public class CicloWhile {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        
        while(!salir){
            System.out.println("====================");
            System.out.println("Bienvenido a ...... ");
            System.out.println("Elije una opcion:   ");
            System.out.println("1.- Saludar         ");
            System.out.println("2.- Despedir        ");
            System.out.println("3.- Cobrar          ");
            System.out.println("4.- Escapar         ");
            System.out.println("5.- Salir           ");
            System.out.println("====================");
            int Opcion = scanner.nextInt();            
            switch(Opcion){
                case 1:
                    System.out.println("Buenos Dias");              
                    break;
                case 2:
                    int[] numeros = {1,2,3,4,5};
                    Object[] NumerosLetras = {12, "Yulyana", 123.21, true, "Victoria"};
                    for(Object nl: NumerosLetras ){
                        System.out.println(nl);
                    }
                    System.out.println(" ");
                    
                    //For Normal
                    for (int n=0;n<numeros.length;n++){
                        if(numeros[n] == 2){
                            System.out.println("Numero Encontrado");
                        } else{
                            System.out.println("No encontrado");
                        }
                        System.out.println(numeros[n]);
                    }
                    System.out.println("Vuelva Pronto");
                    break;
                case 3:
                    System.out.println("Quiero que me pague");
                    break;
                case 4:
                    System.out.println("Se escapo.....");
                    break;   
                case 5:
                    salir = true;
                    System.out.println("Gracias por usar nuestro menu");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            } 
        }
        scanner.close();
    }
}
