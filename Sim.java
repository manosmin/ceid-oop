import java.util.*;

public class Sim
{
    public static void main(String[] args) 
    {
        /* Δημιουργία αντικειμένων */
        Random q = new Random();
        int rNum1 = q.nextInt(21);
        while (rNum1 == 0)  {
            rNum1 = q.nextInt(21);
        }

        Animals[][] map = new Animals[20][20];
        for (int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                map[i][j] = null;
            }
        }

        Random rGen = new Random();
        for(int i = 0; i < rNum1; i++)
        {
            int rNum2=q.nextInt(4);

            if (rNum2 == 0)
            {
                Lion Simba = new Lion();
                int randomInt1 = rGen.nextInt(20);
                int randomInt2 = rGen.nextInt(20);
                while (map[randomInt1][randomInt2] != null) {
                    randomInt1 = rGen.nextInt(20);
                    randomInt2 = rGen.nextInt(20);
                }                
                map[randomInt1][randomInt2] = Simba;
                Simba.setAttributes();                
            }
            else if (rNum2 == 1)
            {
                Pig Pumba = new Pig();
                int randomInt1 = rGen.nextInt(20);
                int randomInt2 = rGen.nextInt(20);
                while (map[randomInt1][randomInt2] != null) {
                    randomInt1 = rGen.nextInt(20);
                    randomInt2 = rGen.nextInt(20);
                }                
                map[randomInt1][randomInt2] = Pumba;
                Pumba.setAttributes();
            }
            else if (rNum2 == 2)
            {
                Dinosaur Orestis = new Dinosaur();
                int randomInt1 = rGen.nextInt(20);
                int randomInt2 = rGen.nextInt(20);
                while (map[randomInt1][randomInt2] != null) {
                    randomInt1 = rGen.nextInt(20);
                    randomInt2 = rGen.nextInt(20);
                }                
                map[randomInt1][randomInt2] = Orestis;
                Orestis.setAttributes();
            }
            else 
            {
                Zebra Koula = new Zebra();
                int randomInt1 = rGen.nextInt(20);
                int randomInt2 = rGen.nextInt(20);
                while (map[randomInt1][randomInt2] != null) {
                    randomInt1 = rGen.nextInt(20);
                    randomInt2 = rGen.nextInt(20);
                }                
                map[randomInt1][randomInt2] = Koula;
                Koula.setAttributes();
            }
        }

        /* Δημιουργία πίνακα boolean με τυχαίες τιμές true/false */
        Random rBool = new Random();
        boolean [][] plants = new boolean[20][20];
        for(int i = 0; i < 20; i++)
        {
            for (int j = 0; j < 20; j++)
            {
                plants[i][j] = rBool.nextBoolean();
            }
        }

        /* Προσομοίωση */
        int round = 1;
        int rHor=0, rVer=0;
        while (round < 11)
        {           
            /* Κίνηση ζώων */
            for (int w = 0; w < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (map[w][z] != null)
                    {
                        if (map[w][z].pace == 4)
                        {
                            do {
                                Random rMove1 = new Random();
                                Random rMove2 = new Random();
                                int Low = -4; 
                                int High = 4;
                                rHor = rMove1.nextInt(High - Low) + Low;
                                rVer = rMove2.nextInt(High - Low) + Low;
                                while ((rHor+w>19)||(rHor+w<0)){
                                    rHor = rMove1.nextInt(High - Low) + Low;
                                }
                                while ((rVer+z>19)||(rVer+z<0)){
                                    rVer = rMove2.nextInt(High - Low) + Low;
                                }
                            }while (map[rHor+w][rVer+z] != null);
                            if(rHor+w != w && rVer+z != z){    
                                map[rHor+w][rVer+z] = map[w][z];
                                map[w][z] = null;
                            }
                        }
                        else if (map[w][z].pace == 3)
                        {

                            do {
                                Random rMove1 = new Random();
                                Random rMove2 = new Random();
                                int Low = -3; 
                                int High = 3;
                                rHor = rMove1.nextInt(High - Low) + Low;
                                rVer = rMove2.nextInt(High - Low) + Low;
                                while ((rHor+w>19)||(rHor+w<0)){
                                    rHor = rMove1.nextInt(High - Low) + Low;
                                }
                                while ((rVer+z>19)||(rVer+z<0)){
                                    rVer = rMove2.nextInt(High - Low) + Low;
                                }
                            }while (map[rHor+w][rVer+z] != null);
                            if(rHor+w != w && rVer+z != z){    
                                map[rHor+w][rVer+z] = map[w][z];
                                map[w][z] = null;
                            }
                        }
                        else if (map[w][z].pace == 2)
                        {

                            do {
                                Random rMove1 = new Random();
                                Random rMove2 = new Random();
                                int Low = -2; 
                                int High = 2;
                                rHor = rMove1.nextInt(High - Low) + Low;
                                rVer = rMove2.nextInt(High - Low) + Low;
                                while ((rHor+w>19)||(rHor+w<0)){
                                    rHor = rMove1.nextInt(High - Low) + Low;
                                }
                                while ((rVer+z>19)||(rVer+z<0)){
                                    rVer = rMove2.nextInt(High - Low) + Low;
                                }
                            }while (map[rHor+w][rVer+z] != null);
                            if(rHor+w != w && rVer+z != z){    
                                map[rHor+w][rVer+z] = map[w][z];
                                map[w][z] = null;
                            }
                        }
                        else 
                        {

                            do {
                                Random rMove1 = new Random();
                                Random rMove2 = new Random();
                                int Low = -1; 
                                int High = 1;
                                rHor = rMove1.nextInt(High - Low) + Low;
                                rVer = rMove2.nextInt(High - Low) + Low;
                                while ((rHor+w>19)||(rHor+w<0)){
                                    rHor = rMove1.nextInt(High - Low) + Low;
                                }
                                while ((rVer+z>19)||(rVer+z<0)){
                                    rVer = rMove2.nextInt(High - Low) + Low;
                                }
                            }while (map[rHor+w][rVer+z] != null);
                            if(rHor+w != w && rVer+z != z){    
                                map[rHor+w][rVer+z] = map[w][z];
                                map[w][z] = null;
                            }
                        }
                    }

                }
            }

