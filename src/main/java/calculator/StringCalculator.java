package calculator;

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


            for(String s : arrout.toString().split("["+dili+"]"))
            {

                sum+= !s.isBlank() ? Integer.parseInt(s) : 0;
            }

        return sum;





    }

}