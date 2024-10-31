/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Haruki
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PhanSo phanSo = new PhanSo();
         PhanSo k = new PhanSo();
        
        // Nhập dữ liệu cho phân số 1
        System.out.println("Nhập thông tin cho phân số :");
        phanSo.input();
        
        
        // Hiển thị thông tin của phân số 1
        System.out.println("Thông tin phân số : " + phanSo);


        // Kiểm tra xem phân số  đã rút gọn chưa
        System.out.println("Phân số 1 đã rút gọn chưa? " + (phanSo.daRutGon()));
        
        // Rút gọn phân số 
        phanSo.rutGon();
        System.out.println("Phân số 1 sau khi rút gọn:" + phanSo);
        
        System.out.println("Nhập phân số k: ");
        k.input();
        
        PhanSo tong = phanSo.congPhanSo(k);
        System.out.println("Kết quả của phân số 1 cộng phân số 2: " + tong);

    }
    
    
}
