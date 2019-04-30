
OS ?= linux

CFLAGS += -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/$(OS)
#CFLAGS += -fpic
CFLAGS += -shared

hello_c_wrap.so: hello_c_wrap.c Makefile
	$(CC) $(CFLAGS) -o $@ $<
#	$(LD) -G $<.o -o $@
#	sudo cp $@ /usr/local/lib/skala/$@
	sudo cp $@ /usr/lib/$@
	sudo chmod a+r+x /usr/lib/$@

hello_c_wrap.c hello_c.java: hello_c.i hello.c Makefile
	swig -java -package swig $<