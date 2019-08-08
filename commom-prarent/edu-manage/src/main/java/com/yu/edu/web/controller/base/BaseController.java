package com.yu.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseController<T>{

    public static String Edit_page;
    public static String info_page;
    public static String manage_page;

    public static final String Edit="/edit";
    public static final String info="/info";
    public static final String manage="/manage";


    public BaseController(){
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        System.out.println("========="+type);
        Class<T> moc = (Class) type.getActualTypeArguments()[0];

        System.out.println(moc);
        String mname = moc.getSimpleName();
        System.out.println(mname);

        Edit_page="/"+mname+Edit;
        info_page="/"+mname+info;
        manage_page="/"+mname+manage;
    }
}
