package com.practice;

public class OverrideMismatch {
    private void foo() {
        System.out.println("In BaseClass.foo1()");
    }

    void bar() {
        System.out.println("In BaseClass.bar()");
    }

    public static void main(String[] args) {
        OverrideMismatch po = new DerivedClass();
        po.foo(); // BASE_FOO_CALL
        po.bar();
    }
}

class DerivedClass extends OverrideMismatch {
    void foo() {
        System.out.println("In Derived.foo()");
    }

    
    void bar() {
        System.out.println("In Derived.bar()");
    }
}
