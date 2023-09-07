public class Main {


//------testing
    public static void main(String[] args) {
        int result = add(1,2);
        System.out.println(result);

        int secondresult = add(2, 3, 4, 5);
        System.out.println(secondresult);

        String thirdresult = morningGreeting("Toby Fox");
        System.out.println(thirdresult);

        String fourthresult = afternoonGreeting("Mac Miller");
        System.out.println(fourthresult);

        String fithresult = triple("oohbaby");
        System.out.println(fithresult);

        double sixthresult = half(53);
        System.out.println(sixthresult);

        double seventhresult = roundPositiveValueToNearestInteger(8.49);
        System.out.println(seventhresult);

        double eighthresult = roundNegativeValueToNearestInteger(-9.49);
        System.out.println(eighthresult);

    }
//1. adding 2 things together)
    public static int add(int a, int b) {
        return a+b;

    }
//2.  adding 4 things together
    public static int add(int c, int d, int e, int f) {
        int cd = add(c,d);
        int cde = add(cd,e);
        int cdef = add(cde,f);
        return cdef;
    }

//3. morningGreeting

    public static String morningGreeting(String name) {
        String greeting = "早上好, " + name + "!";
        return greeting;
    }

//4. afternoonGreeting

    public static String afternoonGreeting(String secondname) {
        String secondgreeting = "下午好, "+ secondname + "!";
        return secondgreeting;
        }
//5. triple
    public static String triple(String word){
        String tripleword = word + word + word;
        return tripleword;
    }
//6. half
    public static double half(double givenNumber){
        double givenAnswer = givenNumber/2;
        return givenAnswer;
    }

//7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double givenNumberTwo){
        double givenHalfAnswerTwo = givenNumberTwo + 0.5;
        int givenAnswerTwo = (int) givenHalfAnswerTwo;
        return givenAnswerTwo;
    }

    public static double roundNegativeValueToNearestInteger(double givenNumberThree){
        double givenHalfAnswerThree = (givenNumberThree - 0.5);
        int givenAnswerThree = (int) givenHalfAnswerThree;
        return givenAnswerThree;
    }








    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger

 }
