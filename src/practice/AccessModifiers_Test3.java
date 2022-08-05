package practice;

import day40_FinalKeyword.ProtectedAccessModifier;

import java.security.ProtectionDomain;

public class AccessModifiers_Test3 extends ProtectedAccessModifier{
    public static void main(String[] args) {
    //    System.out.println(ProtectedAccessModifier.name0);  // private
    //    System.out.println(ProtectedAccessModifier.name1);  // default
        System.out.println(ProtectedAccessModifier.name2);  // protected
        System.out.println(ProtectedAccessModifier.name3);  // public
    }
}
