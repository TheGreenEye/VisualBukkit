package com.gmail.visualbukkit.blocks.definitions;

import com.gmail.visualbukkit.blocks.ClassInfo;
import com.gmail.visualbukkit.blocks.Expression;

public class ExprGUIClickedInventory extends Expression {

    public ExprGUIClickedInventory() {
        super("expr-gui-clicked-inventory", ClassInfo.of("org.bukkit.inventory.Inventory"));
    }

    @Override
    public Block createBlock() {
        return new Block(this) {
            @Override
            public void update() {
                super.update();
                checkForPluginComponent("comp-gui-click-handler");
            }

            @Override
            public String toJava() {
                return "event.getClickedInventory()";
            }
        };
    }
}
