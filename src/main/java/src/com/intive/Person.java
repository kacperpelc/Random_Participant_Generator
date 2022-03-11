package src.com.intive;

public class Person {
    private String name;
    private boolean isAsked;

    public Person(String name) {
        this.name = name;
        this.isAsked = false;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setIsAsked(boolean isAsked) {
        this.isAsked = isAsked;
    }

    public String getName() {
        return this.name;
    }
    public boolean getIsAsked() {
        return this.isAsked;
    }
}