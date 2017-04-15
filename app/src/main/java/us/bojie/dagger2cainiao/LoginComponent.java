package us.bojie.dagger2cainiao;

import dagger.Component;
import us.bojie.dagger2cainiao.scope.ActivityScope;
import us.bojie.dagger2cainiao.user.UserModule;

/**
 * Created by bojiejiang on 4/15/17.
 */

@ActivityScope
@Component(modules = UserModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}
