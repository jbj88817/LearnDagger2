package us.bojie.dagger2cainiao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by bojiejiang on 4/15/17.
 */

@Module
public class AppModule {

    @Singleton
    @Provides
    OkHttpClient provideOkHttp() {
        return new OkHttpClient().newBuilder().build();
    }

}
