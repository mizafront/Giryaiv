package kek;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fr= new FileReader("students.txt" );
        Scanner scan = new Scanner(fr);
        System.out.println(scan);
        ArrayList<String> plavuni = new ArrayList<String>();
        ArrayList<String> plavuniTime = new ArrayList<String>();
        ArrayList<String> test = new ArrayList<String>();
        while (scan.hasNextLine()) {
            int i = 0;
            String[] lol = scan.nextLine().split(" -");

            for (String loll : lol) {
                test.add(lol[i]);
                i++;
            }
//
        }
        fr.close();
        for (int i = 0; i < test.size() ; i++) {
            System.out.println(i + 1  + ". " + test.get(i));
        }
        int schet = 0;
        for (;schet < test.size() ; schet++) {
            if ( schet % 2 == 0 ){
                plavuni.add(test.get(schet));
            }else {
                plavuniTime.add(test.get(schet));
            }
        }

        System.out.println("-----------------------");
        for (int i = 0; i < plavuni.size() ; i++) {
            System.out.println(i + 1  + ". " + plavuni.get(i));
        }

        System.out.println("-----------------------");
        for (int i = 0; i < plavuniTime.size() ; i++) {
            System.out.println(i + 1  + ". " + plavuniTime.get(i));
        }
        Collections.sort(plavuniTime);
        System.out.println("-----------------------");
        for (int i = 0; i < plavuniTime.size() ; i++) {
            System.out.println(i + 1  + ". " + plavuniTime.get(i));
        }
        int check = 0;
        int a=0;
        int b=0;
        for (int i = 0 ;i < plavuniTime.size();i++) {
            while (check == 0) {
                if (test.get(a) == plavuniTime.get(b)) {
                    System.out.println(test.get(a - 1));
                    System.out.println(plavuniTime.get(b));
                    check = 1;
                }
                a++;
            }
            b++;
            check = 0;
            a = 0;
        }

    }

}
