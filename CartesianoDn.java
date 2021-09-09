/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianodn;

/**
 *
 * @author Usuario
 */
public class CartesianoDn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Segmento s1= new Segmento();
        Segmento s2= new Segmento(2, 4, 3, 5);
        Segmento s3= new Segmento(s2);
        
        s1.print("s1");
        s2.print("s2");
        s3.print("s3");
        
        s3.desloc(1, 2);
        s3.print("s3");
        
        s3.escale(2);
        s3.print("s3");
        
        System.out.println("Comprimento de s1: " + s1.length());
        
        System.out.println("s2 é válido?: " + (s2.isValid()?"Sim":"Não") );
        
        s3.assign(s2);
        s3.print("s3");
        
        Ponto pm= s1.midPoint();
        pm.print("pm");
        
        
        s2.print("s2");
        Ponto p= s2.getP1();
        p.escale(2);
        s2.print("s2");
        
        
        Ponto pt= new Ponto(1,1);
        pt.print("pt");
        s2.setP1(pt);
        s2.print("s2");
        
        pt.escale(2);
        pt.print("pt");
        s2.print("s2");
                
        
        
//        Ponto p0= new Ponto();
//        Ponto p1= new Ponto(10, 20);
//        Ponto p2= new Ponto(p1);
//        
//        p0.print();
//        p1.print();
//        p2.print();
//        
//        p2.assign(p0);
//        p2.print();
//        
//        p2.desloc(3, 4);
//        p2.print();
//        
//        p2.escale(2);
//        p2.print();
//        
//        System.out.println("Distancia de p1 até (2,5): " + p1.distance(2, 5) );
//        
//        p2.assign(p1);
//        p2.desloc(3, 4);
//        
//        System.out.println("Distancia de p1 até p2: " + p1.distance(p2) );
//        
//        p2.setXY(3, 4);
//        System.out.println("Distancia de p2 até (0,0): " + p2.distance() );
//        
//        p0.print("p0");
//        p1.print("p1");
//        p2.print("p2");
//        
//        System.out.println("p1: " + p1);
    }
    
}
