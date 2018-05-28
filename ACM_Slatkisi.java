/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_slatkisi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tongd
 */
public class ACM_Slatkisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        for (int i = 0; i < time; i++) {
            int can = sc.nextInt();
            ArrayList<Integer> cans = new ArrayList<Integer>();
            int maxi = -1;
            int max = -1;
            int count = 0;
            int total = 0;
            int last = 0;
            for (int l = 0; l < can; l++) {
                int next = sc.nextInt();
                cans.add(next);
                total += next;
                if (next > max) {
                    max = next;
                    maxi = l;
                }
                
                if (next == last) {
                    count++;
                }
                last = next;
            }
            total = total/2;
            maxi++;
            int acount = 0;
            for(int k = 0; k < cans.size(); k++ ) {
                if (cans.get(k) == max) acount++;
            }
            if(acount > 1 || count == cans.size() - 1) {
                System.out.println("no winner");
            }
            else if (max > total) {
                System.out.format("majority winner %d\n", maxi);
            }
            else {
                System.out.format("minority winner %d\n",maxi);
            }
        }
    }
}
