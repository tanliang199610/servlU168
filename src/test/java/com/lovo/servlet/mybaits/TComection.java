package com.lovo.servlet.mybaits;

import org.junit.Test;

public class TComection {
    @Test
    public void Tests(){
        try {
          Class c1=  Class.forName("com.mysql.jdbc.Driver");
            System.out.printf(c1.toString());
            System.out.printf("Hello Word");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
