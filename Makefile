
JAVAC = javac

default: Main.class
	java Main

%.class: %.java
	$(JAVAC) $<

Main.class: Main.java Color.java
	$(JAVAC) Main.java Color.java

