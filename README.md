# JAVA
Java programs with absolute minimum fuss.


## Modules

1. Java-Scheduling
2. Java-Functional-Programming

## Setup



## Dependencies



## Bundles

Take note of the `pom.xml` file.

## Philosophy

I hate coding absolute paths in my build script, and I hate including
built files as part of the base project. My philosophy is that the
*environment* should be set up so that the tool can easily find the
external resources they need (JUnit, etc.) from the system or
dependency manager. It's the system or dependency manager that
provides the libraries. Anyone who has the proper development
environment set up -- one that works across many projects -- should be
able to clone the repository and do a build simply by running the
build program with no special arguments. There should be no need to
edit or install anything into the project space for the initial build.

## License
Geekcolab Spring is Open Source application programs under the https://www.apache.org/licenses/LICENSE-2.0.html[Apache 2.0 license].
