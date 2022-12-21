package com.annotation.exemple2;

import com.annotation.exemple1.JsonElement;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = new User();

       Class cls = user.getClass();
        Annotation annotation = cls.getAnnotation(Table.class);
        Table table = (Table) annotation;

        System.out.println(table.catalog());
        System.out.println(annotation);
        System.out.println(table.name());
        System.out.println(table.schema());


//        System.out.println(user.getClass().getAnnotations().length+"");
//        for (Field field : user.getClass().getDeclaredFields()){
//          //  if (method.isAnnotationPresent(Column.class)){
//            //    method.invoke(user);
//               // System.out.println(column.name());
//            //}
////            System.out.println(column.name());
//            Annotation annotation = cls.getAnnotation(Column.class);
//            Column column = (Column) annotation;
//            if (column != null)
//                System.out.println(column.name());
//        }
//            System.out.println(field.getName()+"  Field§§§§");
//            for (Annotation annotation1 : field.getAnnotations()){
//                //  if (method.isAnnotationPresent(Column.class)){
//                //    method.invoke(user);
//                // System.out.println(column.name());
//                //}
//                System.out.println(annotation1);
//            }
        }



//        System.out.println(column.name());
    }
