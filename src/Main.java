import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Reflect reflect = new Reflect();
        reflect.setFields();
        reflect.getFileds();

    }
}
