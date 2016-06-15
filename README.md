# Preface #

This document describes the functionality provided by the xldp gradle plugin.

# CI status #

[![Build Status][xldp-gradle-travis-image] ][xldp-gradle-travis-url]
[![Codacy Badge][xldp-gradle-codacy-image] ][xldp-gradle-codacy-url]
[![Code Climate][xldp-gradle-code-climate-image] ][xldp-gradle-code-climate-url]

[xldp-gradle-travis-image]: https://travis-ci.org/xebialabs-community/xldp-gradle-plugin.svg?branch=master
[xldp-gradle-travis-url]: https://travis-ci.org/xebialabs-community/xldp-gradle-plugin
[xldp-gradle-codacy-image]: https://api.codacy.com/project/badge/Grade/845a5c0ceff748c38df1dc7640f37e9c
[xldp-gradle-codacy-url]: https://www.codacy.com/app/joris-dewinne/xld-gradle-plugin
[xldp-gradle-code-climate-image]: https://codeclimate.com/github/xebialabs-community/xldp-gradle-plugin/badges/gpa.svg
[xldp-gradle-code-climate-url]: https://codeclimate.com/github/xebialabs-community/xldp-gradle-plugin


# Overview #

The xldp gradle plugin allows to create a xldp plugin file, that can be loaded in XL Deploy 5.x

# Requirements #

* **XL Deploy** 5.x
* **Gradle** 2.4

# Installation #

Define on top of the `build.gradle` file:

```
plugins {
  id "com.xebialabs.xldp" version "1.0.5"
}
```

And after that you can add `distBundle` dependencies like:

```
dependencies {
  distBundle "Here you can put your dependency that should be packaged into the xldp plugin"
}
```

You can also make use of `xldp` dependencies like:

```
dependencies {
  compile zipTree('Here you can put your xldp dependency that should be put on the classpath')
}
```

For the latest version of the plugin have a look at:
https://plugins.gradle.org/plugin/com.xebialabs.xldp
