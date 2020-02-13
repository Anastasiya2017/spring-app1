package ru.spingcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//в классе тестируем работу spring фреймворка
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
