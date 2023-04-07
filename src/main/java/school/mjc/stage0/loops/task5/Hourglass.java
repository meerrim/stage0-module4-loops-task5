package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        if (height <= 0) {
            return;
        }
        for(int i=0; i < height/2; i++) {
            for(int j = height - i; j < height; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < height - 2*i; j++) {
                System.out.print("8");
            }
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        if (height % 2 == 0) {
            for(int i=1; i <= (height+1)/2; i++ )
            {
                for(int j = 0; j < height/2 - i; j++)
                    System.out.print(" ");
                for(int j = 1; j <= i*2; j++)
                    System.out.print("8");
                for(int j = i; j < height/2; j++)
                    System.out.print(" ");
                System.out.println();
            }
        } else {
            for(int i=0; i < (height+1)/2; i++ )
            {
                for(int j = 1; j <= height/2 - i; j++)
                    System.out.print(" ");
                for(int j = 0; j <= i*2; j++)
                    System.out.print("8");
                for(int j = i; j < height/2; j++)
                    System.out.print(" ");
                System.out.println();
            }
        }
    }
}
