package org.main.basic.knouExamGrammar;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;

public class GenericExam {
    public static void main(String[] args) {
        ArrayList firstList = new ArrayList<>();
        firstList.add("Hello");
//        String res1 = firstList.get(0); //컴파일 에러(Provided : Object)

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Java");
        String res2 = secondList.get(0);

//        Path
//        Thread
//        LinkedList
    }
}
