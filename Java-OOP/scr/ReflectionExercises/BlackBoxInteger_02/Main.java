import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Class<BlackBoxInt> clazz = BlackBoxInt.class;

        Constructor <BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();
        Field innerValue = clazz.getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        while(!input.equals("END")){
            String commandName=input.split("_")[0];
            int number=Integer.parseInt(input.split("_")[1]);

            switch (commandName){

                case "add":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "add");
                    break;

                case "subtract":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "subtract");
                    break;

                case "divide":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "divide");
                    break;

                case "multiply":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "multiply");
                    break;

                case "rightShift":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "rightShift");
                    break;

                case "leftShift":
                    executeCommand(clazz, blackBoxInt, innerValue, number, "leftShift");
                    break;
            }
            input=scanner.nextLine();
        }


    }

    private static void executeCommand(Class<BlackBoxInt> clazz, BlackBoxInt blackBoxInt, Field innerValue, int number, String command) throws InvocationTargetException, IllegalAccessException {
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        Method currentMethod=null;
        for (Method method:methods) {
            if(method.getName().equals(command)){
                currentMethod=method;
                break;
            }

        }
        currentMethod.setAccessible(true);
        currentMethod.invoke(blackBoxInt,number);
        innerValue.setAccessible(true);
        System.out.println(innerValue.get(blackBoxInt));
    }
}
