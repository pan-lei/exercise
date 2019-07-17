package com.panlei.reflect;

import com.panlei.entity.User;
import org.junit.Test;

/**
 * @author pan_l
 * @ClassName TestReflect
 * @Description 反射练习
 * @date 2019-07-17 9:56
 */
public class TestReflect {

    @Test
    public void getInstance() {
        try {
            String className = "com.panlei.entity.User";
            Class clazz = Class.forName(className);
            User u = (User) clazz.newInstance();
            System.out.println(u);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
