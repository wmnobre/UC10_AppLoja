package model;

/**
 *
 * @author 181301765
 */
public class Estado {
    
    private int codigo;
    private String nome;

    @Override
    public String toString() {
        return nome;
    }
    
    
    
    public Estado(){
        
    }
    
    public Estado(String nome){
        this.nome = nome;
        
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo; 
                        
    }
    
     public String getNome(){
        return nome;
     }
                
      
    public void setNome(String nome){
        this.nome = nome; 
    }
    
}
    
    





