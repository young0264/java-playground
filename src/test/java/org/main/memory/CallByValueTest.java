package org.main.memory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallByValueTest {
    static class Student {
        String name;
        Student(String name) {
            this.name = name;
        }
    }

    /** 원시 타입 인자 수정 */
    void modifyPrimitive(int num) {
        num = 10; // 원본에는 영향 없음
    }

    /** 참조 타입 인자 수정 */
    void modifyReference(Student student) {
        student.name = "Changed"; // 원본 객체의 필드 값이 변경됨
    }

    /** 참조 타입 객체 수정 */
    void changeReference(Student student) {
        student = new Student("New Student"); // 새로운 객체 할당, 원본 영향 없음
    }

    @Test
    void testCallByValue_Primitive() {
        int original = 5;
        modifyPrimitive(original);
        assertEquals(5, original, "원시 타입 변수는 값이 변경되지 않아야 합니다.");
    }

    @Test
    void testCallByValue_Reference_ModifyField() {
        Student student = new Student("Original");
        modifyReference(student);
        assertEquals("Changed", student.name, "참조 타입의 필드는 변경될 수 있습니다.");
    }

    @Test
    void testCallByValue_Reference_ChangeReference() {
        Student student = new Student("Original");
        changeReference(student);
        assertEquals("Original", student.name, "참조 변수 자체를 변경해도 원본 객체에는 영향을 주지 않습니다.");
    }

}
