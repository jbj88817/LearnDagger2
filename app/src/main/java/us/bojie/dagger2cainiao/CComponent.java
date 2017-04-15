package us.bojie.dagger2cainiao;

import dagger.Subcomponent;
import us.bojie.dagger2cainiao.scope.ActivityScope;

/**
 * Created by bojiejiang on 4/15/17.
 */

@ActivityScope
@Subcomponent(modules = UtilModule.class)
public interface CComponent {

    void inject(SubComponentActivity activity);
}
