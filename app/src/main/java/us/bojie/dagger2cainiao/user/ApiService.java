package us.bojie.dagger2cainiao.user;

import android.util.Log;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/**
 * Created by bojiejiang on 4/11/17.
 */

public class ApiService {
    private static final String TAG = ApiService.class.getSimpleName();

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient mOkHttpClient;

    public ApiService(OkHttpClient client) {
        Log.d(TAG, "ApiService: constructor" );
        mOkHttpClient = client;
    }

    public void register() {
        Log.d(TAG, "register: -----yunduan " + mOkHttpClient);
    }

    public void login() {
        Log.d(TAG, "login: " + mOkHttpClient);
    }
}
