/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch_exception2;

import java.util.Scanner;

/**
 *
 * @author HongAnh
 */
public class Vidu2 {
    public static void main(String[] args) {
        try {
            String number = null;          
            Scanner nhap = new Scanner(System.in);
            String temp = null;
            if ((temp = nhap.nextLine()).isEmpty()) {
                number = null;
            } else {
                number = temp;
            }
            System.out.println("temp = [" + temp + "]");
            float soThuc = Float.parseFloat(number);
            System.out.println("Số thực: " + soThuc);
            
            System.out.println("Phép chia = " + (10 / (int) soThuc));
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Dữ liệu không hợp lệ");
        } catch (ArithmeticException arExp) {
            System.out.println("Lỗi tính toán");
        }catch (Exception e) {
            System.out.println("Không thể thực hiện thao tác, vui lòng báo quản trị viên.");
        } finally {
            System.out.println("Chương trình kết thúc.");
        }

    }


}
