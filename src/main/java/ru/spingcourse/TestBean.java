package ru.spingcourse;
//bean - очень похоже на объект
public class TestBean {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //    private TestBean(String name) {

//    }
}
