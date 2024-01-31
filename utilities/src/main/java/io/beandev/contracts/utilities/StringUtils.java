/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.beandev.contracts.utilities;

import io.beandev.contracts.list.LinkedList;

import static java.lang.System.out;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        out.println("Splitting string: " + source);
        return SplitUtils.split(source);
    }
}