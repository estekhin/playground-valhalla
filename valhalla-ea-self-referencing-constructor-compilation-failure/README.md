# self-referencing constructor compilation failure

Using "this" constructor reference as an argument for the superclass constructor results in compilation failure with the `reference to null may only appear after an explicit constructor invocation` message.

The workaround is to use any kind of explicitly static wrapper over the same constructor.

## reproducer

Running from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-self-referencing-constructor-compilation-failure
```

results in
```
Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
Maven home: /home/estekhin/.m2/wrapper/dists/apache-maven-3.9.16/68c71022
Java version: 27-jep401ea3, vendor: Oracle Corporation, runtime: /home/estekhin/Downloads/openjdk-27-jep401ea3+1-1_linux-x64_bin/jdk-27
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.8.0-136-generic", arch: "amd64", family: "unix"
...
[INFO] --- compiler:3.15.0:compile (default-compile) @ valhalla-ea-self-referencing-constructor-compilation-failure ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 8 source files with javac [debug release 27] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/estekhin/Documents/github/estekhin/playground-valhalla/valhalla-ea-self-referencing-constructor-compilation-failure/src/main/java/playground/valhalla/self_referencing_constructor/SelfReferencingByConstructorRef.java:[6,15] reference to null may only appear after an explicit constructor invocation
[ERROR] /home/estekhin/Documents/github/estekhin/playground-valhalla/valhalla-ea-self-referencing-constructor-compilation-failure/src/main/java/playground/valhalla/self_referencing_constructor/SelfReferencingByLambda.java:[6,21] reference to null may only appear after an explicit constructor invocation
[ERROR] /home/estekhin/Documents/github/estekhin/playground-valhalla/valhalla-ea-self-referencing-constructor-compilation-failure/src/main/java/playground/valhalla/self_referencing_constructor/SelfReferencingBySupplierWithConstructorRef.java:[8,74] reference to null may only appear after an explicit constructor invocation
[ERROR] /home/estekhin/Documents/github/estekhin/playground-valhalla/valhalla-ea-self-referencing-constructor-compilation-failure/src/main/java/playground/valhalla/self_referencing_constructor/SelfReferencingBySupplierWithLambda.java:[8,72] reference to null may only appear after an explicit constructor invocation
```
