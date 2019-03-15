package com.haoyang.javaTest.designPattern.prototype.deep;

/**
 * @Author: hanhaoyang@ehaier.com
 * @Date: 2019/3/15 15:02
 */
public class DeepCloneTest {
    public static void main(String[] args) {

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.deepClone();
        System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));
    }
}
