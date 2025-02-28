public class MathMagic {
    public static void main(String[] args) {
        int myNumber; //original number
        int stepOne;
        int stepTwo;
        int stepThree;
        int stepFour;
        int stepFive;
        int stepSix;
        myNumber= 1000;
        stepOne = myNumber*myNumber;
        stepTwo= stepOne + myNumber;
        stepThree = stepTwo/myNumber;
        stepFour = stepThree + 17;
        stepFive= stepFour-myNumber;
        stepSix = stepFive/6;
        System.out.println(stepSix);
    }
}
