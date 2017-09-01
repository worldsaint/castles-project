CDIR = classes
SRCDIR = src

CC = javac
CFLAGS =

$(CDIR)/%.class: 
	$(CC) $(SRCDIR)/*.java -d $(CDIR) $(CFLAGS)

Main.class: $(CDIR)/%.class
	$(CC) Main.java -cp $(CDIR) -d $(CDIR)

clean:
	rm $(CDIR)/*.class
	rm *.class
	rm $(CDIR)/*~ *~	
