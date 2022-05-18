package com.reactnativeawesomemodule; // replace com.your-app-name with your app’s name
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;

import android.content.Intent;
import android.util.Log;

public class TestModule extends ReactContextBaseJavaModule {
  ReactApplicationContext context = getReactApplicationContext();

  TestModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  public String getName() {
    return "TestModule";
  }

  @ReactMethod
  public void NavigateMe(){
    Intent intent = new Intent(context, NavigationDrawerActivity.class);
    if(intent.resolveActivity(context.getPackageManager()) != null){
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      context.startActivity(intent);
    }
  }



}
