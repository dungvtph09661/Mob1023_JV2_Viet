/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throw_throwsexception;
import java.util.Scanner;
/**
 *
 * @author HongAnh
 */
public class Throw_ThrowsException {

    /**
     * @param args the command line arguments
     */
    public static void ps (int a, int b) throws RuntimeException
    {
        if (b == 0)
            throw new RuntimeException ();
        else
            System.out.print ("Ket Qua: " + a/b);
    }
    public static void main (String args [])
    {
        int tuso, mauso, ketqua;
        System.out.println ("Chuong trinh tinh phan so: ");
        Scanner input = new Scanner (System.in);
        System.out.print ("Tu so: ");
        tuso = input.nextInt ();
        System.out.print ("Mau so: ");
        mauso = input.nextInt ();
        ps (tuso, mauso);
    }
    
}
