package Lesson_1;

public class FirstLesson {

    public static void main (String[] args) {
        System.out.println("Hello from Console!!!! I'm Java");
        System.out.println("Test1");

        byte myVar = 50; //-128...+127 (1 byte)
        short myShortVar = 1270; //-32768..+32767 (2 bytes)
        int myInteger = 5345987; //-2.1billion..+2.1billion (4 bytes)
        long myLongVar = 3000000000L; //-2^63..+2^63 (8 bytes)

        System.out.println(myShortVar);
        //символы
        char myChar = 'h'; // (2 bytes)
        System.out.println(myChar);
        //булево
        boolean myBoolean = true; //false (1 byte)
        System.out.println(myBoolean);

        int a = 150;
        int b = 200;
        int result;

        result = a + b;
        a = a + 1;
        result = a + b;
        b = b + 1;
        result = a + b;
        a = a + 1;
        result = a + b;

        System.out.println("result = " + result);

    }

}
