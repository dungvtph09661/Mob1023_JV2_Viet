/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycach_exception;

/**
 *
 * @author HongAnh
 */
public class TryCach_Exception {

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
 
       // System.out.println("a/b = " + a / b);

        //Cách các bài trước thường làm, dùng if, else:
//        if (b == 0) {
//            System.out.println("Lỗi chia cho 0");
//        } else {
//            System.out.println("a/b = " + a / b);
//        }
// 
        System.out.println("\nCách dùng try - catch - finally \n");
 
        //Sử dụng try, catch để bắt lỗi:
        try {
            System.out.println("a/b = " + a / b);
        } catch (Exception e1) {
            System.out.println("Có lỗi gì đó xảy ra  ");
            System.out.println("Tên lỗi là: " + e1);
        } finally {
            System.out.println("Finally: Có lỗi hay không thì cái dòng cuối cùng này vẫn được in ra!");
        }
 
    }
    
}
