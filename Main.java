package coba;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n m : ");
        String mn = input.nextLine();

        String[] arrmn = mn.split(" ");
        int m = Integer.parseInt(arrmn[1]);
        int n = Integer.parseInt(arrmn[0]);

        System.out.print("topics : ");
        String[] topic = new String[n];
        for (int i = 0; i < n; i++) {
            topic[i] = input.nextLine();
        }

        int[] result = acmTeam(topic,m);
        System.out.println(Arrays.toString(result));
    }

    static int[] acmTeam(String[] topic,int m) {
        int res = 0;
        int sumRes = 0;

        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {

                int temp = 0;
                for(int x =0;x<m;x++){
                    if(topic[i].charAt(x) == '1' || topic[j].charAt(x) == '1'){
                        temp++;
                    }
                }

                if (res == temp){
                    sumRes++;
                }

                if(res<temp){
                    res = temp;
                    sumRes =1;
                }
            }
        }
        return new int[]{res,sumRes};
    }
}