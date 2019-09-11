public class Loops {

    public static void main(String[] args) {

        // simple for loop
        int i = 0, runs = 0;
        for (i = 10; i < 23; i = i + 3) {
            if (i % 2 == 0) {
                System.out.println("Hey");
            }
            runs++;
        }
        System.out.println("i: " + i + " runs: " + runs);





            //while loop
            boolean expression = true;
            int counter = 0;
            while (expression) //pretest loop
            {
                int integerInsideWhile = 10;
                counter++;
            /*
            if(counter == 5)
            {
                expression = false; //exit strategy
            }
            */

                if (counter == 5) //explicitely leave the loop
                {
                    break;
                }
            }
            //System.out.println(integerInsideWhile); it's no longer on the stack
            System.out.println("we are done with the loop and counter is: " + counter);


            //do while loop - posttest loop
            int targetRate = 90;
            do {
                System.out.println("The target rate is 100");
            }
            while (targetRate == 100);

            int j = 0;
            while (j >= 0) {
                j += 2;

                if (j == 5) {
                    break;
                }
            }
            System.out.println(j);



    }
}
