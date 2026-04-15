import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        User usuario;
        String nombre_u;
        int tiun = 0, num_estacion, id, admi_usu;
        boolean verif_u, verif_tiun;// v_f = true; 

        do {
            admi_usu = verifExcepcion(sc, "Si es administrativo ingrese 1 y si es usuario ingrese 2: ");
            sc.nextLine();
            if(admi_usu == 1){
                //codigo para el administrativo

            }else if (admi_usu == 2){
                do{
                //Nombre del usuario
                System.out.print("Ingresa el nombre del usuario: ");
                nombre_u = sc.nextLine();

                //Numero tiun
                tiun = verifExcepcion(sc, "Ingresa el Tiun de su carnet: ");
                
                //Clase user
                usuario = new User(nombre_u, tiun);
                sc.nextLine();
                verif_u = usuario.setUserName(nombre_u);
                verif_tiun = usuario.setTiun(tiun);
    
                }while(!verif_u || !verif_tiun);

                //Menu para escoger estacion
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                System.out.println("Estaciones: ");
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                System.out.println("1. Calle 53");
                System.out.println("2. CYT");
                System.out.println("3. Uriel");
                System.out.println("4. Calle 45");
                System.out.println("5. Calle 26");
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                //bucle para error
                num_estacion = verifExcepcion(sc, "Ingresa el numero de la estacion que deseas usar (1 a 5): "); //hacer validador de rango de estaciones dentro de la clase
                //muestra el id de bicicletas disponibles en esa estacion(y tal vez al frente muestre de una ves su estado)
                id = verifExcepcion(sc, "Ingresa el id de la cicla que deseas usar: ");
                //ingresa id 

            }else{
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                System.out.println("Ingrese de nuevo el valor correcto");
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
            }
        }while(admi_usu < 1 || admi_usu > 2);
        


        sc.close();
    }
     //funcion de exepcion para int
    public static int verifExcepcion(Scanner sc, String mensaje){
        boolean v_f = true;
        int num = 0;
        do{ 
            try { 
                System.out.print(mensaje);
                num = sc.nextInt();
                v_f = true;
            }catch(Exception e){ 
                sc.nextLine();
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                System.out.println(" Error: " + e);
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                System.out.println("Ingrese de nuevo el valor correcto");
                System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
                v_f = false;
            }
        }while(!v_f);
        return num;   
    }  
}
