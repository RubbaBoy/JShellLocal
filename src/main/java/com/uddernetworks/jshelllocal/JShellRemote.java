package com.uddernetworks.jshelllocal;

import jdk.jshell.JShell;

public class JShellRemote {

    private JShell shell;

    public JShellRemote() {
        shell = JShell.builder().executionEngine("local").build();
        shell.eval("import static com.uddernetworks.jshelllocal.Host.host;");
    }

    public void runCode(String code) {
        shell.eval(code).forEach(sne -> System.out.println("=] \t\t " + sne.toString()));
    }

}
