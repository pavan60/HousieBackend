package com.pavan.BackendHousie.Housie;

import java.util.*;
import java.lang.*;

public class Test1 {

    public static void main(String[] args){

        char[] type = new char[]{'c','h','d','s'};
        int[] type_count = new int[]{13,13,13,13};

        String[] p1,p2,p3,p4;
        p1 = new String[13];
        p2 = new String[13];
        p3 = new String[13];
        p4 = new String[13];

        int temp1 = 5,temp2=14;
        for(int i=0;i<52;i++){
            while( !(temp1 >= 0 && temp1 < 4) ) {
                temp1 = (int) (Math.random() * 4);
                if(type_count[temp1] <0 )
                    temp1 = 5;
            }
            while(!(temp2 >= 0 && temp2 < 13)){
                temp2 = (int) (Math.random() * 13);
            }
            p1[i] = type_count[temp2]+""+type[temp1];
        }

    }
}
