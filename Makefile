all: release

merge:
	git checkout ponyatov -- src/frame src/metaL

NOW = $(shell date +%d%m%y)

release:
	git tag $(NOW) && git push -v --tags gh master

