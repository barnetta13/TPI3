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
public class Halls extends espacosAuxiliares implements Seguranca{
    
    private int numeroStands;
    private float custoSegurancaFixo;
    private espacosCentroCongressos hall;
    
    private static String identificador = "Hall ";
    private static float custoSegurancaPorNumeroStands = 2;
    private static int NUMERO_STANDS_POR_OMISSAO = 0;
    private static int CUSTO_SEGURANCA_FIXO_POR_OMISSAO = 10;
    
    public Halls(espacosCentroCongressos espacoPrincipal, int numeroStands, float custoSegurancaFixo)
    {
        this.hall = espacoPrincipal;
        this.numeroStands = numeroStands;
        this.custoSegurancaFixo = custoSegurancaFixo;
    }
    
    public Halls(espacosCentroCongressos espacoPrincipal)
    {
        this.hall = espacoPrincipal;
        this.numeroStands = NUMERO_STANDS_POR_OMISSAO;
        this.custoSegurancaFixo = CUSTO_SEGURANCA_FIXO_POR_OMISSAO;
    }
    
    public Halls()
    {
        this.numeroStands = NUMERO_STANDS_POR_OMISSAO;
        this.custoSegurancaFixo = CUSTO_SEGURANCA_FIXO_POR_OMISSAO; 
    }

    @Override
    public String toString() {
        return "Tipo: " + getIdentificador() + "\n" + getHall().toString() + "\nNúmero de Stands: " + getNumeroStands() + "\n"
                + "Custo Segurança Fixo: " + getCustoSegurancaFixo() + "\n";
    }
    
    @Override
    public float getArea()
    {
        return getHall().getArea();
    }

    @Override
    public String getNome()
    {
        return hall.getNome();
    }
    
    @Override
    public float calculaCustoTotal()
    {
        return calculaPPM() + calcularSeguranca();
    }
        
    @Override
    public float calcularSeguranca() {
        float aux = getCustoSegurancaPorNumeroStands() * getNumeroStands();
        return getCustoSegurancaFixo() + aux;
    }

    public float getCustoSegurancaFixo() {
        return custoSegurancaFixo;
    }

    public void setCustoSegurancaFixo(float custoSegurancaFixo) {
        this.custoSegurancaFixo = custoSegurancaFixo;
    }

    public int getNumeroStands() {
        return numeroStands;
    }

    public espacosCentroCongressos getHall() {
        return hall;
    }

    public void setNumeroStands(int numeroStands) {
        this.numeroStands = numeroStands;
    }

    public void setHall(espacosCentroCongressos hall) {
        this.hall = hall;
    }
    
    public static String getIdentificador() {
        return identificador;
    }

    public static float getCustoSegurancaPorNumeroStands() {
        return custoSegurancaPorNumeroStands;
    }

    public static int getNUMERO_STANDS_POR_OMISSAO() {
        return NUMERO_STANDS_POR_OMISSAO;
    }

    public static int getCUSTO_SEGURANCA_FIXO_POR_OMISSAO() {
        return CUSTO_SEGURANCA_FIXO_POR_OMISSAO;
    }

    public static void setIdentificador(String aIdentificador) {
        identificador = aIdentificador;
    }

    public static void setCustoSegurancaPorNumeroStands(float aCustoSegurancaPorNumeroStands) {
        custoSegurancaPorNumeroStands = aCustoSegurancaPorNumeroStands;
    }

    public static void setNUMERO_STANDS_POR_OMISSAO(int aNUMERO_STANDS_POR_OMISSAO) {
        NUMERO_STANDS_POR_OMISSAO = aNUMERO_STANDS_POR_OMISSAO;
    }

    public static void setCUSTO_SEGURANCA_FIXO_POR_OMISSAO(int aCUSTO_SEGURANCA_FIXO_POR_OMISSAO) {
        CUSTO_SEGURANCA_FIXO_POR_OMISSAO = aCUSTO_SEGURANCA_FIXO_POR_OMISSAO;
    }
    
}
