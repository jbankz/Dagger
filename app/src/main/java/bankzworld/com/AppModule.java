package bankzworld.com;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final DaggerApplication application;

    public AppModule(DaggerApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context app) {
        return app.getSharedPreferences("my_pref_title", Context.MODE_PRIVATE);
    }

}
