package us.bojie.dagger2cainiao.user;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by bojiejiang on 4/11/17.
 */

@Module
public class UserModule {


    @Provides
    public ApiService provideApiService(OkHttpClient client) {
        ApiService apiService = new ApiService(client);
        return apiService;
    }

    @Provides
    public UserManager provideUserManager(ApiService apiService) {
        return new UserManager(apiService);
    }
}
