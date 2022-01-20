package hgdkjgkjh;

public class MyArraySizeException extends RuntimeException {
int row;
int column;

    public MyArraySizeException(int row, int column) {
        super("Неправильные данные. Строк и столбцов может быть только 4");
        this.row = row;
        this.column = column;
    }

    public MyArraySizeException() {

    }
}
