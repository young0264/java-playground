package org.main.java_performance_tuning_story.ch3;

import java.util.logging.Logger;

public class String_Builder_Buffer {
    public static void main(String[] args) {

        final String aValue = "abcde";
        Logger logger = Logger.getLogger("Logger");

        for (int i = 0; i < 10; i++) {
            String a = new String();
            StringBuffer b = new StringBuffer();
            StringBuilder c = new StringBuilder();

            long startTime = System.currentTimeMillis();
            for(int j=0; j<100000; j++) {
                a += aValue;
            }
            long endTime = System.currentTimeMillis();
            logger.info("String spent time1 : " + (endTime - startTime));

            long startTime2 = System.currentTimeMillis();
            for (int j = 0; j < 100000; j++) {
                b.append(aValue);
            }
            long endTime2 = System.currentTimeMillis();
            logger.info("String spent time2 : " + (endTime2 - startTime2));

            long startTime3 = System.currentTimeMillis();
            for (int j = 0; j < 100000; j++) {
                c.append(aValue);
            }
            long endTime3 = System.currentTimeMillis();
            logger.info("String spent time3 : " + (endTime3 - startTime3));
            logger.info("=================================================");
        }

    }
}
