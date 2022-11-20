import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ALGORITHM TITLE: THE DAVID QUARTER SEARCH

        //PRECONDITIONS
        //AUTOMATICALLY SORTED MIN TO MAX EVEN IF THE INSERTED NUMBERS ARE NOT IN ORDER
        //USER MUST REPLACE THE VALUE BELOW

        //MECHANICS
        //STEP 1: THE USER HAS THE OPTION TO EDIT THE 'given[]' ARRAY WHICH IS SORTED MIN TO MAX AUTOMATICALLY
        //STEP 2: THE USER IS REQUIRED TO INPUT/CHANGE THE VALUE OF THE 'quarterSearch' FUNCTION INDICATED BELOW
        //STEP 3: THE PROGRAM WILL DIVIDE THE TOTAL ARRAY INTO QUARTERS THESE DIVISIONS WILL
        //          BE THE RANGE FOR THE LOWER AND HIGHER LIMIT
        //STEP 4: ONCE THE 4 QUARTERS ARE ESTABLISHED. THE PROGRAM WILL FIRST PINPOINT THE PROPER QUARTER WHERE
        //          THE USER INPUT VALUE IS LOCATED
        //STEP 5: FROM THEN, THE PROGRAM WILL SCAN EACH OF THE ENTRIES IN THAT QUARTER UNTIL THE MATCH
        //          IS FOUND. OTHERWISE, IT WILL DISPLAY -1 IF THE MATCH COULD NOT BE FOUND.

        // ==================================[OPTIONAL]=================================================
        //INSERT YOUR OWN ENTRY IN ANY ORDER
        int given[] = {60, 33, 12, 64, 17, 105, -53, 174, 30};
        Arrays.sort(given);
        // ===============================[END OF OPTIONAL]=============================================


        // ==================================DON'T TOUCH==============================================
        //PRINTED NEW ARRAY
        System.out.println("SORTED ARRAY: " + "\n");
        for (int i = 0; i < given.length; i++)
        {
            System.out.print(given[i] + " ");
        }
        System.out.println("\n");
        // ===============================END OF DON'T TOUCH==========================================

        // ==================================[REQUIRED]==============================================
        //EDIT THE VALUE
        System.out.println(quarterSearch(given, 30));
        // ==============================[END OF REQUIRED]===========================================
    }

    public static int quarterSearch(int[] input, int value)
    {
        int base = 0;
        int firstQuarter = (input.length - 1)/4;
        int secondQuarter = (input.length - 1)/2;
        int thirdQuarter = (input.length - 1) * (3/4);
        int fourthQuarter = input.length - 1;

        if (input[thirdQuarter] < value && input[fourthQuarter] >= value) //target is in 4th Quarter
        {
            for (int i = thirdQuarter; i <= fourthQuarter; i++)
            {
                if (input[i] == value)
                {
                    return i;
                }
            }
        }
        else if (input[thirdQuarter] >= value && input[secondQuarter] < value) //target is in 3rd Quarter
        {
            for (int i = secondQuarter; i <= thirdQuarter; i++)
            {
                if (input[i] == value)
                {
                    return i;
                }
            }
        }
        else if (input[secondQuarter] >= value && input[firstQuarter] < value) //target is in 2nd Quarter
        {
            for (int i = firstQuarter; i <= secondQuarter; i++)
            {
                if (input[i] == value)
                {
                    return i;
                }
            }
        }
        else if (input[firstQuarter] >= value && input[base] <= value) //target is in 1st Quarter
        {
            for (int i = base; i <= firstQuarter; i++)
            {
                if (input[i] == value)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}