
public class User {

     //Atributos
    private String username, state = "activo";
    private int tiun; //codigo del carnet

    //Constructor
    public User (String username, int tiun){
        this.username = username;
        this.tiun = tiun;
    }

    //Get
    public String getUserName(){
        return username;
    }

    public int getTiun(){
        return tiun;
    }

    public String getState(){
        return state;
    }

    //Set

    //verificacion de que ingrese un valor nombre correcto.
    public boolean setUserName(String username){
        if (username!= null && !username.isEmpty()){   
            this.username =username;
            return true;      
        }else {
            System.out.println("Nombre invalido");
            return false;
        }
    }

    //verificacion de tiun
    public boolean setTiun(int tiun){
        String tiunS = Integer.toString(tiun);
        if (tiunS.length() == 10 ){  
            this.tiun = tiun;
            return true;
        }else {
            System.out.println("Tiun invalido");
            return false;   
        }
    }

    //verificacion estado
    public boolean setState(String state){ //para que lo edite el administrador
        state = state.toLowerCase();
        if (state.equals("activo")){
            this.state = state;  
            return true;
        }else if (state.equals("bloqueado")){
            this.state = state;
            return true;
        }else {
            System.out.println("Estado invalido");
            return false;
        }
    }

    //Metodos
    public void seeRules(){ 
        System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
        System.out.println("Reglamento para el préstamo de bicicletas: ");
        System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
        System.out.println("1. Reservas");
        System.out.println("* La bicicleta puede reservarse por un máximo de 20 minutos.");
        System.out.println("* Si en ese tiempo no se retira, la bicicleta vuelve a quedar disponible para otros usuarios.");
        System.out.println("* Al momento de reservar, el usuario debe indicar la estación de recogida y la estación de entrega.");
        System.out.println("2. Uso");
        System.out.println("* El tiempo máximo de uso es de 15 minutos desde el retiro hasta la devolución.");
        System.out.println("* La bicicleta debe devolverse en la estación indicada al momento de la reserva.");
        System.out.println("* Se debe garantizar el buen uso y cuidado de la bicicleta");
        System.out.println("3. Penalizaciones");
        System.out.println("* Mal uso o daños: bloqueo de la cuenta por 15 días.");
        System.out.println("* No devolución en el tiempo establecido (15 minutos): bloqueo de la cuenta por 15 días.");
        System.out.println("* En caso de reincidencia, el bloqueo podrá extenderse hasta 30 días o suspensión definitiva.");
        System.out.println("4. Responsabilidades del usuario");
        System.out.println("* Verificar el estado de la bicicleta antes de retirarla.");
        System.out.println("* Reportar cualquier daño o irregularidad inmediatamente.");
        System.out.println("* Usar la bicicleta únicamente para desplazamientos personales, no para actividades comerciales.");
        System.out.println("* Respetar las normas de tránsito y seguridad vial.");
        System.out.println("5. Restricciones adicionales");
        System.out.println("* No se permite transportar pasajeros.");
        System.out.println("* No se permite modificar o alterar partes de la bicicleta.");
        System.out.println("* El préstamo es personal e intransferible: solo el usuario registrado puede usar la bicicleta.");
        System.out.println("* El incumplimiento reiterado de las reglas puede llevar a la suspensión definitiva del servicio.");
        System.out.println("- - - -- - - - -- - - -- - - - -- - - - -- - - - -- ");
        
    }
}
