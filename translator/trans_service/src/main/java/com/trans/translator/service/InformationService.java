package com.trans.translator.service;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/19 20:33
 *
 * 信息可以
 *  编辑、删除、发送
 */
public interface InformationService <T> {
    /**
     * 编辑信息
     * 关于不定参数
     *  我们在编写方法的过程中，可能会遇见一个方法有不确定参数个数的情况。一般我们会用方法重载来解决问题：
     *  但是当参数多的时候就会显得很繁琐，同时每次扩展都会很麻烦。于是我们可以使用数组作为参数：
     *  But，这样还是有个准备参数的过程（还要构造一个数组，麻烦啊）。于是我们可以使用不定项参数（可变参数）的方式：
     *  xxx...args的参数形式能实现不定项参数实质上是因为变量args是一个数组
     *  注意事项：
     *   1）不定项参数必须放在参数列表最后一个。
     *   2）不定项参数只能有一个（多个，必然有一个不是最后一个）。
     *   3）重载时，运行优先级问题。//确定参数的方法优先级高于不定项参数的方法
     * @param obj 不定参数
     * @return
     */
    T editInformation(Object...obj);

    /**
     * 删除信息
     * @param obj
     * @return
     */
    T deleteInformation(Object...obj);

    /**
     * 发送信息
     * @param obj
     * @return
     */
    T sendInformation(Object...obj);
}
