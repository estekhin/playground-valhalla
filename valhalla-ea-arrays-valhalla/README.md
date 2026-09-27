# Flat arrays

See https://github.com/openjdk/valhalla/blob/0afc29a857dd7a1a1b606e14ad4d015036eeaf55/src/hotspot/share/oops/layoutKind.hpp#L87 for layout types.

## Integer array

```shell
./mvnw clean verify -pl :valhalla-ea-arrays-vanilla
```

```shell
java --show-version \
  -cp ./valhalla-ea-arrays-vanilla/target/classes \
  playground.valhalla.arrays.IntegerArray
```
```
GC.class_histogram
 num     #instances         #bytes  class name (module)
-------------------------------------------------------
   1:       1000256       16004096  java.lang.Integer (java.base@28-ea)
   2:             2        4001056  [Ljava.lang.Integer; (java.base@28-ea)
```

One "target" `Integer[]` array of size 1_000_000, taking 4_000_016 bytes, one million of "target" `Integer` objects, each taking 16 bytes.

```shell
java --show-version \
  --enable-preview \
  -cp ./valhalla-ea-arrays-vanilla/target/classes \
  playground.valhalla.arrays.IntegerArray
```
```
GC.class_histogram
 num     #instances         #bytes  class name (module)
-------------------------------------------------------
   1:             1        8000016  [Ljava.lang.Integer; (java.base@28-ea)
```

One "target" `Integer[]` array of size 1_000_000, taking 8_000_016 bytes, zero `Integer` objects.

```shell
./mvnw clean verify -pl :valhalla-ea-arrays-valhalla -Dpreview
```
```shell
java --show-version \
  --enable-preview \
  --add-exports java.base/jdk.internal.misc=ALL-UNNAMED \
  --add-exports java.base/jdk.internal.value=ALL-UNNAMED \
  --add-exports java.base/jdk.internal.vm.annotation=ALL-UNNAMED \
  -cp ./valhalla-ea-arrays-valhalla/target/classes \
  playground.valhalla.arrays.NullRestrictedIntegerArray
```
```
GC.class_histogram
 num     #instances         #bytes  class name (module)
-------------------------------------------------------
   1:             1        4000016  [Ljava.lang.Integer; (java.base@28-ea)
```

One "target" `Integer[]` array of size 1_000_000, taking 4_000_016 bytes, zero `Integer` objects.

## Layouts

```shell
./mvnw clean verify -pl :valhalla-ea-arrays-valhalla -Dpreview
```

```shell
java --show-version \
  --enable-preview \
  --add-exports java.base/jdk.internal.misc=ALL-UNNAMED \
  --add-exports java.base/jdk.internal.value=ALL-UNNAMED \
  --add-exports java.base/jdk.internal.vm.annotation=ALL-UNNAMED \
  -cp ./valhalla-ea-arrays-valhalla/target/classes \
  playground.valhalla.arrays.ArrayLayouts
```
