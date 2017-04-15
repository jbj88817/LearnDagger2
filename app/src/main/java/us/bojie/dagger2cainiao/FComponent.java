package us.bojie.dagger2cainiao;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bojiejiang on 4/15/17.
 */

@Singleton
@Component(modules = AppModule.class)
public interface FComponent {

    CComponent getchildComponent();
}
