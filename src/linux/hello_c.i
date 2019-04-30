
%module hello_c

%{
#include <stdlib.h>
#include "hello.h"
%}

void hello(void);

void abort(void);
