package us.bojie.dagger2cainiao;

import android.app.Application;

/**
 * Created by bojiejiang on 4/15/17.
 */

public class MyApplication extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
