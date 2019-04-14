package sistema;

public class Quimica {
    
    private float densidad;
    private float masa;
    private float volumen;
    
    public void QuimicaDensidad(float densidad, float masa, float volumen){
        this.densidad = densidad;
        this.masa = masa;
        this.volumen = volumen;
    }
    
    public float encontrarDensidadMasaVolumen(){
        if(densidad > 0 && masa > 0 && volumen > 0){
            System.out.println("");
        }else if(densidad == 0){
            densidad = masa / volumen;
            return densidad;
        }else if(masa == 0){
            masa = densidad * volumen;
            return masa;
        }else if(volumen == 0){
            volumen = masa / densidad;
            return volumen;
        }
        return 0;
    }
}
