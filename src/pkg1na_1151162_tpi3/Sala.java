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
public class Sala extends espacosAuxiliares implements AudioVisual{
    
    private espacosCentroCongressos sala;
    private int numeroEquipamentosAudiovisuais;
    private String tipologia;
    
    private float custoUnitarioEquipamentoAudiovisual = 5;
    private float descontoTipologiaComDesconto = 0.2f;
    private String tipologiaComDesconto = "U";
    
    private static String[] defineTipologias = new String[]{"U","Quadrado","Rectangular","Círculo"};
    private static int contador = 0;
    private static String identificador = "Sala ";
    private static int TIPOLOGIA_POR_OMISSAO = 0;
    private static int NUMERO_EQUIPAMENTOS_AUDIOVISUAIS = 0;
    
    public Sala(espacosCentroCongressos espacoPrincipal, int tipologia, int numeroEquipamentosAudiovisuais)
    {
        this.sala = espacoPrincipal;
        this.tipologia = defineTipologias[tipologia];
        this.numeroEquipamentosAudiovisuais = numeroEquipamentosAudiovisuais;
        contador++; 
    }
    
    public Sala(espacosCentroCongressos espacoPrincipal)
    {
        this.sala = espacoPrincipal;
        this.tipologia = defineTipologias[TIPOLOGIA_POR_OMISSAO];
        this.numeroEquipamentosAudiovisuais = NUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
        contador++; 
    }
    
    public Sala()
    {
        this.tipologia = defineTipologias[TIPOLOGIA_POR_OMISSAO];
        this.numeroEquipamentosAudiovisuais = NUMERO_EQUIPAMENTOS_AUDIOVISUAIS; 
        contador++; 
    }

    @Override
    public String toString() {
        return "Tipo: " + getIdentificador() + "\n" + getSala().toString() + "\nTipologia: " + getTipologia() + "\nNumero de Equipamentos Audiovisuais: " +
                getNumeroEquipamentosAudiovisuais() + "\n";
    }
    
    @Override
    public float calculaCustoTotal()
    {
        float custo;
        if (this.getTipologia().equalsIgnoreCase(getTipologiaComDesconto()))
        {
            custo = calculaPPM() + calcularAudioVisual();
            float desconto = 1 - getDescontoTipologiaComDesconto();
            float novoCusto = custo * desconto;
            custo = novoCusto;
        }
        else
        {
            custo = calculaPPM() + calcularAudioVisual();
        }
        return custo;
    }
    
    @Override
    public float getArea()
    {
        return getSala().getArea();
    }
    
    @Override
    public String getNome()
    {
        return sala.getNome();
    }

    @Override
    public float calcularAudioVisual() {
        return getCustoUnitarioEquipamentoAudiovisual() * getNumeroEquipamentosAudiovisuais();
    }

    public int getNumeroEquipamentosAudiovisuais() {
        return numeroEquipamentosAudiovisuais;
    }

    public String getTipologia() {
        return tipologia;
    }

    public float getCustoUnitarioEquipamentoAudiovisual() {
        return custoUnitarioEquipamentoAudiovisual;
    }

    public float getDescontoTipologiaComDesconto() {
        return descontoTipologiaComDesconto;
    }

    public String getTipologiaComDesconto() {
        return tipologiaComDesconto;
    }

    public void setNumeroEquipamentosAudiovisuais(int numeroEquipamentosAudiovisuais) {
        this.numeroEquipamentosAudiovisuais = numeroEquipamentosAudiovisuais;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void setCustoUnitarioEquipamentoAudiovisual(float custoUnitarioEquipamentoAudiovisual) {
        this.custoUnitarioEquipamentoAudiovisual = custoUnitarioEquipamentoAudiovisual;
    }

    public void setDescontoTipologiaComDesconto(float descontoTipologiaComDesconto) {
        this.descontoTipologiaComDesconto = descontoTipologiaComDesconto;
    }

    
    public void setTipologiaComDesconto(String tipologiaComDesconto) {
        this.tipologiaComDesconto = tipologiaComDesconto;
    }

    public espacosCentroCongressos getSala() {
        return sala;
    }

    public void setSala(espacosCentroCongressos sala) {
        this.sala = sala;
    }
    
    public static String[] getDefineTipologias() {
        return defineTipologias;
    }

    public static int getContador() {
        return contador;
    }

    public static String getIdentificador() {
        return identificador;
    }

    public static int getTIPOLOGIA_POR_OMISSAO() {
        return TIPOLOGIA_POR_OMISSAO;
    }

    public static int getNUMERO_EQUIPAMENTOS_AUDIOVISUAIS() {
        return NUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
    }

    public static void setDefineTipologias(String[] aDefineTipologias) {
        defineTipologias = aDefineTipologias;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    public static void setIdentificador(String aIdentificador) {
        identificador = aIdentificador;
    }

    public static void setTIPOLOGIA_POR_OMISSAO(int aTIPOLOGIA_POR_OMISSAO) {
        TIPOLOGIA_POR_OMISSAO = aTIPOLOGIA_POR_OMISSAO;
    }

    public static void setNUMERO_EQUIPAMENTOS_AUDIOVISUAIS(int aNUMERO_EQUIPAMENTOS_AUDIOVISUAIS) {
        NUMERO_EQUIPAMENTOS_AUDIOVISUAIS = aNUMERO_EQUIPAMENTOS_AUDIOVISUAIS;
    }

}
