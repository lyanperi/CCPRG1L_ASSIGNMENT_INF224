public class assignment2 {
    public static void main(String[] args) throws Exception {

        System.out.print("WHILE LOOP\n\n");


        int count = 0;

         while (count !=3){

            System.out.println("Lyan Francez\n");
            count ++;

        }
        System.out.print("DO WHILE\n\n");

         int i = 0;
         do {System.out.println("Cataluña\n");

             i ++;
             
        } while (i != 4);

        System.out.print("FOR LOOP\n\n");

        for (int l = 0; l != 5;  l++) {
            System.out.println("Peregrino\n");
        }
        System.out.print("CHAR ARRAY\n\n");
        
        String[] myFirstName = {"L","Y","A","N","F","R","A","N","C","E","Z"};

        for (int counter = 0; counter < myFirstName.length; counter++) {

            System.out.println(myFirstName[counter]);

        }

        System.out.print("REVERSED NAME ARRAY\n\n");
        
        String[] myfirstname = {"N","A","Y","L"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
        }
         }
        } 
