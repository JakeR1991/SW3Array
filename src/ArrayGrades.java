public class ArrayGrades {
    public static void main(String[] args) {
        // directly create 2d array
        int [][] grades = {
                {50, 55},
                {70, 80}
        };
        // access the element inside 2D array arrayName[r][c]
        System.out.println(grades[0][1]); // output 55
        System.out.println(grades[1][1]); // output 80
        // change the element of [1][1]
        grades[1][1] = 85;
        System.out.println(grades[1][1]);

        //access all elements through nested loop
        System.out.println("Your 2D array : ");
        for (int i=0; i< grades.length; i++){ //outer loop = rows
            for (int j=0; j<grades[i].length; j++) { // inner loop = columns
                System.out.print(grades[i][j]); //[0][0] -> [0][1] -> false
                System.out.print(" ");
            }System.out.println();
    }
}}
