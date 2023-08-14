package edu.learn.graalvmdemo.c;


import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class CallingCFromJava {
    public static void main(String[] args) {
        try {
            Source source = Source.newBuilder("llvm", new File("/disk1/Workspace/GraalVM/graalvm-demo/graalvm_java_clang/c-sample/helloworld.bc")).build();
            Context context = Context.newBuilder()
                    .allowAllAccess(true)
                    .allowNativeAccess(true).build();
            Value lib = context.eval(source);
            Value function = lib.getMember("printHello");
            function.executeVoid();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
