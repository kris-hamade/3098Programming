package app;

public class Array {

    int[][] testArray;

    public void populateArray(int x,) {
        testArray = new int[x][10];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i][0] = i;

        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.println("testArray[" + i + "][0]" + testArray[i][0]);
        }

    }

    public void countx(int x) {

        for (int i = 0; i < x; i++) {
            if (i > 47) {
                break;
            }
            System.out.println("count x = " + i);
        }
    }

    public void county(int y) {
        int i = 0;

        while (y > i) {

            System.out.println("count y = " + i);
            i++;

        }

    }

    public void countz(int z) {
            int i = 50;

            do{
                System.out.println("count z = " + i);
                i++;
            }while(i < z);
        
        }
}