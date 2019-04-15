package sistema;

public class Quimica {
    //variables de la densidad
    private float densidad;
    private float masa;
    private float volumen;
    
    //variable de la temperatura
    private float tempera;
    private String tempConver;
    
    public void QuimicaDensidad(float densidad, float masa, float volumen){
        this.densidad = densidad;
        this.masa = masa;
        this.volumen = volumen;
    }
    
    public void QuimicaTemperatura(float tempera){
        this.tempera = tempera;
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
    
    public void encontrarTemperatura(String tipo, float grados, String convertir){
        switch(convertir){
            case "C":
                tempConver = "Celcius";
                
                if(tipo == "K"){
                    tempera = grados - 273;
                }else if (tipo == "F"){
                    tempera = (5 * (grados - 32))/9;
                }else{
                    tempConver = "";
                }
                break;
            case "F":
                tempConver = "Fahrenheit";
                
                if(tipo == "K"){
                    tempera = ((9 * (grados - 32))/5) + 32;
                }else if (tipo == "C"){
                    tempera = ((9 * grados) / 5) + 32;
                }else{
                    tempConver = "";
                }
                break;
            case "K":
                tempConver = "Kelvin";
                
                if(tipo == "C"){
                    tempera = grados + 273;
                }else if (tipo == "F"){
                    tempera = ((5 * (grados - 32)) / 9) + 273;
                }else{
                    tempConver = "";
                }
                break;
            default:
                System.out.println("Temperatura a convertir es errado");
                break;
        }
        if(tempConver != ""){
            System.out.println("La temperatura en grados " + tempConver + " es: " + tempera);
        }else{
            System.out.println("La temperatura a convertir es errada");
        }
    }
}
