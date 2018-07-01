package javaexam.designpattern.exam11.command.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 집합
    private Stack<Command> commands = new Stack<>();
    // 실행
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            (it.next()).execute();
        }
    }
    // 추가
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    // 최후의 명령을 삭제
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // 전부 삭제
    public void clear() {
        commands.clear();
    }
}
