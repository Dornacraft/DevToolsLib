package fr.dornacraft.devtoolslib;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class of the plugin DevToolsLib that's called by the PluginLoader of Bukkit when present in the plugins forlder
 * of a server.
 *
 * @author Voltariuss
 */
public class DevToolsLib extends JavaPlugin {

    private static JavaPlugin instance;

    @Override
    public void onEnable() {
        setPlugin(this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        unsetPlugin();
    }

    /**
     * Return an instance of JavaPlugin that can be other than the expected plugin (in case where the class is initialize
     * by an other plugin for example).
     *
     * @return the java plugin instance
     */
    public static JavaPlugin getInstance() { return instance; }

    /**
     * Initialize the plugin (usefull when no instance of this class is loaded by the PluginLoader)
     *
     * @param javaPlugin the java plugin instance
     */
    public static void setPlugin(JavaPlugin javaPlugin) {
        instance = javaPlugin;
    }

    /**
     * Remove static references of the class.
     */
    public static void unsetPlugin() {
        instance = null;
    }
}
