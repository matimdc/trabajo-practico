/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionresto;

/**
 *
 * @author Usuario
 */
public class FuncionResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(funcionResto(15 , 3));
    }
 
    public static int funcionResto (int dividendo ,  int divisor){
    int cociente;
    
     cociente = dividendo / divisor;
    
  return (dividendo-(divisor *  cociente));     
        
    }
}
