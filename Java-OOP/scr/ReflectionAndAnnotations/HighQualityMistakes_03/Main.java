package HighQualityMistakes_03;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class clazz= Reflection.class;

        Field[] fields = clazz.getDeclaredFields();

        Arrays.stream(fields).
                filter(field -> !Modifier.isPrivate(field.getModifiers())).
                sorted(Comparator.comparing(Field::getName)).
                forEach(field -> System.out.printf("%s must be private!%n",field.getName()));

        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods).filter(method -> method.getName().startsWith("get")&&method.getParameterCount()==0).
                sorted(Comparator.comparing(Method::getName)).
                filter(method -> !Modifier.isPublic(method.getModifiers())).
                forEach(method -> System.out.printf("%s have to be public!%n",method.getName()));

        Arrays.stream(methods).filter(method -> method.getName().startsWith("set")&&method.getParameterCount()==1).
                sorted(Comparator.comparing(Method::getName)).
                filter(method -> !Modifier.isPrivate(method.getModifiers())).
                forEach(method -> System.out.printf("%s have to be private!%n",method.getName()));

    }
}
