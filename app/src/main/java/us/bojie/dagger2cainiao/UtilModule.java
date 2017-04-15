package us.bojie.dagger2cainiao;

import dagger.Module;
import dagger.Provides;
import us.bojie.dagger2cainiao.scope.ActivityScope;

/**
 * Created by bojiejiang on 4/15/17.
 */

@Module
public class UtilModule {

    @Provides
    @ActivityScope
    public Gson provideGson() {
        return new Gson();
    }
}
