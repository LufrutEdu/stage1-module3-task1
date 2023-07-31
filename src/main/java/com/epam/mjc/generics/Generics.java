package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public   List<Object> boxingMethod(Object name) {
        List<Object> firstList = new ArrayList<>();
        firstList.add(name);
        List<Object> secondList = new ArrayList<>();
        secondList.add(firstList);
        return new ArrayList<>(secondList);
    }

    public <T> Object genericMethod(T data) {
        return data;
    }

    public <T> void cloneMethod(List<? super T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
