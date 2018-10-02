public class ChenFaBiao {
    public static void main(String[] args){
        int row = 1;
        int col = 1;
        while(row < 9){
            row++;
            while(col < row) {
                col = 1;
                col++;
                System.out.print(row + "*"+ col + "=" + row * col);
            }

        }
    }
}
