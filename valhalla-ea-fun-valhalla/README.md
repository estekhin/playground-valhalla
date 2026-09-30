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

## Mock Records

```shell
./mvnw clean verify -pl :valhalla-ea-fun-vanilla
```

```shell
java --show-version \
  -cp ./valhalla-ea-fun-vanilla/target/classes:$HOME/.m2/repository/org/mockito/mockito-core/5.24.0/mockito-core-5.24.0.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.17.7/byte-buddy-1.17.7.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy-agent/1.17.7/byte-buddy-agent-1.17.7.jar \
  playground.valhalla.fun.MockRecords
```

```
42
```

```shell
java --show-version \
  --enable-preview \
  -cp ./valhalla-ea-fun-vanilla/target/classes:$HOME/.m2/repository/org/mockito/mockito-core/5.24.0/mockito-core-5.24.0.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy/1.17.7/byte-buddy-1.17.7.jar:$HOME/.m2/repository/net/bytebuddy/byte-buddy-agent/1.17.7/byte-buddy-agent-1.17.7.jar \
  playground.valhalla.fun.MockRecords
```

```
42
```

```shell
./mvnw clean verify -pl :valhalla-ea-fun-vanilla -Dpreview
```

```
Mockito cannot mock this class: class playground.valhalla.fun.MockRecords$IdentityRecord.
Can not mock final classes with the following settings :
 - explicit serialization (e.g. withSettings().serializable())
 - extra interfaces (e.g. withSettings().extraInterfaces(...))

You are seeing this disclaimer because Mockito is configured to create inlined mocks.
You can learn about inline mocks and their limitations under item #39 of the Mockito class javadoc.

Underlying exception : java.lang.IllegalArgumentException: Could not create type
        at playground.valhalla.fun.MockRecords.main(MockRecords.java:8)
Caused by: java.lang.IllegalArgumentException: Could not create type
        at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:170)
        at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:399)
        at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:190)
        at net.bytebuddy.TypeCache$WithInlineExpunction.findOrInsert(TypeCache.java:410)
        at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.mockClass(TypeCachingBytecodeGenerator.java:75)
        at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMockType(InlineDelegateByteBuddyMockMaker.java:434)
        at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:393)
        at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:372)
        at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:56)
        at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:99)
        at org.mockito.internal.MockitoCore.mock(MockitoCore.java:80)
        at org.mockito.Mockito.mock(Mockito.java:2316)
        at org.mockito.Mockito.mock(Mockito.java:2231)
        ... 1 more
Caused by: java.lang.VerifyError
        at java.instrument/sun.instrument.InstrumentationImpl.retransformClasses0(Native Method)
        at java.instrument/sun.instrument.InstrumentationImpl.retransformClasses(InstrumentationImpl.java:221)
        at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.triggerRetransformation(InlineBytecodeGenerator.java:311)
        at org.mockito.internal.creation.bytebuddy.InlineBytecodeGenerator.mockClass(InlineBytecodeGenerator.java:243)
        at org.mockito.internal.creation.bytebuddy.TypeCachingBytecodeGenerator.lambda$mockClass$0(TypeCachingBytecodeGenerator.java:78)
        at net.bytebuddy.TypeCache.findOrInsert(TypeCache.java:168)
        ... 13 more
```
