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
public class Pavilhao extends espacosPrincipais implements Seguranca{
    
    private int numeroEntradasSaidas;
    private espacosCentroCongressos pavilhao;
    
    private float custoSegurancaPorEntradaSaida = 20;
    
    private static int contador = 0;
    private static String identificador = "Pavilhão ";
    private static int NUMERO_ENTRADAS_SAIDAS_POR_OMISSAO = 0;
    
    public Pavilhao(espacosCentroCongressos espacoPrincipal, int numeroEntradasSaidas)
    {
        this.pavilhao = espacoPrincipal;
        this.numeroEntradasSaidas = numeroEntradasSaidas;
        contador++; 
    }
    
    public Pavilhao(espacosCentroCongressos espacoPrincipal)
    {
        this.pavilhao = espacoPrincipal;   
        this.numeroEntradasSaidas = NUMERO_ENTRADAS_SAIDAS_POR_OMISSAO;
        contador++; 
    }
    
    public Pavilhao()
    {
        this.numeroEntradasSaidas = NUMERO_ENTRADAS_SAIDAS_POR_OMISSAO;
        contador++; 
    }
    
    @Override
    public String toString() {
        return "Tipo: "+ getIdentificador() + "\n" + getPavilhao().toString() + "\nNúmero de Entradas/Saídas: " + getNumeroEntradasSaidas() + "\n";
    }
    
    @Override
    public float getArea()
    {
        return getPavilhao().getArea();
    }
    
    @Override
    public String getNome()
    {
        return pavilhao.getNome();
    }
    
    public float calculaCustoTotal()
    {
        return calculaPPM() + calcularSeguranca();
    }

    @Override
    public float calcularSeguranca() {
        return getCustoSegurancaPorEntradaSaida() * getNumeroEntradasSaidas();
    }

    public int getNumeroEntradasSaidas() {
        return numeroEntradasSaidas;
    }

    public float getCustoSegurancaPorEntradaSaida() {
        return custoSegurancaPorEntradaSaida;
    }

    public void setNumeroEntradasSaidas(int numeroEntradasSaidas) {
        this.numeroEntradasSaidas = numeroEntradasSaidas;
    }
    

    public void setCustoSegurancaPorEntradaSaida(float custoSegurancaPorEntradaSaida) {
        this.custoSegurancaPorEntradaSaida = custoSegurancaPorEntradaSaida;
    }

    public espacosCentroCongressos getPavilhao() {
        return pavilhao;
    }

    public void setPavilhao(espacosCentroCongressos pavilhao) {
        this.pavilhao = pavilhao;
    }
    
    public static int getContador() {
        return contador;
    }

    public static String getIdentificador() {
        return identificador;
    }

    public static int getNUMERO_ENTRADAS_SAIDAS_POR_OMISSAO() {
        return NUMERO_ENTRADAS_SAIDAS_POR_OMISSAO;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    public static void setIdentificador(String aIdentificador) {
        identificador = aIdentificador;
    }

    public static void setNUMERO_ENTRADAS_SAIDAS_POR_OMISSAO(int aNUMERO_ENTRADAS_SAIDAS_POR_OMISSAO) {
        NUMERO_ENTRADAS_SAIDAS_POR_OMISSAO = aNUMERO_ENTRADAS_SAIDAS_POR_OMISSAO;
    }
}
