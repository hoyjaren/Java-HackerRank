package Enumarators;

public class Main {
    public static void main(String[] args) {
        AILevel level = AILevel.EASY;

        //Enums in Conditional Statement
        if(level == AILevel.EASY) System.out.println("For Babies");
        else if (level == AILevel.MEDIUM) System.out.println("For Kids");
        else if (level == AILevel.HARD) System.out.println("For Adults");

        //Enums in SwitchCase Statement
        switch (level){
            case EASY -> System.out.println("Too Easy");
            case MEDIUM -> System.out.println("Mid");
            case HARD -> System.out.println("Too Hard");
        }

        //Declaring Enums with Values
        USCurrency money = USCurrency.PENNY;
        USCurrency money2 = USCurrency.QUARTER;
        System.out.println(money.value + money2.value);

        //Array of Enums
        USCurrency coin[] = new USCurrency[3];
        coin[0] = USCurrency.DIME;
        coin[1] = USCurrency.PENNY;
        coin[2] = USCurrency.NICKLE;

        for (USCurrency coins: coin){
            System.out.println(coins.name);
        }
    }
}
