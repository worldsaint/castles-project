CDIR = classes
SRCDIR = src

CC = javac
CFLAGS =

Main.class: $(CDIR) $(CDIR)/%.class
	$(CC) Main.java -cp $(CDIR) -d $(CDIR)

$(CDIR)/%.class: $(CDIR) 
	$(CC) $(SRCDIR)/*.java -d $(CDIR) $(CFLAGS)

$(CDIR):
	mkdir $(CDIR)

clean:
	rm $(CDIR)/*.class

