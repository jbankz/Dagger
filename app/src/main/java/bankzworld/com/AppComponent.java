package bankzworld.com;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerApplication daggerApplication);

    void inject(MainActivity mainActivity);
}
