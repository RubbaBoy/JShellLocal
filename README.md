# JShellLocal

JShellLocal is a very simple project to display the use of local JShell execution engines that I found with experimenting. JShell is a part of the JDK 9+ that introduces scripting with Java, and this project shows it used attached to the same JVM.

This demo project (output shown below) allow for accessing the singleton class `Host` with the variable `host`, and invoking methods with it through System.in. This has an async counter that increments a number and outputs it every 3 seconds, with some simple methods to mutate this number. The screenshot below displays the arbitrary code execution on the currently running JVM. Any code can be executed here.

![Demo screenshot](https://rubbaboy.me/images/7xymhxx)

This is just something I found super cool and will probably use a bunch in the future, and I haven't seen this be utilized before.