            /* Τα φυτοφάγα τρώνε σε κάθε γύρο αν στη θέση που βρίσκονται υπάρχει κάποιο φυτό
            και αν δεν φάνε για stamina γύρους πεθαίνουν*/
            for (int w = 0; w < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (map[w][z] != null)
                    {
                        if (map[w][z].pace == 2)
                        {
                            if (plants[w][z] == true )
                            {
                                map[w][z].stamina = 2;
                                plants[w][z] = !plants[w][z];
                            }

                        }
                        else if (map[w][z].pace == 1)
                        {
                            if (plants[w][z] == true )
                            {
                                map[w][z].stamina = 1;
                                plants[w][z] = !plants[w][z];
                            }

                        }
                    }
                }
            }
            /* Τα σαρκοφάγα τρώνε σε κάθε γύρο αν σε μία γειτονική θέση υπάρχει φυτοφάγο ζώο 
            και αν δε φάνε για stamina γύρους πεθαίνουν */
            for (int w = 0; w < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (map[w][z] != null)
                    {
                        if(map[w][z].pace == 4)
                        {
                            try
                            {
                                for (int row = -1; row <= 1; row++)
                                {
                                    for (int col = -1; col <= 1; col++)
                                    {
                                        if (map[w+row][z+col] != null)
                                        {
                                            if(map[w+row][z+col].pace == 2 || map[w+row][z+col].pace == 1)
                                            {
                                                map[w+row][z+col] = null;
                                                map[w][z].stamina = 4;
                                            }
                                        }
                                    }                            
                                }
                            }
                            catch ( ArrayIndexOutOfBoundsException e )
                            {
                            }
                        }
                        else if(map[w][z].pace == 3)
                        {
                            try
                            {
                                for (int row = -1; row <= 1; row++)
                                {
                                    for (int col = -1; col <= 1; col++)
                                    {
                                        if (map[w+row][z+col] != null)
                                        {
                                            if(map[w+row][z+col].pace == 2 || map[w+row][z+col].pace == 1)
                                            {
                                                map[w+row][z+col] = null;
                                                map[w][z].stamina = 3;
                                            }
                                        }
                                    }                            
                                }
                            }
                            catch ( ArrayIndexOutOfBoundsException e )
                            {
                            }
                        }
                    }
                }
            }
            /* Πώς πεθαίνουν τα ζώα */
            for (int i=0; i<20; i++)
            {
                for (int j=0; j<20; j++)
                {
                    if (map[i][j]!=null)
                    {
                        map[i][j].stamina--;
                        if (map[i][j].stamina==0)
                        {
                            map[i][j]=null;
                        }

                    }
                }
            }

            for (int i=0; i<20; i++)
            {
                for (int j=0; j<20; j++)
                {
                    if (map[i][j]!=null)
                    {
                        if (map[i][j].pace == 4)
                        {
                            map[i][j].reprod++;
                            if (map[i][j].reprod == 10)
                            {
                                try
                                {
                                    for (int row = -1; row <= 1; row++)
                                    {
                                        for (int col = -1; col <= 1; col++)
                                        {
                                            if (map[i+row][j+col] == null)
                                            {
                                                Lion Simba = new Lion();
                                                map[i+row][j+col] = Simba;
                                                Simba.setAttributes();
                                                map[i][j].reprod = 0;
                                            }
                                        }
                                    }
                                }
                                catch ( ArrayIndexOutOfBoundsException e )
                                {
                                }
                            }
                        }
                        else if (map[i][j].pace == 3)
                        {
                            map[i][j].reprod++;
                            if (map[i][j].reprod == 8)
                            {
                                try
                                {
                                    for (int row = -1; row <= 1; row++)
                                    {
                                        for (int col = -1; col <= 1; col++)
                                        {
                                            if (map[i+row][j+col] == null)
                                            {
                                                Pig Pumba = new Pig();
                                                map[i+row][j+col] = Pumba;
                                                Pumba.setAttributes();
                                                map[i][j].reprod = 0;
                                            }
                                        }
                                    }
                                }
                                catch ( ArrayIndexOutOfBoundsException e )
                                {
                                }
                            }
                        }
                        else if (map[i][j].pace == 2)
                        {
                            map[i][j].reprod++;
                            if (map[i][j].reprod == 7)
                            {
                                try
                                {
                                    for (int row = -1; row <= 1; row++)
                                    {
                                        for (int col = -1; col <= 1; col++)
                                        {
                                            if (map[i+row][j+col] == null)
                                            {
                                                Dinosaur Orestis = new Dinosaur();
                                                map[i+row][j+col] = Orestis;
                                                Orestis.setAttributes();
                                                map[i][j].reprod = 0;
                                            }
                                        }
                                    }
                                }
                                catch ( ArrayIndexOutOfBoundsException e )
                                {
                                }
                            }
                        }
                        else if (map[i][j].pace == 1)
                        {
                            map[i][j].reprod++;
                            if (map[i][j].reprod == 4)
                            {
                                try
                                {
                                    for (int row = -1; row <= 1; row++)
                                    {
                                        for (int col = -1; col <= 1; col++)
                                        {
                                            if (map[i+row][j+col] == null)
                                            {
                                                Zebra Koula = new Zebra();
                                                map[i+row][j+col] = Koula;
                                                Koula.setAttributes();
                                                map[i][j].reprod = 0;
                                            }
                                        }
                                    }
                                }
                                catch ( ArrayIndexOutOfBoundsException e )
                                {
                                }
                            }
                        }
                    }
                }
            }

            /* Γύρος προσομοίωσης */
            System.out.println("Round " + round);
            System.out.println();

            /* Αναπαράσταση πίνακα ζώων */
            for(int i = 0; i < 20; i++)
            {
                for (int j = 0; j < 20; j++)
                {
                    if (map[i][j] != null)
                    {
                        if (map[i][j].pace == 4)
                        {
                            System.out.print("!!!!" + "  ");
                        }
                        else if (map[i][j].pace == 3)
                        {
                            System.out.print("@@@@" + "  ");
                        }
                        else if (map[i][j].pace == 2)
                        {
                            System.out.print("####" + "  ");
                        }
                        else 
                        {
                            System.out.print("$$$$" + "  ");
                        }
                    }                
                    else
                    {
                        System.out.print(map[i][j] + "  ");
                    }    
                }     
                System.out.println();
            }    
            System.out.println();

            /* Ποσοστό φυτών στον κόσμο */
            int numpl = 0;
            for (int w = 0; w  < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (plants[w][z] == true)
                    {
                        numpl = numpl + 1;
                    }
                }
            }
            System.out.println("Plants % = " + numpl * 0.1);
            System.out.println();
            /* Πλήθος σαρκοφάγων στον κόσμο */
            int carnis = 0;
            for (int w = 0; w  < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (map[w][z] != null)
                    {
                    if (map[w][z].pace == 4 || map[w][z].pace == 3)
                    {
                        carnis = carnis + 1;
                    }
                }
            }
            }
            System.out.println("Carnivores = " + carnis );
            System.out.println();
            /* Πλήθος φυτοφάγων στον κόσμο */
            int herbis = 0;
            for (int w = 0; w  < 20; w++)
            {
                for (int z = 0; z < 20; z++)
                {
                    if (map[w][z] != null)
                    {
                    if (map[w][z].pace == 2 || map[w][z].pace == 1)
                    {
                        herbis = herbis + 1;
                    }
                }
            }
            }
            System.out.println("Herbivores = " + herbis );
            System.out.println();
            /* Έλεγχος συνθηκών για τερματισμό προγράμματος*/
            if (numpl == 0)
            {
                round = 100;
                System.out.println("Simulation stopped. Lack of plants.");
            }
            else if (carnis == 0)
            {
                round = 100;
                System.out.println("Simulation stopped. Lack of carnivores.");
            }
            else {
                /* Ερώτηση στο χρήστη αν θέλει να συνεχίσει */
                System.out.println("Progress to next round?");
                Scanner in = new Scanner(System.in);
                String answer = in.nextLine();            
                if (answer.equals("*"))
                {
                    round= 100;
                    System.out.print("You stopped simulation");
                }            
            }
            round++;

        }

    }
}

