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
public class SistemaIfsul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*ItemPatrimonio ip; 
        ip = new ItemPatrimonio("12 anos","PC DELL", 17, "1234567890-00");
        System.out.println(ip);*/
         
            ArrayList<ItemPatrimonio> estoque;
        
        estoque = new ArrayList();
        
       ItemPatrimonio ip;
        ip =  new ItemPatrimonio ("12 anos", "PC Dell preto", 17, "12345678-08", 1000.01, 12
        );
        System.out.println(ip);
        
        estoque.add(ip);
        estoque.add(new ItemPatrimonio ("12 anos", "PC Dell preto", 17, "12345678-08", 1000.01, 12);

        
        System.out.println(lista);
        
        for (Produto l : lista){
            System.out.println(l);
        }
          
        
        
        
        
    }
    
}
