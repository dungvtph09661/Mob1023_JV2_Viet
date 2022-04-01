/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throw_throwsexception;

/**
 *
 * @author Admin
 */
import java.io.IOException;
 
public class TestThrows {
    void m() throws IOException {
        System.out.println("Loi khong tim thay file");// checked exception
    }
 
    void n() throws IOException {
        m();
    }
 
    void p() {
        //m();
        try {
            m();
        } catch (IOException e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }
 
    public static void main(String args[]) {
        TestThrows obj = new TestThrows();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}
