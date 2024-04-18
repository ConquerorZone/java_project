public class Star__pattern {
    public static void main(String[] args) {
//        int i ;
//        int Star1 = 10;
//        int Star2 = 3;
//        int j ;
//        for (j = 0 ;  j < Star1 ; ){    //this the code to print Pyramid pattern in reverse.
//            System.out.print(" ");
//        for (i = 0;  i < Star1; i++ ){
//            System.out.print("*");
//        }
//            System.out.print("\n");
//        Star1--;
//        }

//        for (i = 0 ; i < Star1 ; ){      //this the code to print Pyramid pattern
//            System.out.print(" ");
//            for ( j = 10 ; j > Star1; j--  )
//                System.out.print("*");
//            System.out.print("\n");
//            Star1--;
//

//        for ( i = 0; i < Star2; i++) {       //This is the code to print american flag
//            for (j = 1; j < Star1; j++){
//                System.out.print(" *");
//            }
//            for (int k = 2; k < Star1; k++) {
//                System.out.print(" -");
//            }
//            System.out.print("\n");
//        }
//        for (int a = 0; a < Star2 ; a++) {
//            for (int b = 3; b < 20; b++) {
//                System.out.print(" -");
//            }
//
//            System.out.print("\n");

//        }





            for (int i = 1; i < 5; i++) {
                int k = 0;
                int j = 0;
                if (i== 3){
                    System.out.print("J");
                    k = 1;
                }
                if (i==4){
                    System.out.print(" J");
                    k=3;
                }
                while ( k < 3) {
                     k++;
                    System.out.print(" ");
                }
                System.out.print("J");
                if (i==2){
                    j=1;
                }
                System.out.print(" ");
                for ( ; j < 3; j++) {
                    System.out.print("  ");
                }
                if (i == 1) {
                    System.out.print("A");

                }


                if (i==2){

                    System.out.println("A   A");
                }
                for ( j = 0; j < 3; j++) {
                    System.out.print("  ");
                }

                System.out.print("v");
                for ( j = 0; j < 3; j++) {
                    System.out.print("  ");
                }
                System.out.println("A");



            }

        }

    }

