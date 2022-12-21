package com.annotation.exemple1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;



public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("houssam","eddine", 21);
        System.out.println(user);

        Class cls = user.getClass();
//        Annotation annotation = cls.getAnnotation(JsonElement.class);
//        JsonElement jsonElement = (JsonElement) annotation;


        System.out.println(user.getClass().getAnnotations().length+"");
        for (Field field : user.getClass().getDeclaredFields()){

            field.setAccessible(true);
            Annotation annotation = cls.getAnnotation(JsonElement.class);
            JsonElement jsonElement = (JsonElement) annotation;
            if (field.isAnnotationPresent(JsonElement.class)) {
//                jsonElementsMap.put(getKey(field), (String) field.get(object));
                System.out.println(jsonElement.key());
            }


//            Annotation annotation = cls.getAnnotation(JsonElement.class);
//            JsonElement jsonElement = (JsonElement) annotation;
//            if (jsonElement != null) {
//                System.out.println(jsonElement.key());
//            }else{
//                System.out.println("waaaaaaah");
//        }
//            System.out.println(field.getName()+"  Field§§§§");
//            for (Annotation annotation1 : field.getAnnotations()){
//                //  if (method.isAnnotationPresent(Column.class)){
//                //    method.invoke(user);
//                // System.out.println(column.name());
//                //}
//                System.out.println(annotation1.toString());
//            }
    }


















//        Annotation annotation = cls.getAnnotation(JsonSerializable.class);
//        JsonSerializable jsonElement = (JsonSerializable) annotation;
//        System.out.println(jsonElement.val());

    }
}
