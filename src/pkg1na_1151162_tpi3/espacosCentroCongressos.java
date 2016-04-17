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
public class espacosCentroCongressos {
    
    private String nome;
    private String descricao;
    private float area; 
    
    private static String NOME_POR_OMISSAO = "N/A";
    private static String DESCRICAO_POR_OMISSAO = "N/A";
    private static float AREA_POR_OMISSAO = 0;
    
    private Object listaObjectos = new Object[20];
    private int contaObjectos = 0;
    
    public espacosCentroCongressos (String nome, String descricao, float area)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.area = area;
        contaObjectos++;   
    }
    
    public espacosCentroCongressos ()
    {
        this.nome = NOME_POR_OMISSAO;
        this.descricao = DESCRICAO_POR_OMISSAO;
        this.area = AREA_POR_OMISSAO;
    }
        
    public espacosCentroCongressos(espacosCentroCongressos outroObjecto)
    {
        this.nome = outroObjecto.nome;
        this.descricao = outroObjecto.descricao;
        this.area = outroObjecto.area;
    }
    
    @Override
    public String toString()
    {
        return "Nome/Número: " + getNome() + "\nDescrição: " + getDescricao() + "\nÁrea: " + getArea();
    }
    
    public float calculaSegurancaEspacosPrincipaisAuditorio(Auditorio auditorio)
    {
        return auditorio.calcularSeguranca();
    }
    
    public float calculaSegurancaEspacosPrincipaisPavilhao(Pavilhao pavilhao)
    {
        return pavilhao.calcularSeguranca();
    }
    
    public float calculaEquipamentosAudioVisuaisAuditorio(Auditorio auditorio)
    {
        return auditorio.calcularAudioVisual();
    }
    
    public float calculaEquipamentosAudioVisuaisSala(Sala sala)
    {
        return sala.calcularAudioVisual();
    }
    
    public float calculaSegurancaHalls(Halls hall)
    {
        return hall.calcularSeguranca();
    }
    
    public float auditorio(Auditorio auditorio)
    {
        return auditorio.calculaCustoTotal();
    }
    
    public float pavilhao(Pavilhao pavilhao)
    {
        return pavilhao.calculaCustoTotal();
    }
    
    public float sala(Sala sala)
    {
        return sala.calculaCustoTotal();
    }
    
    public float halls(Halls hall)
    {
        return hall.calculaCustoTotal();
    }

    public String getDescricao() {
        return descricao;
    }

    public float getArea() {
        return area;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setArea(float area) {
        this.area = area;
    }
    public static String getDESCRICAO_POR_OMISSAO() {
        return DESCRICAO_POR_OMISSAO;
    }

    public static float getAREA_POR_OMISSAO() {
        return AREA_POR_OMISSAO;
    }

    public static void setDESCRICAO_POR_OMISSAO(String aDESCRICAO_POR_OMISSAO) {
        DESCRICAO_POR_OMISSAO = aDESCRICAO_POR_OMISSAO;
    }

    public static void setAREA_POR_OMISSAO(float aAREA_POR_OMISSAO) {
        AREA_POR_OMISSAO = aAREA_POR_OMISSAO;
    }

    public int getContaObjectos() {
        return contaObjectos;
    }

    public String getNome() {
        return nome;
    }

    public Object getListaObjectos() {
        return listaObjectos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaObjectos(Object listaObjectos) {
        this.listaObjectos = listaObjectos;
    }

    public void setContaObjectos(int contaObjectos) {
        this.contaObjectos = contaObjectos;
    }
    
    public static String getNOME_POR_OMISSAO() {
        return NOME_POR_OMISSAO;
    }

    public static void setNOME_POR_OMISSAO(String aNOME_POR_OMISSAO) {
        NOME_POR_OMISSAO = aNOME_POR_OMISSAO;
    }
}
