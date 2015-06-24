import java.util.Scanner;

import java.io.File;

import java.io.FileNotFoundException;

public class carInventory

{

/*

* Search algorithm

*

*/

   public static String searchTypeone(String value, String[] inray)

   {

     

      if(value.equalsIgnoreCase(inray[0].toLowerCase()))

      {

          for ( int i=0; i<inray.length; i++)

              System.out.print(inray[i].trim() + "\t\t");

      }

      return inray[0];

     

   }

   

   

   /*

    * Split line based on delimiter ";" and feed into array

    */

   public static String[] toSplit(String infile)

   {

      String [] rayman = infile.split(";");

      //for ( int i=0; i<rayman.length; i++)

      //{

          //System.out.print(rayman[i].trim() + "\t\t");

          //return rayman;

      //}

      return rayman;    

   }

   public static void main(String[] args)

   {

      try

      {

          Scanner inventoryFile = new Scanner(new File(args[0]));

      /*    int master_rows=inventoryFile.nextInt();

          int master_col=inventoryFile.nextInt();

         

          String master[][]= new String[master_col][master_rows];

          master[0][0]= "test";

          System.out.println(master[0][0]); */

          String ford = "ford";

          while (inventoryFile.hasNextLine())

          {

              String lineout= inventoryFile.nextLine();

              searchTypeone(ford,toSplit(lineout));

              System.out.println();

          }

      }

          catch(FileNotFoundException except)

          {

           System.out.println("Error: Inventory read failure. Error: " + except.getMessage());

           System.exit(-1);

         

          }

   

   

   

   

   

   

   }

}
