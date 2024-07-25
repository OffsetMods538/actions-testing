package top.offsetmonkey538.actionstesting.config;

import blue.endless.jankson.Comment;
import top.offsetmonkey538.monkeylib538.config.Config;

import static top.offsetmonkey538.actionstesting.ActionsTesting.MOD_ID;

public class ModConfig extends Config {

    @Comment("This is an example config entry.")
    public String coolValue = "Hello, World!";

    @Override
    protected String getName() {
        return MOD_ID;
    }
}
