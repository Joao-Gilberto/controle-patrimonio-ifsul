/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.ifsul;

/**
 *
 * @author JOÃO GILBERTO
 */
public class ItemPatrimonio {
    private String vidaUtil;
    private String descricao;
    private int sala;  
    private final String codigoBarras;
    private double valor;
    private int qntEstoque;  

    public ItemPatrimonio(String vidaUtil, String descricao, int sala, String codigoBarras, double valor, int qntEstoque) {
        this.vidaUtil = vidaUtil;
        this.descricao = descricao;
        this.sala = sala;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
       
    }

   

    public String getVidaUtil() {
        return vidaUtil;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getSala() {
        return sala;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return qntEstoque;
    }
    
    
    
    @Override
    public String toString() {
        return "ItemPatrimonio{" + "vida Util=" + vidaUtil + ", descricao=" + descricao + ",sala =" + sala + ", codigo de barras=" + codigoBarras +" ,valor="+ valor +" ,quantidade="+ qntEstoque +'}';
    }

           }
    
        
        
   
    
    
    
   
           
    
    
    
    
    
    
