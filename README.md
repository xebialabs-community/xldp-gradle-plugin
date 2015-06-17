# Preface #

This document describes the functionality provided by the xldp gradle plugin.

# Overview #

The xldp gradle plugin allows to create a xldp plugin file, that can be loaded in XL Deploy 5.x

# Requirements #

* **XL Deploy** 5.x
* **Gradle** 2.4

# Installation #

Define on top of the `build.gradle` file:

```
plugins {
  id "com.xebialabs.xldp" version "1.0.4"
}
```

And after that you can add `distBundle` dependencies like:

```
dependencies {
  distBundle "Here you can put your dependency that should be packaged into the xldp plugin"
}
```

For the latest version of the plugin have a look at:
https://plugins.gradle.org/plugin/com.xebialabs.xldp
