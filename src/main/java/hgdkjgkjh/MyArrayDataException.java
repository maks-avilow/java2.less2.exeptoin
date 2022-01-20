package hgdkjgkjh;

public class MyArrayDataException extends RuntimeException {
int i;
int j;

    public MyArrayDataException(int i, int j) {
        super("Неправильные данные. У тебя есть строк" + i + "столбцов" + j );
        this.i = i;
        this.j = j;
    }
}
