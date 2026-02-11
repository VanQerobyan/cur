import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

class LocalizationManager(private val context: Context) {

    companion object {
        private const val SELECTED_LANGUAGE = "Selected.Language"
    }

    private val preferences: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun setLocale(localeCode: String) {
        val editor = preferences.edit()
        editor.putString(SELECTED_LANGUAGE, localeCode)
        editor.apply()
        updateResources(localeCode)
    }

    fun getLocale(): String {
        return preferences.getString(SELECTED_LANGUAGE, "en") ?: "en"
    }

    private fun updateResources(localeCode: String) {
        val locale = Locale(localeCode)
        Locale.setDefault(locale)
        val config = context.resources.configuration
        config.setLocale(locale)
        context.resources.updateConfiguration(config, context.resources.displayMetrics)
    }
}