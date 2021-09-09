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
public class Segmento 
{
    private Ponto p1, p2;
    
    // Construtor padrão
    //
    public Segmento()
    {
        p1= new Ponto();
        p2= new Ponto(0, 1);
    }
    
    // Construtor parametrizado
    //
    public Segmento(double x1, double y1, double x2, double y2)
    {
        p1= new Ponto(x1, y1);
        p2= new Ponto(x2, y2);
    }
    
    // Construtor de cópia
    //
    public Segmento(Segmento s)
    {
        p1= new Ponto(s.p1);
        p2= new Ponto(s.p2);
    }
    
    // Métodos
    //
    public void assign(Segmento sg)
    {
        p1.assign(sg.p1);
        p2.assign(sg.p2);                
    }
    
    public void desloc(double dx, double dy)
    {
        p1.desloc(dx, dy);
        p2.desloc(dx, dy);
    }
    
    public void escale(double factor)
    {
        p1.escale(factor);
        p2.escale(factor);
    }
    
    @Override
    public String toString()
    {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
    
    public double length()
    {
        return p1.distance(p2);
    }
    
    public boolean isValid()
    {
        if(p1 == null || p2 == null) return false;
        if(p1.getX() == p2.getX() && p1.getY() == p2.getY()) return false;
        
        return true;
    }
    
    public Ponto midPoint()
    {
        double xm= (p1.getX() + p2.getX())/2;
        double ym= (p1.getY() + p2.getY())/2;
        
        return new Ponto(xm, ym);
    }
    
    public void print()
    {
        System.out.println(toString());
    }

    public void print(String caption)
    {
        System.out.println(caption + toString());
    }

    // Getters
    //
    public Ponto getP1() 
    {
        return new Ponto(p1);
    }

    public Ponto getP2() 
    {
        return new Ponto(p2);
    }
    
    // Setters
    //
    public void setP1(Ponto p1) 
    {
        this.p1 = new Ponto(p1);
    }

    public void setP2(Ponto p2) 
    {
        this.p2 = new Ponto(p2);
    }
    
    
}
