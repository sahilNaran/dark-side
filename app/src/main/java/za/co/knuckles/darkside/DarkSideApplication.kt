package za.co.knuckles.darkside

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class DarkSideApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        MODE_NIGHT_NO. Always use the day (light) theme.
//        MODE_NIGHT_YES. Always use the night (dark) theme.
//        MODE_NIGHT_FOLLOW_SYSTEM (default). This setting follows the system’s setting, which on Android Pie and above is a system setting (more on this below).
//        MODE_NIGHT_AUTO_BATTERY. Changes to dark when the device has its ‘Battery Saver’ feature enabled, light otherwise. ✨New in v1.1.0-alpha03.
        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_YES);
    }
}