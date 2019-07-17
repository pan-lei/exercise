package com.panlei.dynaproxy;

/**
 * @author pan_l
 * @ClassName NikeFactory
 * @Description
 * @date 2019-07-17 10:13
 */
public class NikeFactory implements ClothFactory {
    @Override
    public void product() {
        System.out.println("NikeFactory product运行");
    }

    @Override
    public int count(int i) {
        System.out.println("NikeFactory count运行");
        return i+1;
    }
}
