package com.pavan.BackendHousie.Housie;

import java.util.*;
import java.lang.*;
public class TriangleArea {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2,x3,y3;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        double a,b,c,s,area;

        a = Math.sqrt( ( (x2-x1) * (x2-x1) ) + ((y2-y1) * (y2-y1)) );
        b = Math.sqrt( ( (x3-x2) * (x3-x2) ) + ((y3-y2) * (y3-y2)) );
        c = Math.sqrt( ( (x3-x1) * (x3-x1) ) + ((y3-y1) * (y3-y1)) );

        System.out.println(a+" "+b+" "+c);

        s = (a+b+c)/2;

        area = Math.sqrt( (s) * (s-a) * (s-b) * (s-c));

        System.out.println(area);
    }
}
