package com.gmail.visualbukkit.blocks.definitions;

import com.gmail.visualbukkit.blocks.ClassInfo;
import com.gmail.visualbukkit.blocks.Expression;

public class ExprPluginConfig extends Expression {

    public ExprPluginConfig() {
        super("expr-plugin-config", ClassInfo.of("org.bukkit.configuration.ConfigurationSection"));
    }

    @Override
    public Block createBlock() {
        return new Block(this) {
            @Override
            public String toJava() {
                return "PluginMain.getInstance().getConfig()";
            }
        };
    }
}
