/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * 
 */
public class QuantityException extends Exception{
    public String message(){
        return "Quantity beli lebih besar dari stok yang tersedia";
    }
}
