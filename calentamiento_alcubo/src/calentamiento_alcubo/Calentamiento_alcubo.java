/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calentamiento_alcubo;

import javax.swing.JOptionPane;


public class Calentamiento_alcubo {

  
    public static void main(String[] args) {
        
        int numero;
        int cubo;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingresar un numero "));
        
        while (numero >= 0){
            cubo = (int) Math.pow(numero,3);
            JOptionPane.showMessageDialog(null, "El numero: "+numero+" Al cubo es: "+cubo);
        
            numero = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingresar otro numero "));
            
        } 
               
       
    }
    
}
