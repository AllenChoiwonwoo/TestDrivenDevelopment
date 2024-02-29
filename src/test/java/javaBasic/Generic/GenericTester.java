package javaBasic.Generic;

import java.util.ArrayList;

public class GenericTester {
    public static void main(String[] args) {
        ClassName<Integer> className1 = new ClassName<>();

        className1.set(1);
        System.out.println(className1.get());
        System.out.println(className1.getClass());
        System.out.println(className1.get().getClass());

        System.out.println("====================================");
        LimitClassName<Integer> limitClassName = new LimitClassName<>();
        limitClassName.set(1);
        System.out.println(limitClassName.get());
        System.out.println(limitClassName.getClass());
        System.out.println(limitClassName.getClass().getName());
        System.out.println(limitClassName.get().getClass());
        System.out.println(limitClassName.get().getClass().getName());

//        LimitClassName<String> limitClassName1 = new LimitClassName<String>();

        System.out.println("====================================");

        ClassName<String> className2 = new ClassName<>();
        className2.set("1");
        System.out.println(className2.get());
        System.out.println(className2.getClass());
        System.out.println(className2.getClass().getName());
        System.out.println(className2.get().getClass());
        System.out.println(className2.get().getClass().getName());

        System.out.println("====================================");

        Man<Freelancer> freelancerMan = new Man<>(new Freelancer());
        Man<Student> sutdentMan = new Man<>(new Student());

        System.out.println(freelancerMan.getClass());
        System.out.println(freelancerMan.getJob().getClass());
        System.out.println(freelancerMan.getJob().getJobName());
        System.out.println(freelancerMan.getJob().getJobName().getClass());

//        ArrayList<Object> stringArrayList = new ArrayList<String>();
//        ArrayList<Object> ObjectArrayList = new ArrayList<Object>();




    }
}
