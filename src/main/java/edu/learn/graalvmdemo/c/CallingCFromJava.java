package edu.learn.graalvmdemo.c;


import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class CallingCFromJava {
    public static void main(String[] args) {
        try {
            Source source = Source.newBuilder("llvm", new File("/opt/workspace/graalvm-demo/c-sample/helloworld.bc")).build();
            Context context = Context.newBuilder()
                    .allowIO(true)
                    .allowNativeAccess(true).build();
            Value lib = context.eval(source);
            Value function = lib.getMember("printHello");
            function.executeVoid();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*val s = Source.newBuilder("llvm", new File("./yourTestProgram.bc")).build
        val c = Context.newBuilder().allowNativeAccess(true).build()
        val lib = c.eval(s)
        val fn = lib.getMember("printHello")
        fn.executeVoid()*/
    }
}
