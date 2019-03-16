package com.qzz.day02.set;

import java.util.Set;
import java.util.HashSet;


/**
 * @ClassName HastSetDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/19 9:36
 * @Title 愿上苍有好生之德
 * @Description:
 **/
class A {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class B {
    @Override
    public int hashCode() {
        return 1;
    }
}

class C {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new A());
        set.add(new A());
        set.add(new B());
        set.add(new B());
        set.add(new C());
        set.add(new C());
        System.out.println(set.size());
        System.out.println(set);
    }
}
