
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
        if ( tiun > 0 && tiun <=10){
            this.tiun = tiun;
            return true;
        }else {
            System.out.println("Tiun invalido");
            return false;   
        }
    }

    //Metodos
    public boolean checkBike(String bike){ //cambiar de clase CORREGIR
        bike= bike.toLowerCase();
        if(bike.equals("si")){
            this.state = "activo";
            return true;
        }else if (bike.equals("no")){
            this.state = "sancionado";
            return false;
        }else {
            System.out.println("Informacion invalida");
            return false;
        }
    }
}
