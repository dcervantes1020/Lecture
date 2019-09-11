public class OperatorsCont {

        public static void main(String[] args) {



            int x = 10;

            //conditional operator:  ?
            x = (x > 0) ? 100 : (x > -10) ? (x > -3) ? -2 : 6 : -5;

            x += (x > 0) ? 100 : -100;



            //logical operators
            boolean a = false;
            boolean b = false;
            boolean c = true;
            boolean d = true;

            boolean result = !(((!a && b) || !(c || d)) && (!(a || d)) ^ !(b ^ !a));
            System.out.println("The result is: " + result);

            boolean newResult = a | c; //bitwise operator
            System.out.println("The new result is: " + newResult);

            int y = 113;
            int z = 211;
            int intResult = y | z;
            System.out.println("The new intResult is: " + intResult);

            //oddity of string
            String s1 = "hi";
            String s2 = "Hi";
            String s3 = new String("Hi");
            boolean stringsAreTheSame = s1 == s2;
            boolean sTwoAndsThreeAreTheSame = s2 == s3;

            System.out.println("s1 is the same as s2: " + stringsAreTheSame);
            System.out.println("s2 is the same as s3: " + sTwoAndsThreeAreTheSame);

            System.out.println("My strings are: " + s1 + " " + s2 + " " + s3);

            boolean correctComparison = s1.equals(s3);
            System.out.println("s1 is the same as s3: " + correctComparison);

            boolean comparisonWithIgnoredCase = s1.equalsIgnoreCase(s3);

            boolean comparisonWithDetour = s1.toLowerCase().equals(s3.toLowerCase());

            //postfix and prefix operator
            int w = 0;
            w += 1;
            w = w + 1;
            w++; //postfix operator
            ++w; //prefix operator

            w = 0;
            System.out.println("the value of w is: " + w++);
            System.out.println("the value of w now is: " + w);

           //applies also to -
            --w;
            w--;

            w--;
            System.out.println("the value of w is: " + w);

            //w++++ //not allowed



        }

}
