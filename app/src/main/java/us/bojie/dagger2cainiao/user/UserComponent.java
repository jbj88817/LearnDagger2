package us.bojie.dagger2cainiao.user;

import dagger.Component;
import us.bojie.dagger2cainiao.AppComponent;
import us.bojie.dagger2cainiao.MainActivity;
import us.bojie.dagger2cainiao.scope.ActivityScope;

/**
 * Created by bojiejiang on 4/11/17.
 */

@ActivityScope
@Component(modules = {UserModule.class}, dependencies = AppComponent.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
