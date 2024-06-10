package d30JavaPractice;

import static d30JavaPractice.C06_MethodCreation.*;

public class C06_MethodCreationRunner {
    public static void main(String[] args) {

      /*  int a = 10;
        int b = 5;
        int c = 2;

        calculator(a, b, c);

        System.out.println("__________________________________________");
        System.out.println("addition(a, b, c) = " + addition(a, b, c));
        System.out.println("subtraction(a, b, c) = " + subtraction(a, b, c));
        System.out.println("product(a, b, c) = " + product(a, b, c));
        System.out.println("avg(a, b, c) = " + avg(a, b, c));

        System.out.println("____________________________________________"); */
        C06_MethodCreation threeNumbers = new C06_MethodCreation();


        int totalValue =  threeNumbers.sum(10,5,2);

        int diff =  threeNumbers.difference(10,5,2);

        int multiplyThreeNumbers =  threeNumbers.multiply(10,5,2);

        double averageOfThem =  threeNumbers.average(10,5,2);

        System.out.println("totalValue = " + totalValue);
        System.out.println("diff = " + diff);
        System.out.println("multiplyThreeNumbers = " + multiplyThreeNumbers);
        System.out.println("averageOfThem = " + averageOfThem);



//        totalValue = 17
//        diff = 3
//        multiplyThreeNumbers = 100
//        averageOfThem = 5.666666666666667
    }

    }


