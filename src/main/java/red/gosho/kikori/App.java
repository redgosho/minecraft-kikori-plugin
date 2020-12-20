package red.gosho.kikori;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("木こりプラグイン起動！");
    }

    @Override
    public void onDisable() {
        getLogger().info("木こりプラグイン終了！");
    }
}