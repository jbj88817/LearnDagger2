package us.bojie.dagger2cainiao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import us.bojie.dagger2cainiao.user.DaggerUserComponent;
import us.bojie.dagger2cainiao.user.UserManager;
import us.bojie.dagger2cainiao.user.UserModule;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    UserManager mUserManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.builder()
                .userModule(new UserModule())
                .appComponent(((MyApplication) getApplication()).getAppComponent())
                .build()
                .inject(this);

        mUserManager.register();

        startActivity(new Intent(this, LoginActivity.class));

    }
}
