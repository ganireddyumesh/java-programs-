

class cr{
    void shiva(){
        System.out.println("i am cyber shiva");
    }
}
class shashi extends cr {
    void webdev(){
        System.out.println("i am front end shashi");
    }
}

public class Inheritence{
    public static void main(String[] args) {
        shashi yogita =new shashi();
        yogita.webdev();
        yogita.shiva();

    }
}
