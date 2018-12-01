package com.main.activity.com.main.bean;

/**
 * Created by yangyuan on 2018/12/1.
 */

public class XiaoMing {

    String name;
    int sex;
    int age;
    String address;
    boolean hasGirlFriend;
    int totalMoney;

    public XiaoMing(Builder builder){
        this.name=builder.name;
        this.sex=builder.sex;
        this.age=builder.age;
        this.address=builder.address;
        hasGirlFriend=builder.hasGirlFriend;
    }

    public static class Builder{
        String name;
        int sex;
        int age;
        String address;
        boolean hasGirlFriend;
        int totalMoney;

        public Builder(){
            this.name="";
            this.sex=0;
            this.age=0;
            this.address="广东韶关";
            hasGirlFriend=false;
            this.totalMoney=100;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSex(int sex) {
            this.sex = sex;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setHasGirlFriend(boolean hasGirlFriend) {
            this.hasGirlFriend = hasGirlFriend;
            return this;
        }

        public Builder setTotalMoney(int totalMoney) {
            this.totalMoney = totalMoney;
            return this;
        }

        public XiaoMing build(){
            return new XiaoMing(this);
        }
    }
}
