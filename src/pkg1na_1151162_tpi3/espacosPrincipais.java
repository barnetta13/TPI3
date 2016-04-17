/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1na_1151162_tpi3;

/**
 *
 * @author Daniel Martins
 */
public abstract class espacosPrincipais extends espacosCentroCongressos{
    
    private static float PPM = 5;
    
    public float calculaPPM()
    {
    
        return getArea() * getPPM();
    }
    
    public abstract float calcularSeguranca();
    
    public static float getPPM() {
        return PPM;
    }

    public static void setPPM(float aPPM) {
        PPM = aPPM;
    }
    
}
