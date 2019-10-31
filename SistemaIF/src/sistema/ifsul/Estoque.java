/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.ifsul;

import java.util.ArrayList;
/**
 *
 * @author JOÃO GILBERTO
 */
public class Estoque {
        ArrayList<ItemPatrimonio> estoque; 
        int qntEstoque; 
        int capacidadeEstoque; 
        
        public Estoque () { 
    this.qntEstoque=0; 
    this.estoque= new ArrayList(); 
}
    
        
        public void addItem (ItemPatrimonio ip){ 
            boolean achei = false; 
            for (ItemPatrimonio ipe : this.estoque){
                if(ipe.equals(ip)) { 
                ipe.addItem(ip.qntEstoque); 
                achei=true; 
                break; 
            }
            }
            return false; 
        }
        
        public void RemoveItem (int qntEstoque){ 
               
            
            
            
        }
        
                public void RemoveItem (ItemPatrimonio ip){ 
            boolean achei = false; 
            for (ItemPatrimonio ipe : this.estoque){
                if(ipe.equals(ip)) { 
                ipe.RemoveItem(ip.qntEstoque); 
                achei=true; 
                break; 
            }
            }
        }

    public ArrayList<ItemPatrimonio> getEstoque() {
        return estoque;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public int getCapacidadeEstoque() {
        return capacidadeEstoque;
    }
                
                
        
        
        
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
}
 
