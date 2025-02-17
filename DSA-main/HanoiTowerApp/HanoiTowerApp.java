/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HanoiTowerApp;

/**
 *
 * @author Dulnith
 */
public class HanoiTowerApp {
    static int hanoiCount(int no_of_disks)
    {
        if(no_of_disks == 1)//move the single disk
            return 1;      
        return 2 * hanoiCount(no_of_disks - 1) + 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int noOfDisks = 5;
        int no_of_steps;
        no_of_steps = hanoiCount(noOfDisks);
        System.out.println("Total number of steps: " + no_of_steps);
    }
    
}
