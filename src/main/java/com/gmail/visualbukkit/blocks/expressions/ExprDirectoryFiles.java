package com.gmail.visualbukkit.blocks.expressions;

import java.io.File;
import java.util.List;

import com.gmail.visualbukkit.blocks.ExpressionBlock;
import com.gmail.visualbukkit.blocks.annotations.Description;

@Description("The files in a directory")
@SuppressWarnings("rawtypes")
public class ExprDirectoryFiles extends ExpressionBlock<List> {

    public ExprDirectoryFiles() {
        init("files in directory ", File.class);
    }

    @Override
    public String toJava() {
        return "PluginMain.createList(" + arg(0) + ".listFiles())";
    }
}