import static java.lang.Math.random;

class Location
{
    int x;
    int y;
}

public class Main
{
    public static void main(String[] args)
    {
        Location maxLocation = new Location();
        int maxValue = (int)-2e10;

        // Construct 2D array (matrix) and find the max
        int mat_width  = 2 + (int)(random() * 100) % 10;
        int mat_height = 2;
        int[][] mat = new int[mat_width][mat_height];

        // Populate and display
        populateMatrix(mat, mat_width, mat_height);
        printMatrix(mat, mat_width, mat_height);

        // Iterate through matrix and find location of max value
        for (int i = 0; i < mat_width; i++)
        {
            for (int j = 0; j < mat_height; j++)
            {
                if (mat[i][j] > maxValue)
                {
                    maxValue = mat[i][j];
                    maxLocation.x = i;
                    maxLocation.y = j;
                }
            }
        }

        System.out.println("Max: " + maxValue);
        System.out.println("Location: x = [" + maxLocation.x + "], y = [" + maxLocation.y + "]");
    }

    public static void populateMatrix(int[][] mat, int width, int height)
    {
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                mat[i][j] = (int)(random() * 100);
            }
        }
    }

    public static void printMatrix(int[][] mat, int width, int height)
    {
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
