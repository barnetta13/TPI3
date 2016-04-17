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
public class testaCentroCongressos{
    
    public static void main(String[] args) {
        
        CentroCongressos cc1 = new CentroCongressos("Centro de Congressos do Porto",12);
        System.out.println(cc1);
        
        espacosCentroCongressos ep1 = new espacosCentroCongressos("B","Espaço com quadro interactivo",100);
        Auditorio auditorio1 = new Auditorio(ep1,200,3);
        cc1.adicionaEspaco(auditorio1);
        
        espacosCentroCongressos ep2 = new espacosCentroCongressos("E","Espaço com vidros transparentes",150);
        Auditorio auditorio2 = new Auditorio(ep2,300,5);      
        cc1.adicionaEspaco(auditorio2);
        
        espacosCentroCongressos ep3 = new espacosCentroCongressos("2","Espaço na Zona Este do Edíficio",80);
        Auditorio auditorio3 = new Auditorio(ep3,80,4);      
        cc1.adicionaEspaco(auditorio3);
                      
        espacosCentroCongressos ep4 = new espacosCentroCongressos("Desporto","Espaço para actividades relacionadas com o desporto",500);
        Pavilhao pavilhao1 = new Pavilhao(ep4,6);
        cc1.adicionaEspaco(pavilhao1);
        
        espacosCentroCongressos ep5 = new espacosCentroCongressos("4","Espaço para actividades recreativas",300);
        Pavilhao pavilhao2 = new Pavilhao(ep5,4);
        cc1.adicionaEspaco(pavilhao2);

        espacosCentroCongressos ep6 = new espacosCentroCongressos("30","Espaço na Zona Oeste do Edíficio",100);
        Sala sala1 = new Sala(ep6,0,2);
        cc1.adicionaEspaco(sala1);
        
        espacosCentroCongressos ep7 = new espacosCentroCongressos("32","Espaço na Zona Oeste do Edíficio",70);
        Sala sala2 = new Sala(ep7,1,1);
        cc1.adicionaEspaco(sala2);
                
        espacosCentroCongressos ep8 = new espacosCentroCongressos("34","Espaço na Zona Oeste do Edíficio",80);
        Sala sala3 = new Sala(ep8,2,2);
        cc1.adicionaEspaco(sala3);
        
        espacosCentroCongressos ep9 = new espacosCentroCongressos("36","Espaço na Zona Oeste do Edíficio",60);
        Sala sala4 = new Sala(ep9,3,0);
        cc1.adicionaEspaco(sala4);

        espacosCentroCongressos ep10 = new espacosCentroCongressos("C","Espaço na entrada do Edíficio",20);
        Halls hall1 = new Halls(ep10,10,30);
        cc1.adicionaEspaco(hall1);
        
        System.out.println(cc1.listaEspacos());
        
        System.out.println("Auditórios criados: " + Auditorio.getContador());
        System.out.println("Pavilhoes criados: " + Pavilhao.getContador());
        System.out.println("Salas criados: " + Sala.getContador());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Receita total do " + cc1.getNome() + ": " + cc1.calculaTotal() + "€");
        
        System.out.println();
        System.out.println();
        
        System.out.println(cc1.calculaTotalPorEspaco());
        
        System.out.println();
        
        System.out.println("Total a pagar de Segurança dos espaços principais: " + cc1.calculaTotalSegurancaEspacosPrincipais() + "€");
        
        System.out.println();
        System.out.println();
        
        System.out.println("Total a pagar em equipamentos AudioVisuais: " + cc1.calculaTotalEquipamentosAudioVisuais() + "€");
        
        System.out.println();
        System.out.println();

        System.out.println("Total a pagar em Seguranca dos Halls: " + cc1.calculaSegurancaHalls() + "€");

    }
    
}
