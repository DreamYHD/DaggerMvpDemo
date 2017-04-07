package com.androidlab.daggermvpdemo.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Haodong on 2017/4/5.
 */

public class ActivityUtils {

   public static void addFragmentToActivity(FragmentManager manager, Fragment fragment,int framId){

       FragmentTransaction transaction=manager.beginTransaction();
       transaction.add(framId,fragment);
       transaction.commit();

   }

   public static void replaceFragmentToActivity(FragmentManager manager,Fragment fragment,int framId){
       FragmentTransaction transaction=manager.beginTransaction();
       transaction.replace(framId,fragment);
       transaction.commit();

   }




}
