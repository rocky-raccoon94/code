package java;

class Person {
    private int age;

    public Person(int age) {
        if (age < 0) {
            System.out.println("Age is not valid");
            this.age = 0;
        } else
            this.age = age;
    }

    public void amIOld() {
        String msg = "";
        if (this.age < 13)
            msg = "You are young.";
        else if (this.age < 18)
            msg = "You are a teenager.";
        else
            msg = "You are old.";
        System.out.println(msg);

    }

    public void yearPasses() {
        this.age++;
    }

}
