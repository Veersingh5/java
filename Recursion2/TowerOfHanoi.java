package Recursion2;
import java.util.Scanner;
public class TowerOfHanoi {
    static Scanner s = new Scanner(System.in);
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination){
        if(disks == 0) {
            return;
        }
        else if(disks ==1) {
            System.out.println("disk: "+ disks+ " - " + source+ " " +destination);
            return;
        }
        else {
            towerOfHanoi(disks-1, source, destination, auxiliary);
            System.out.println("disk: "+ disks+ " - " + source+ " " +destination);
            towerOfHanoi(disks-1, auxiliary, source, destination);
        }
    }
    public static void main(String[] args) {
        int disks = s.nextInt();
        towerOfHanoi(disks, 'a', 'b', 'c');
    }
}
