
doxy:
	make -C wiki
	rm -rf docs ; doxygen doxy.gen 1>/dev/null
	
update:
	git pull -v
	cd wiki ; git pull -v
