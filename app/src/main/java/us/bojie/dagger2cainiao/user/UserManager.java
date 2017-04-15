package us.bojie.dagger2cainiao.user;

import android.util.Log;

/**
 * Created by bojiejiang on 4/11/17.
 */

public class UserManager {

    private ApiService mApiService;
//    private UserStore mUserStore;

    private static final String TAG = UserManager.class.getSimpleName();

    public UserManager(ApiService apiService) {
        Log.d(TAG, "UserManager: " + apiService );
        mApiService = apiService;
//        mUserStore = store;
    }

    public void register() {
        Log.d(TAG, "register: ");
        mApiService.register();
    }
    
    public void login() {
        Log.d(TAG, "login: ");
        mApiService.login();
    }

}
