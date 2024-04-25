package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Milary Yulyana";
        String Apellidos = "Laura Machaca";
        
        //Concatenar
        String NombreCompleto = Nombres + " " + Apellidos;
        System.out.println("Nombres Completos: " + NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres + " " + Apellidos;
        System.out.println("Nombres Completos: " + NombreCompleto1.toUpperCase());
        
        //Minuscula
        String NombreCompleto2 = Nombres + " " + Apellidos;
        System.out.println("Nombres Completos: " + NombreCompleto2.toLowerCase());
        
        //Contar Cadenas
        String NombreCompleto3 = Nombres + " " + Apellidos;
        System.out.println("Cantidad de Caracteres: " + NombreCompleto3.length());
        
        //Cortar una Cadena
        String NombreCompleto4 = Nombres + " " + Apellidos;
        //["Milary","Yulyana","Laura","Machaca"]
        String[] NombreCortar = NombreCompleto4.split(" ");
        //System.out.println(NombreCortar[1]);
        for (int i = 0;i<NombreCortar.length;i++){
            System.out.println(NombreCortar[i]);
        }
        for(String nombre : NombreCortar){
            System.out.println(nombre); 
        }
        
        //Equals
        boolean comparacion = Nombres.equals(Apellidos);
        //boolean comparacion = Nombres == Apellidos;
        System.out.println("Comparacion: " + comparacion); 
        
        //Interpolacion de Variable
        String n = "Milary";
        String a = "Laura";
        int c = 20;
        
        String mensaje = String.format("Mi Nombre es %s y mi apellido es %s y tengo %d años",n,a,c);
        System.out.println(mensaje);
    }  
} //Milary Yulyana Laura Machaca
