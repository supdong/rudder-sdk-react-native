package com.rudderstack.integration.reactnative.appcenter;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.rudderstack.android.integration.appcenter.AppcenterIntegrationFactory;
import com.rudderstack.react.android.RNRudderAnalytics;

public class RudderIntegrationAppcenterReactNativeModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RudderIntegrationAppcenterReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RudderIntegrationAppcenterReactNative";
    }

    @ReactMethod
    public void setup() {
        RNRudderAnalytics.addIntegration(AppcenterIntegrationFactory.FACTORY);
    }
}
