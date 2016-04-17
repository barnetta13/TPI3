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
public class CentroCongressos {
    
    private String nome;
    private espacosCentroCongressos[] listaObjectos;
    
    private static int index = 0;
    
    private static String NOME_POR_OMISSAO = "Centro de Congressos do Porto";
    private static int NUMERO_ESPACOS_MAXIMOS_POR_OMISSAO = 20;
    
    public CentroCongressos(String nome, int numeroDeEspacosMaximo)
    {
        this.nome = nome;
        this.listaObjectos = new espacosCentroCongressos[numeroDeEspacosMaximo];
    }
    
    public CentroCongressos(CentroCongressos outroCongresso)
    {
        this.nome = outroCongresso.nome;
        this.listaObjectos = outroCongresso.listaObjectos;
    }
    
    public CentroCongressos(String nome)
    {
        this.nome = nome;
        this.listaObjectos = new espacosCentroCongressos[NUMERO_ESPACOS_MAXIMOS_POR_OMISSAO];
    }
    
    public CentroCongressos()
    {
        this.nome = NOME_POR_OMISSAO;
        this.listaObjectos = new espacosCentroCongressos[NUMERO_ESPACOS_MAXIMOS_POR_OMISSAO];
    }
    
    @Override
    public String toString()
    {
        return "O " + getNome() + " tem capacidade máxima para " + getListaObjectos().length + " espaços.\n";
    }
    
    public void adicionaEspaco(espacosCentroCongressos novoEspaco)
    {
        this.getListaObjectos()[getIndex()] = novoEspaco;
        setIndex(getIndex() + 1);
    }
    
    public float calculaTotal()
    {
        float custoTotal = 0;
        for (int i = 0 ; i < listaObjectos.length ; i++)
        {
            if (listaObjectos[i] != null)
            {
                if (listaObjectos[i] instanceof Auditorio)
                {
                    custoTotal += listaObjectos[i].auditorio((Auditorio)listaObjectos[i]);
                }
                else if (listaObjectos[i] instanceof Pavilhao)
                {
                    custoTotal += listaObjectos[i].pavilhao((Pavilhao)listaObjectos[i]);    
                }
                else if (listaObjectos[i] instanceof Sala)
                {
                    custoTotal += listaObjectos[i].sala((Sala)listaObjectos[i]);
                }
                else if (listaObjectos[i] instanceof Halls)
                {
                    custoTotal += listaObjectos[i].halls((Halls)listaObjectos[i]);
                }
            }
        }
        return custoTotal;
    }
    
    public String calculaTotalPorEspaco()
    {
        String custoTotal = "";
        for (int i = 0 ; i < listaObjectos.length ; i++)
        {
            if (listaObjectos[i] != null)
            {
                if (listaObjectos[i] instanceof Auditorio)
                {
                    custoTotal += listaObjectos[i].getClass().getSimpleName() + ": " + listaObjectos[i].getNome() + "\n" + "Custo do espaço: ";
                    custoTotal += listaObjectos[i].auditorio((Auditorio)listaObjectos[i]) + "€\n";
                }
                else if (listaObjectos[i] instanceof Pavilhao)
                {
                    custoTotal += listaObjectos[i].getClass().getSimpleName() + ": " + listaObjectos[i].getNome() + "\n" + "Custo do espaço: ";
                    custoTotal += listaObjectos[i].pavilhao((Pavilhao)listaObjectos[i]) + "€\n";    
                }
                else if (listaObjectos[i] instanceof Sala)
                {
                    custoTotal += listaObjectos[i].getClass().getSimpleName() + ": " + listaObjectos[i].getNome() + "\n" + "Custo do espaço: ";
                    custoTotal += listaObjectos[i].sala((Sala)listaObjectos[i]) + "€\n";
                }
                else if (listaObjectos[i] instanceof Halls)
                {
                    custoTotal += listaObjectos[i].getClass().getSimpleName() + ": " + listaObjectos[i].getNome() + "\n" + "Custo do espaço: ";
                    custoTotal += listaObjectos[i].halls((Halls)listaObjectos[i]) + "€\n";
                }
            }
        }
        return custoTotal;
    }
    
    public float calculaTotalSegurancaEspacosPrincipais()
    {
        float custoTotal = 0;
        for (int i = 0 ; i < listaObjectos.length ; i++)
        {
            if (listaObjectos[i] != null)
            {
                if (listaObjectos[i] instanceof Auditorio)
                {
                    custoTotal += listaObjectos[i].calculaSegurancaEspacosPrincipaisAuditorio((Auditorio)listaObjectos[i]);
                }
                else if (listaObjectos[i] instanceof Pavilhao)
                {
                    custoTotal += listaObjectos[i].calculaSegurancaEspacosPrincipaisPavilhao((Pavilhao)listaObjectos[i]);   
                }
            }
        }
        return custoTotal;
    }
    
    public float calculaTotalEquipamentosAudioVisuais()
    {
        float custoTotal = 0;
        for (int i = 0 ; i < listaObjectos.length ; i++)
        {
            if (listaObjectos[i] != null)
            {
                if (listaObjectos[i] instanceof Auditorio)
                {
                    custoTotal += listaObjectos[i].calculaEquipamentosAudioVisuaisAuditorio((Auditorio)listaObjectos[i]);
                }
                else if (listaObjectos[i] instanceof Sala)
                {
                    custoTotal += listaObjectos[i].calculaEquipamentosAudioVisuaisSala((Sala)listaObjectos[i]);
                }
            }
        }
        return custoTotal;
    }
    
    public float calculaSegurancaHalls()
    {
        float custoTotal = 0;
        for (int i = 0 ; i < listaObjectos.length ; i++)
        {
            if (listaObjectos[i] != null)
            {
                if (listaObjectos[i] instanceof Halls)
                {
                    custoTotal += listaObjectos[i].calculaSegurancaHalls((Halls)listaObjectos[i]);
                }
            }
        }
        return custoTotal;
    }
    
    public String listaEspacos()
    {
        String retorno = "";
        for (int i = 0 ; i < getListaObjectos().length ; i++)
        {
            if (getListaObjectos()[i] != null)
            {
                retorno += getListaObjectos()[i].toString() + "\n";
            }
        }
        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public espacosCentroCongressos[] getListaObjectos() {
        return listaObjectos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaObjectos(espacosCentroCongressos[] listaObjectos) {
        this.listaObjectos = listaObjectos;
    }
    
    public static int getIndex() {
        return index;
    }

    public static String getNOME_POR_OMISSAO() {
        return NOME_POR_OMISSAO;
    }

    public static int getNUMERO_ESPACOS_MAXIMOS_POR_OMISSAO() {
        return NUMERO_ESPACOS_MAXIMOS_POR_OMISSAO;
    }

    public static void setIndex(int aIndex) {
        index = aIndex;
    }

    public static void setNOME_POR_OMISSAO(String aNOME_POR_OMISSAO) {
        NOME_POR_OMISSAO = aNOME_POR_OMISSAO;
    }

    public static void setNUMERO_ESPACOS_MAXIMOS_POR_OMISSAO(int aNUMERO_ESPACOS_MAXIMOS_POR_OMISSAO) {
        NUMERO_ESPACOS_MAXIMOS_POR_OMISSAO = aNUMERO_ESPACOS_MAXIMOS_POR_OMISSAO;
    }

}
