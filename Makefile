all:
	make -C src/linux

merge:
	git checkout ponyatov -- src/frame src/metaL

