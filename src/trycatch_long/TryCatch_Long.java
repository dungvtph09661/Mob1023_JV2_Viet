/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch_long;

/**
 *
 * @author HongAnh
 */
public class TryCatch_Long {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){  
    try{  
      try{  
       System.out.println("Thuc hien phep chia");  
       int b =39/0;  
      }catch(ArithmeticException e){System.out.println("Lỗi: "+e);}  

      try{  
      int a[]=new int[5];  
      a[6]=4;  
      }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  

      System.out.println("cau lenh tiep theo: ");  
    }catch(Exception e){System.out.println("Da xu ly");}  

    System.out.println("Luong chuan..");  
 }  
    
}
