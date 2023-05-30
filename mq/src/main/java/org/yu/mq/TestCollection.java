/*
 * author guo
 * year 2023
 */
package org.yu.mq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date 2023/3/28 14:34
 */

public class TestCollection {


    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("gzqiang", 25), new User("shanlvbi", 25));

        Integer reduce = users.stream().reduce(0, (a, user) -> a + user.getAge(), Integer::sum);
        System.out.println(reduce);
    }
}
