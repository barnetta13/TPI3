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
public class Auditorio extends espacosPrincipais implements AudioVisual,Seguranca{
    
    private int numeroLugares;
    private int numeroEquipamentosAudiovisuais;
    private espacosCentroCongressos auditorio;
    
    private float custoUnitarioEquipamentoAudiovisual = 5;
    private float custoSegurancaPorPessoa = 0.5f;
    
    private static int contador = 0;
    private static String identificador = "Auditório ";
    private static int NUMERO_LUGARES_POR_OMISSAO = 0;
    private static int NUMERO_EQUIPAMENTOS_AUDIOVISUAIS = 0;
    
    public Auditorio(espacosCentroCongressos espacoPrincipal, int numeroLugares, int numeroEquipamentosAudiovisuais)
    {
        this.auditorio = espacoPrincipal;
        this.numeroLugares = numeroLugares;
        this.numeroEquipamentosAudiovisuais = numeroEquipamentosAudiovisuais;
        contador++;
    }
    
    public Auditorio(espacosCentroCongressos espacoPrincipal)
    {
        this.auditorio = espacoPrincipal;  
        this.numeroLugares = NUMERO_LUGARES_POR_OMISSAO;
        this.numeroEquipamentosAudiovisuais = NUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
        contador++; 
    }
    
    public Auditorio()
    {
        this.numeroLugares = NUMERO_LUGARES_POR_OMISSAO;
        this.numeroEquipamentosAudiovisuais = NUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
        contador++; 
    }
    
    @Override
    public String toString() {
        return "Tipo: " + getIdentificador() + "\n" + getAuditorio().toString() + "\nNúmero de Lugares: " + getNumeroLugares() + "\nNumero de Equipamentos Audiovisuais: " +
                getNumeroEquipamentosAudiovisuais() + "\n";
    }
    
    @Override
    public float getArea()
    {
        return auditorio.getArea();
    }
    
    @Override
    public String getNome()
    {
        return auditorio.getNome();
    }

    @Override
    public float calcularAudioVisual() {
        return getCustoUnitarioEquipamentoAudiovisual() * getNumeroEquipamentosAudiovisuais();
    }

    @Override
    public float calcularSeguranca() {
        return getCustoSegurancaPorPessoa() * getNumeroLugares();
    }
    
    public float calculaCustoTotal()
    {
        return calculaPPM() + calcularAudioVisual() + calcularSeguranca();
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public int getNumeroEquipamentosAudiovisuais() {
        return numeroEquipamentosAudiovisuais;
    }

    public espacosCentroCongressos getAuditorio() {
        return auditorio;
    }

    public float getCustoUnitarioEquipamentoAudiovisual() {
        return custoUnitarioEquipamentoAudiovisual;
    }

    public float getCustoSegurancaPorPessoa() {
        return custoSegurancaPorPessoa;
    }

    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public void setNumeroEquipamentosAudiovisuais(int numeroEquipamentosAudiovisuais) {
        this.numeroEquipamentosAudiovisuais = numeroEquipamentosAudiovisuais;
    }

    public void setAuditorio(espacosCentroCongressos auditorio) {
        this.auditorio = auditorio;
    }

    public void setCustoUnitarioEquipamentoAudiovisual(float custoUnitarioEquipamentoAudiovisual) {
        this.custoUnitarioEquipamentoAudiovisual = custoUnitarioEquipamentoAudiovisual;
    }

    public void setCustoSegurancaPorPessoa(float custoSegurancaPorPessoa) {
        this.custoSegurancaPorPessoa = custoSegurancaPorPessoa;
    }
    
    public static int getContador() {
        return contador;
    }

    public static String getIdentificador() {
        return identificador;
    }

    public static int getNUMERO_LUGARES_POR_OMISSAO() {
        return NUMERO_LUGARES_POR_OMISSAO;
    }

    public static int getNUMERO_EQUIPAMENTOS_AUDIOVISUAIS() {
        return NUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    public static void setIdentificador(String aIdentificador) {
        identificador = aIdentificador;
    }

    public static void setNUMERO_LUGARES_POR_OMISSAO(int aNUMERO_LUGARES_POR_OMISSAO) {
        NUMERO_LUGARES_POR_OMISSAO = aNUMERO_LUGARES_POR_OMISSAO;
    }

    public static void setNUMERO_EQUIPAMENTOS_AUDIOVISUAIS(int aNUMERO_EQUIPAMENTOS_AUDIOVISUAIS) {
        NUMERO_EQUIPAMENTOS_AUDIOVISUAIS = aNUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
    }
    
}
