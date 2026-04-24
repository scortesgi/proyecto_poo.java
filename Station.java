public class Station {
    //Atributos
    private String name_station;
    private int maxBicicletas;
    private int bicicletasAlmacenadas=0;

    //Constructor
    public Station (String name_station, int maxBicicletas){
        this.name_station=name_station;
        this.maxBicicletas=maxBicicletas;
        Bike [] bicis=new Bike [maxBicicletas];
    }

    public boolean agregarBicicleta(Bike bicicleta){
        if (bicicletasAlmacenadas<=maxBicicletas){
            bicis[bicicletasAlmacenadas]=bicicleta;
            bicicletasAlmacenadas++;
            return true;
        }
        return false;
    }

    public String aquiEstaBicicleta (Bike bicicleta){
        for (int i=0;i<bicicletasAlmacenadas;i++) {
            if (bicis[i].getId()==bicicleta.getId()){
                return "La bicicleta" + bicicleta.getId() + "se encuentra aquí.";
            }
        }
        return "La bicicleta" + bicicleta.getId() + "NO se encuentra aquí." + "\n" + "Busque en otra estación.";
    }


    
}
