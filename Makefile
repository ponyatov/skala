all:

APP += src/frame src/metaL
APP += build.sbt project/*.sbt project/build.*
APP += src/app src/hw
APP += src/emc

merge:
	git checkout ponyatov -- $(APP)

NOW = $(shell date +%d%m%y)

release:
	git tag $(NOW) && git push -v --tags gh master

update:
	git pull -v

