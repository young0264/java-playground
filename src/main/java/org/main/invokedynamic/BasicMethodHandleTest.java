package org.main.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;

public class BasicMethodHandleTest {
    public static void main(String[] args) throws Throwable {

        // public method에 대한 액세스를 제공하는 lookup을 만듦
        Lookup publicLook = MethodHandles.publicLookup();


        //private, protected method에 대한 액세스를 제공하는 lookup을 만듦
        Lookup otherLookup = MethodHandles.lookup();

        MethodType methodType = MethodType.methodType(String.class, char.class, char.class);
        MethodHandle replaceMethodHandle = publicLook.findVirtual(String.class, "replace", methodType);

        String output = (String) replaceMethodHandle.invoke("java", Character.valueOf('a'), 'o');
//        String output = (String) replaceMethodHandle.invoke("java", Character.valueOf('a'), 'o');
//        String output = (String) replaceMethodHandle.invoke("java", Character.valueOf('o'), 'a'); // auto-unboxing을 앞에서 해준다
        System.out.println("output : "+ output);
    }
}
