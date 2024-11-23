class Umesh {
    public int a;
    public int b;
    public int c;

    // Default constructor
    public Umesh() {
        System.out.println(" hii friends");
    }

    // Parameterized constructor for two numbers
    public Umesh(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("two numbers: " + a + ", " + b);
    }

    // Constructor chaining with three numbers
    public Umesh(int a, int b, int c) {
        this(a, b); // Calls the constructor with two parameters
        this.c = c;
        System.out.println("three numbers: " + a + ", " + b + ", " + c);
    }

    // Copy constructor
    public Umesh(Umesh other) {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
        System.out.println("Copy constructor: " + a + ", " + b + ", " + c);
    }
}

public class constructors {
    public static void main(String[] args) {
        Umesh um1 = new Umesh(); // Calls default constructor
        Umesh um2 = new Umesh(10, 20); // Calls parameterized constructor (two parameters)
        Umesh um3 = new Umesh(40, 3, 30); // Calls constructor chaining (three parameters)
        Umesh um4 = new Umesh(um2); // Calls copy constructor
    }    
}