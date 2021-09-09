/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartesianodn;

/**
 *
 * @author Beatriz
 */
public class Triangulo {
    private Ponto va, vb, vc;
        public Triangulo(){
            va = new Ponto();
            vb = new Ponto(1,0);
            vc = new Ponto(0,1);
        }
        
    public Triangulo (double a1, double a2, double b1, double b2, double c1, double c2){
        va = new Ponto(a1, a2);
        vb = new Ponto(b1, b2);
        vc = new Ponto(c1, c2);
    }
    
    public Triangulo( Triangulo tn){
        va = new Ponto(tn.va);
        vb = new Ponto(tn.vb);
        vc = new Ponto(tn.vc);
    }
        
    
    public double lengthA(){
        return va.distance(vb);   
    }
    
    public double lengthB(){
        return vb.distance(vc);
    }
    
    public double lengthC(){
        return vc.distance(va);
    }
    
    //retornar true se o triângulo possuir 3 lados
    public boolean equilateral(){
        return va==vb && vb==vc && vc==va;
    }
    
    //retornar o perímetro do triangulo
    public double perimeter( double va, double vb, double vc){
        return va + vb +vc;
    }
    
    //retornar a área do triângulo
    public double area(){
        double p;
        double a;
        p = perimeter()/2;
        a = p * (p-lengthA())*(p-lengthB())*(p-lengthC());
        return Math.sqrt(a);
    }
    
    //retorna true se é um triângulo válido
    public boolean isValid(){
        if ((va==null) || (vb==null) || (vc==null)){
        return false;
    }else if((lengthA() <= 0) || (lengthB() <= 0) || (lengthC() <= 0)){
            return false;
        }else{ 
            return true;
    }}
    
    public Ponto gravCenter(){
        double centerX = ((va.getX()+vb.getX()+vc.getX())/2);
        double centerY = ((va.getY()+vb.getY()+vc.getY())/2);
            return new Ponto (centerX, centerY);
    }
    
    @Override
    public String toString(){
        return "["+ va.toString()+ "," + vb.toString() + "," + vc.toString() + "]";
    }
    public void print(){
        System.out.println(toString());
    }
    public void print(String caption){
        System.out.println(caption);
        print();
    }
    
    public Ponto getVa(){
       return new Ponto(va);
    }
    
    public Ponto getVb(){
        return new Ponto(vb);
    }
    
    public Ponto getVc(){
        return new Ponto(vc);
    }
    
    public void setVa(Ponto va){
        this.va = new Ponto(va);
    }
    
    public void setVb(Ponto vb){
        this.vb = new Ponto(vb);
    }
    
    public void setVc(Ponto vc){
        this.vc = new Ponto(vc);
    }

    private double perimeter() {
        return lengthA() + lengthB() + lengthC();
    }
        
      
}

