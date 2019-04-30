
OS ?= linux

CFLAGS += -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/$(OS)
CFLAGS += -fpic -shared

OBJDUMP ?= objdump

hello_c_wrap.so: hello_c_wrap.c hello.c
	$(CC) $(CFLAGS) -o $@ $^
#	$(OBJDUMP) -x $@ 
#	$(LD) -G $<.o -o $@

hello_c_wrap.c hello_c.java: hello_c.i hello.c hello.h Makefile
	swig -java -package $(OS) $<