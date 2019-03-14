import java.lang.reflect.*;

public class Reflect {
    MyClass test = new MyClass();
    Class <MyClass> myClass = MyClass.class;
    Field [] fields = myClass.getDeclaredFields();
    public void setFields() {
        try {
            for (Field field : fields) {
                field.setAccessible(true);
            }
            fields[0].setInt(test,1);
            fields[1].setBoolean(test,true);
            fields[2].set(test,"Hello World!");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public void getFileds() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int num = (int) myClass.getDeclaredMethod("getNum").invoke(test, (Object[])null);
        boolean is = (boolean )myClass.getDeclaredMethod("isIs").invoke(test, (Object[])null);
        String string = (String) myClass.getDeclaredMethod("getString").invoke(test, (Object[])null);
        System.out.println("int num = "+num+";");
        System.out.println("boolean is = "+is+";");
        System.out.println("String string = "+string+";");
    }
}
