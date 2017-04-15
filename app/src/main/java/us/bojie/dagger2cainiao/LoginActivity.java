package us.bojie.dagger2cainiao;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import us.bojie.dagger2cainiao.user.UserManager;
import us.bojie.dagger2cainiao.user.UserModule;

/**
 * Created by bojiejiang on 4/14/17.
 */

public class LoginActivity extends AppCompatActivity {


    @Inject
    UserManager mUserManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerLoginComponent.builder()
                .userModule(new UserModule())
                .appComponent(((MyApplication) getApplication()).getAppComponent())
                .build()
                .inject(this);

        mUserManager.login();
    }
}
