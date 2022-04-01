/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch_exception2;

import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author HongAnh
 */
public class TryCatch_Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Vui lòng nhập dữ liệu: ");
            try {
                int so = Integer.parseInt(scanner.nextLine());
                System.out.println(so + " * 3.14 = " + so * 3.14);
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập không phải kiểu số!");
            }
        }
    }
    
}
