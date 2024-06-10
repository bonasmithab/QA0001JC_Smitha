package d30JavaPractice;

public class C06_MethodCreation {

    /* public static void calculator(int a, int b, int c) {
        int sum = a + b + c;
        int difference = a - b - c;
        int multiply = a * b * c;
        int average = sum / 3;

        System.out.println("sum : " + sum);
        System.out.println("difference = " + difference);
        System.out.println("multiply = " + multiply);
        System.out.println("average = " + average);

    }

    public static int addition(int a, int b, int c) {
        int add = a + b + c;
        return add;
    }

    public static int subtraction(int a, int b, int c) {
        int subtract = a - b - c;
        return subtract;
    }

    public static int product(int a, int b, int c) {
        int mul = a * b * c;
        return mul;
    }

    public static int avg(int a, int b, int c) {
        int avg1 = (a + b + c) / 3;
        return avg1; */
    public int sum(int a ,int b, int c){

//        int total = a+b+c;

        return a+b+c;
//        return total;
    }




    //Method to calculate the difference of three numbers

    public int difference(int a, int b, int c){


        return a-b-c;
    }





    //Method to calculate the multiply of three numbers

    public  int multiply(int a, int b, int c){


        return a*b*c;
    }






    // Method to calculate the average of three numbers

    public double average(int a, int b, int c){



        return (a+b+c)/3.0;
    }


}