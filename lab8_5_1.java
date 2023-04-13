/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8_lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab8_lab5 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Double> array = new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
       nhapDS();
       xuatDS();
       
        
    }
    
    public static void nhapDS(){
        Scanner sc = new Scanner(System.in);
        String them;
        while(true){
            System.out.println("Nhap so thuc ");
            Double x = sc.nextDouble();
            array.add(x);
            System.out.println("Tiep tuc nhap hoac nhan n de bo qua ");
            them = sc.next();
            
            if(them.equalsIgnoreCase("n"))
                break;
        }
    }

    private static void xuatDS() {
        for(int i= 0; i< array.size();i++){
            System.out.println(array.get(i).toString());
        }
    }
}
