package org.main.basic.IO.decorateStream.serialize;

import java.io.Serializable;

public class ClassA implements Serializable {

    /** 직렬화 포함 */
    int field1;
    ClassB field2 = new ClassB();

    /** 직렬화 제외 */
    static int field3;
    transient int field4;

}