package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

    public int add(String input) {
        if(input.length() == 0)
            return 0;

        StringBuilder dili = new StringBuilder("\\n,");
        StringBuilder arrout = new StringBuilder();

        // checking input filted
        if ( input.startsWith("//") ){
            dili.append(input, input.indexOf("//")+2, input.indexOf("\n")); // String between // and \n
            arrout.append( input.substring(input.indexOf("\n")) );
        }else{
            arrout.append(input);
        }
        int sum = 0;
        boolean mark = false;
        List<String> negativeS = new ArrayList<>();
        for(String s : arrout.toString().split("["+dili+"]"))
        {

            if(!s.isBlank() && Integer.parseInt(s) < 0)
            {
                mark = true;
                negativeS.add(s + " ");
            }
            sum+= !s.isBlank() ? Integer.parseInt(s) : 0;
        }

        if(mark)
        {
            throw new IllegalArgumentException("negatives not allowed"+ negativeS);
        }
        return sum;






    }

}