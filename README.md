# miquido_modules_presentation

This is a project I've made as a resource for presentation in Miquido.

Presentation is about modular projects and a way to create templates for new projects.

## Example directory
This is a simple application using modular structure. It contains 5 modules:

**app** - this is a module containing base application (different versions for debug and release buildVariants)
and base dependency injection (all activity binders are there). This module should depend on all new modules
containing activities due to activity binding

**buildSrc** - this is a module simply for organizing dependencies in a project. It contains two files
from which only Dependencies.kt is interesting. It contains all libraries and libraries' versions you use
in your project. Thanks to that you can easily add dependencies in other modules using autocompletion feature
in Android Studio.

**core** - this is a core module containing classes used throughout entire app. It contains BaseActivity and util
classes (like configuration with SharedPreferences and ResourceProvider for obtaining strings). It also
contains ScreenRouter which allows for navigation between activities residing in different modules. Normally that
wouldn't be possible as we cannot make circular dependencies on modules (so i.e. activity from module app would
'see' activity from settings module but not the other way around). However this app uses deeplinks which allows
ScreenRouter to navigate to any activity in the app (activities has to have intent-filter similar to the one that
MainActivity and SettingsActivity have)

**settings** - this is just a simple small module containing one activity just to show how to build new modules 
and navigate between activities residing in different modules

**testcore** - this is a module containing common test classes used throughout different modules. Currently it 
only has BaseTest class there

## {{ cookiecutter }} directory
This is a full template for a modular MVP Android project. Thanks to that template you 
can create new project containing four modules (app, buildSrc, core and testcore) in matter
of minutes.

In order to do so just install cookiecutter ([DOCS](https://cookiecutter.readthedocs.io/en/latest/installation.html))
and run

`cookiecutter https://github.com/AndrzejRyl/miquido_modules_presentation/`


Script will ask you basic questions about new project (like project name, min sdk etc.)
and libraries you want to include (at default each library is set to "n" which means 'DO NOT INCLUDE'.
If you want it in your project just answer with "y").
