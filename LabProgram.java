import java.util.Scanner;

public class LabProgram {

    /* Define your method here */
    public static int maxMagnitude(int userVal1, int userVal2, int userVal3)
    {
      // Using Math Abs to assign the value
        int maxInput1 = Math.abs(userVal1);
        int maxInput2 = Math.abs(userVal2);
        int maxInput3 = Math.abs(userVal3);

        int max = Math.max(Math.max(maxInput1, maxInput2), maxInput3);

        if(max == maxInput1)
        {
            return userVal1;
        } else if (max == maxInput2)
        {
            return userVal2;
        } else {
            return userVal3;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userVal1;
        int userVal2;
        int userVal3;

        userVal1 = scnr.nextInt();
        userVal2 = scnr.nextInt();
        userVal3 = scnr.nextInt();


        System.out.println(maxMagnitude(userVal1, userVal2, userVal3));
    }
}
