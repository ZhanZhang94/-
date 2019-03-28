package com.onps.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 自写的一些String工具
 */
public class StringUtils {
    //不可实例化
    private StringUtils(){}
    /**
     * 判断是否为空或者为null
     * @param str
     * @return  如果是空或者null,则返回true;否则返回false
     */
    public final  static boolean isEmptyOrNull( String str){
        if( str == null || "".equals( str ) )
        {
            return true;
        }
        return false;
    }

    /**
     * 判断List是否为空或者为null
     * @param list
     * @return  如果是空或者null,则返回true;否则返回false
     */
    public final  static boolean listIsEmptyOrNull( List list){
        if( list == null || list.size()==0 )
        {
            return true;
        }
        return false;
    }


    /**
     * 获取UUID随机数
     *
     * @return 36位的UUID,带有-分割
     */
    public final static String getUUID36 ( )
    {
        return UUID.randomUUID().toString();
    }

    /**
     * 获取UUID随机数
     *
     * @return 32位的UUID,不带-分割
     */
    public final static String getUUID32 ( )
    {
        return getUUID36().replace( "-", "" );
    }

    /**
     * 数组转换为List
     *
     * @param objArray
     *          数组
     * @return List
     */
    public final static List<String> arryToList (String[] objArray )
    {
        List<String> objList = new ArrayList<String>();
        if ( null == objArray || 0 == objArray.length )
        {
            return objList;
        }
        for ( String obj : objArray )
        {
            objList.add( obj );
        }
        return objList;
    }

    /**
     * 判断字符串是否全为数字
     *
     * @param strSource 原始字符串
     * @return 是返回true，否则返回false
     */
    public final static boolean msIsNum(String strSource) {
        if ((strSource == ""))
            return false;

        for (int i = 0; i < strSource.length(); i++) {
            if (!Character.isDigit(strSource.charAt(i)))
                return false;
        }

        return true;
    }

    /**
     * 判断字符串是否全为数字(包括点)
     *
     * @param strSource 原始字符串
     * @return 是返回true，否则返回false
     */
    public final static boolean msIsNumeric(String strSource) {
        if ((strSource == ""))
            return false;

        for (int i = 0; i < strSource.length(); i++) {
            if (strSource.charAt(i) == ('.') || strSource.charAt(i) == (',')) {
                continue;
            } else if (!Character.isDigit(strSource.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
