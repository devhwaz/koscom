package javaexam.designpattern.exam21.interpreter.language;

public interface ExecutorFactory {
    public abstract Executor createExecutor(String name);
}
