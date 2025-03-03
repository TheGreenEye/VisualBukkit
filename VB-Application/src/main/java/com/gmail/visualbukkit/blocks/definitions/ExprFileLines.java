package com.gmail.visualbukkit.blocks.definitions;

import com.gmail.visualbukkit.blocks.ClassInfo;
import com.gmail.visualbukkit.blocks.Expression;
import com.gmail.visualbukkit.blocks.parameters.ExpressionParameter;

import java.io.File;

public class ExprFileLines extends Expression {

    public ExprFileLines() {
        super("expr-file-lines", ClassInfo.LIST);
    }

    @Override
    public Block createBlock() {
        return new Block(this, new ExpressionParameter(ClassInfo.of(File.class))) {
            @Override
            public String toJava() {
                return "java.nio.file.Files.readAllLines(" + arg(0) + ".toPath(),java.nio.charset.StandardCharsets.UTF_8)";
            }
        };
    }
}
