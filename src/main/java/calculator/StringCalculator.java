package calculator;

class StringCalculator {

    public int add(String input) {
        if(input.length() == 0)
            return 0;

        String[] arrS = input.split(",");
        String[] arrP = input.split("[,\n]");

        int sum = 0;
        for(String s : arrP)
        {
            sum+=Integer.parseInt(s);
        }
        return sum;


    }

}