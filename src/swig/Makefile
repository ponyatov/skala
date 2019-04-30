
CFLAGS += -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux
CFLAGS += -fpic

hello_c_wrap.so: hello_c_wrap.c
	$(CC) $(CFLAGS) -c -o $@ $<

hello_c_wrap.c hello_c.java: hello_c.i hello.c
	swig -java $<