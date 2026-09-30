# Fun stuff

## Primitive wrappers compare by reference 

```shell
./mvnw clean verify -pl :valhalla-ea-fun-vanilla
```

```shell
java --show-version \
  -cp ./valhalla-ea-fun-vanilla/target/classes \
  playground.valhalla.fun.PrimitiveWrappers
```
```
Integer.valueOf(0) == Integer.valueOf(0)     : true
Integer.valueOf(0).equals(Integer.valueOf(0)): true
Integer.valueOf(100500) == Integer.valueOf(100500)     : false
Integer.valueOf(100500).equals(Integer.valueOf(100500)): true
```

```shell
java --show-version \
  --enable-preview \
  -cp ./valhalla-ea-fun-vanilla/target/classes \
  playground.valhalla.fun.PrimitiveWrappers
```
```
Integer.valueOf(0) == Integer.valueOf(0)     : true
Integer.valueOf(0).equals(Integer.valueOf(0)): true
Integer.valueOf(100500) == Integer.valueOf(100500)     : true
Integer.valueOf(100500).equals(Integer.valueOf(100500)): true
```

## Immutable Collections

```shell
./mvnw clean verify -pl :valhalla-ea-fun-valhalla -Dpreview
```

```shell
java --show-version \
  --enable-preview \
  -cp ./valhalla-ea-fun-valhalla/target/classes \
  playground.valhalla.fun.ImmutableCollections
```

## Weak References

```shell
./mvnw clean verify -pl :valhalla-ea-fun-vanilla
```

```shell
java --show-version \
  -cp ./valhalla-ea-fun-vanilla/target/classes \
  playground.valhalla.fun.WeakValues
```

```
java.lang.ref.WeakReference@1dbd16a6
```

```shell
java --show-version \
  --enable-preview \
  -cp ./valhalla-ea-fun-vanilla/target/classes \
  playground.valhalla.fun.WeakValues
```

```
Exception in thread "main" java.lang.IdentityException: java.lang.Double is not an identity class
        at java.base/java.util.Objects.requireIdentity(Objects.java:243)
        at java.base/java.lang.ref.Reference.<init>(Reference.java:543)
        at java.base/java.lang.ref.Reference.<init>(Reference.java:538)
        at java.base/java.lang.ref.WeakReference.<init>(WeakReference.java:69)
```
