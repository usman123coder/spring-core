package com.stype.Collection;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al1 = new ArrayList();
        Vector v = new Vector();
        LinkedList ll = new LinkedList();

        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(v instanceof Serializable);
        System.out.println(v instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(v instanceof RandomAccess);
        System.out.println(ll instanceof RandomAccess);
        System.out.println(ll instanceof Serializable);
        System.out.println(ll instanceof Cloneable);
    }
}
