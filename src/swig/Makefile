
OS ?= linux

CFLAGS += -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/$(OS)
CFLAGS += -fpic

hello_c_wrap.so: hello_c_wrap.c Makefile
	$(CC) $(CFLAGS) -c -o $<.o $<
	$(LD) -G $<.o -o $@

hello_c_wrap.c hello_c.java: hello_c.i hello.c Makefile
	swig -java -package swig $<