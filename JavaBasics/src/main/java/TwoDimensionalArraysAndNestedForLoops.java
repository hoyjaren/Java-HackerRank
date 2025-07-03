public class TwoDimensionalArraysAndNestedForLoops {
    public static void main(String[] args) {

        //Declare with values
        String users[][] = {
                {"David", "david123"},
                {"Jaren", "jaren123"},
                {"Kyle", "kyle123"},
                {"Ronald", "ronald123"}
        };

        //Declare without values
        int numbers[][] = new int[4][3];

        users[0][0] = "Chawon";
        System.out.println(users[0][0]);

        //Nested For Loops
        for(int i = 0; i < 5; i++){
            for (int x = 0; x < 5; x++){
                System.out.println(i + " : " + x);
            }
            System.out.println();
        }

        for(int j = 1; j <= 5; j++){
            for(int y = 1; y <= j; y++){
                System.out.print("* ");
            }
            System.out.println();
        }

        String names[][] = {
                {"David", "david123"},
                {"Jaren", "jaren123"},
                {"Kyle", "kyle34", "dandan"},
                {"ronald", "ronald123", "nald", "22"}
        };


        for(int row = 0; row < names.length; row++){
            for (int col = 0; col < names[row].length; col++){
                System.out.println(names[row][col]);
            }
            System.out.println();
        }


        //Nested For Each Loop
        for (String name[]: names ){
            for (String info: name){
                System.out.println(info);
            }
            System.out.println();
        }
    }
}
