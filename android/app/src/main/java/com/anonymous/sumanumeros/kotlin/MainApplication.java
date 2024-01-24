package com.anonymous.sumanumeros.kotlin;

import android.app.Application;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.anonymous.sumanumeros.kotlin.SumaNumeros; // Asegúrate de importar la clase correcta
import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        // ...

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                new MainReactPackage(),
                new SumaNumeros() // Asegúrate de que esta línea esté correctamente configurada
            );
        }
    };

    // ...
}
