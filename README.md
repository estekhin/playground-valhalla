# playground-valhalla

## errors under 27-jep401ea3, fixed in 28-ea b10

Subprojects

- valhalla-ea-record-verify-error
- valhalla-ea-self-referencing-constructor-compilation-failure
- valhalla-ea-separate-compilation-failure

expect that `JAVA_HOME` environment variable points to the Valhalla Early-Access Build:

```shell
export JAVA_HOME=.../openjdk-27-jep401ea3+1-1_linux-x64_bin/jdk-27
```

These projects will fail under 27-jep401ea3, and will work under 28-ea b10.
