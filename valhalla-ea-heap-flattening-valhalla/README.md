# Heap flattening

## Vanilla Code + Vanilla Compile + Vanilla Run

Compiling from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-heap-flattening-vanilla
```

Running from the root directory
```shell
java --show-version -XX:+UnlockDiagnosticVMOptions -XX:+PrintFieldLayout \
  -cp ./valhalla-ea-heap-flattening-vanilla/target/classes \
  playground.valhalla.heap_flattening.EntityDemo
```

```
Layout of class playground/valhalla/heap_flattening/EntityContainerId@0x75e6e40c69d0 extends java/lang/Record@0x75e6e4073ce0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/EntityId@0x75e6e40c69d0 extends java/lang/Record@0x75e6e4073ce0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "container" Lplayground/valhalla/heap_flattening/EntityContainerId;
 @12 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/RecordEntity@0x75e6e40c69d0 extends java/lang/Record@0x75e6e4073ce0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
 @12 REGULAR 4/4 "description" Ljava/util/Optional;
 @16 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @20 REGULAR 4/4 "version" Ljava/lang/Integer;
 @24 REGULAR 4/4 "deleted" Ljava/lang/Boolean;
Static fields:
 @0 RESERVED 120/-
Instance size = 32 bytes

Layout of class playground/valhalla/heap_flattening/ClassEntity@0x75e6e40c69d0 extends java/lang/Object@0x75e6e4073ce0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
 @12 REGULAR 4/4 "description" Ljava/util/Optional;
 @16 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @20 REGULAR 4/4 "version" Ljava/lang/Integer;
 @24 REGULAR 4/4 "deleted" Ljava/lang/Boolean;
Static fields:
 @0 RESERVED 120/-
Instance size = 32 bytes
```

## Vanilla Code + Vanilla Compile + Valhalla Run

Compiling from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-heap-flattening-vanilla
```

Running from the root directory
```shell
java --show-version -XX:+UnlockDiagnosticVMOptions -XX:+PrintFieldLayout \
  --enable-preview \
  -cp ./valhalla-ea-heap-flattening-vanilla/target/classes \
  playground.valhalla.heap_flattening.EntityDemo
```

```
Layout of class playground/valhalla/heap_flattening/EntityContainerId@0x7da6e80cc000 extends java/lang/Record@0x7da6e8073d50
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/EntityId@0x7da6e80cc000 extends java/lang/Record@0x7da6e8073d50
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "container" Lplayground/valhalla/heap_flattening/EntityContainerId;
 @12 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/RecordEntity@0x7da6e80cc000 extends java/lang/Record@0x7da6e8073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
 @32 REGULAR 4/4 "createdAt" Ljava/time/Instant;
Static fields:
 @0 RESERVED 120/-
Instance size = 40 bytes

Layout of class playground/valhalla/heap_flattening/ClassEntity@0x7da6e80cc000 extends java/lang/Object@0x7da6e8073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7da6e8073d50 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
 @32 REGULAR 4/4 "createdAt" Ljava/time/Instant;
Static fields:
 @0 RESERVED 120/-
Instance size = 40 bytes
```

## Vanilla Code + Valhalla Compile + Valhalla Run

Compiling from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-heap-flattening-vanilla -Dpreview
```

Running from the root directory
```shell
java --show-version -XX:+UnlockDiagnosticVMOptions -XX:+PrintFieldLayout \
  --enable-preview \
  -cp ./valhalla-ea-heap-flattening-vanilla/target/classes \
  playground.valhalla.heap_flattening.EntityDemo
```

```
Layout of class playground/valhalla/heap_flattening/EntityContainerId@0x7224200cc000 extends java/lang/Record@0x722420073d50
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/EntityId@0x7224200cc000 extends java/lang/Record@0x722420073d50
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "container" Lplayground/valhalla/heap_flattening/EntityContainerId;
 @12 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/RecordEntity@0x7224200cc000 extends java/lang/Record@0x722420073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x722420073d50 NULLABLE_NON_ATOMIC_FLAT
 @21 EMPTY 3/1
 @24 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x722420073d50 NULLABLE_NON_ATOMIC_FLAT
 @29 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x722420073d50 NULLABLE_NON_ATOMIC_FLAT
 @31 EMPTY 1/1
 @32 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x722420073d50 NULLABLE_NON_ATOMIC_FLAT
 @37 EMPTY 3/1
 @40 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
Static fields:
 @0 RESERVED 120/-
Instance size = 48 bytes

Layout of class playground/valhalla/heap_flattening/ClassEntity@0x7224200cc000 extends java/lang/Object@0x722420073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x722420073d50 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x722420073d50 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x722420073d50 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/EntityId;
 @32 REGULAR 4/4 "createdAt" Ljava/time/Instant;
Static fields:
 @0 RESERVED 120/-
Instance size = 40 bytes
```

## Valhalla Code + Valhalla Compile + Valhalla Run

Compiling from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-heap-flattening-valhalla -Dpreview
```

Running from the root directory
```shell
java --show-version -XX:+UnlockDiagnosticVMOptions -XX:+PrintFieldLayout \
  --enable-preview \
  -cp ./valhalla-ea-heap-flattening-valhalla/target/classes \
  playground.valhalla.heap_flattening.EntityDemo
```

```
Layout of class playground/valhalla/heap_flattening/EntityContainerId@0x73ecb40cc000 extends java/lang/Record@0x73ecb4073d50
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "value" Ljava/lang/String;
 @12 NULL_MARKER 1/1 
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 16 bytes
First field offset = 8
BUFFERED layout: 8/8
NULL_FREE_NON_ATOMIC_FLAT layout: 4/4
NULL_FREE_ATOMIC_FLAT layout: 4/4
NULLABLE_ATOMIC_FLAT layout: 8/8
NULLABLE_NON_ATOMIC_FLAT layout: 5/4
Null marker offset = 12
Non-oop acmp map <offset,size>: 
oop acmp map: 8 

Layout of class playground/valhalla/heap_flattening/EntityId@0x73ecb40cc000 extends java/lang/Record@0x73ecb4073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 5/4 "container" Lplayground/valhalla/heap_flattening/EntityContainerId; playground/valhalla/heap_flattening/EntityContainerId@0x73ecb40cc000 NULLABLE_NON_ATOMIC_FLAT
 @13 NULL_MARKER 1/1 
 @14 EMPTY 2/1
 @16 REGULAR 4/4 "value" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 24 bytes
First field offset = 8
BUFFERED layout: 12/4
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: -/-
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 12/4
Null marker offset = 13
Non-oop acmp map <offset,size>: <12,1> 
oop acmp map: 8 16 

Layout of class playground/valhalla/heap_flattening/RecordEntity@0x73ecb40cc000 extends java/lang/Record@0x73ecb4073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @21 NULL_MARKER 1/1 
 @22 EMPTY 2/1
 @24 FLAT 12/4 "id" Lplayground/valhalla/heap_flattening/EntityId; playground/valhalla/heap_flattening/EntityId@0x73ecb40cc000 NULLABLE_NON_ATOMIC_FLAT
 @36 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @41 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @43 EMPTY 1/1
 @44 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 56 bytes
First field offset = 8
BUFFERED layout: 41/8
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: -/-
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 41/8
Null marker offset = 21
Non-oop acmp map <offset,size>: <8,13> <28,2> <40,3> <44,4> <48,1> 
oop acmp map: 24 32 36 

Layout of class playground/valhalla/heap_flattening/ClassEntity@0x73ecb40cc000 extends java/lang/Object@0x73ecb4073d50
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @21 NULL_MARKER 1/1 
 @22 EMPTY 2/1
 @24 FLAT 12/4 "id" Lplayground/valhalla/heap_flattening/EntityId; playground/valhalla/heap_flattening/EntityId@0x73ecb40cc000 NULLABLE_NON_ATOMIC_FLAT
 @36 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @41 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
 @43 EMPTY 1/1
 @44 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x73ecb4073d50 NULLABLE_NON_ATOMIC_FLAT
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 56 bytes
First field offset = 8
BUFFERED layout: 41/8
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: -/-
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 41/8
Null marker offset = 21
Non-oop acmp map <offset,size>: <8,13> <28,2> <40,3> <44,4> <48,1> 
oop acmp map: 24 32 36 
```

```
```

## NullRestricted Valhalla Code + Valhalla Compile + Valhalla Run

Compiling from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-heap-flattening-valhalla -Dpreview
```

Running from the root directory
```shell
java --show-version -XX:+UnlockDiagnosticVMOptions -XX:+PrintFieldLayout \
  --enable-preview \
  --add-exports java.base/jdk.internal.vm.annotation=ALL-UNNAMED \
  -cp ./valhalla-ea-heap-flattening-valhalla/target/classes \
  playground.valhalla.heap_flattening.NullRestrictedEntityDemo
```

```
Layout of class playground/valhalla/heap_flattening/NullRestrictedEntityContainerId@0x7acdc80ebf90 extends java/lang/Record@0x7acdc8073b90
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "value" Ljava/lang/String;
 @12 NULL_MARKER 1/1 
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 16 bytes
First field offset = 8
BUFFERED layout: 8/8
NULL_FREE_NON_ATOMIC_FLAT layout: 4/4
NULL_FREE_ATOMIC_FLAT layout: 4/4
NULLABLE_ATOMIC_FLAT layout: 8/8
NULLABLE_NON_ATOMIC_FLAT layout: 5/4
Null marker offset = 12
Non-oop acmp map <offset,size>: 
oop acmp map: 8 

Layout of class playground/valhalla/heap_flattening/NullRestrictedEntityId@0x7acdc80ebf90 extends java/lang/Record@0x7acdc8073b90
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 4/4 "container" Lplayground/valhalla/heap_flattening/NullRestrictedEntityContainerId; playground/valhalla/heap_flattening/NullRestrictedEntityContainerId@0x7acdc80ebf90 NULL_FREE_NON_ATOMIC_FLAT
 @12 REGULAR 4/4 "value" Ljava/lang/String;
 @16 NULL_MARKER 1/1 
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 24 bytes
First field offset = 8
BUFFERED layout: 9/8
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: 8/8
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 9/4
Null marker offset = 16
Non-oop acmp map <offset,size>: 
oop acmp map: 8 12 

Layout of class playground/valhalla/heap_flattening/NullRestrictedRecordEntity@0x7acdc80ebf90 extends java/lang/Record@0x7acdc8073b90
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "id" Lplayground/valhalla/heap_flattening/NullRestrictedEntityId; playground/valhalla/heap_flattening/NullRestrictedEntityId@0x7acdc80ebf90 NULL_FREE_ATOMIC_FLAT
 @16 FLAT 4/4 "description" Ljava/util/Optional; java/util/Optional@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @20 FLAT 4/4 "version" Ljava/lang/Integer; java/lang/Integer@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @24 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @28 FLAT 1/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @29 NULL_MARKER 1/1 
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 32 bytes
First field offset = 8
BUFFERED layout: 22/8
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: -/-
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 22/8
Null marker offset = 29
Non-oop acmp map <offset,size>: <20,4> <28,1> 
oop acmp map: 8 12 16 24 

Layout of class playground/valhalla/heap_flattening/NullRestrictedClassEntity@0x7acdc80ebf90 extends java/lang/Object@0x7acdc8073b90
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "id" Lplayground/valhalla/heap_flattening/NullRestrictedEntityId; playground/valhalla/heap_flattening/NullRestrictedEntityId@0x7acdc80ebf90 NULL_FREE_ATOMIC_FLAT
 @16 FLAT 4/4 "description" Ljava/util/Optional; java/util/Optional@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @20 FLAT 4/4 "version" Ljava/lang/Integer; java/lang/Integer@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @24 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @28 FLAT 1/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7acdc8073b90 NULL_FREE_NON_ATOMIC_FLAT
 @29 NULL_MARKER 1/1 
Static fields:
 @0 RESERVED 120/-
 @120 REGULAR 4/4 ".null_reset" Ljava/lang/Object;
 @124 REGULAR 4/4 ".acmp_maps" [I
Instance size = 32 bytes
First field offset = 8
BUFFERED layout: 22/8
NULL_FREE_NON_ATOMIC_FLAT layout: -/-
NULL_FREE_ATOMIC_FLAT layout: -/-
NULLABLE_ATOMIC_FLAT layout: -/-
NULLABLE_NON_ATOMIC_FLAT layout: 22/8
Null marker offset = 29
Non-oop acmp map <offset,size>: <20,4> <28,1> 
oop acmp map: 8 12 16 24 
```

```
VM.class_print_layout playground/valhalla/heap_flattening/ValueRecordId
Class playground/valhalla/heap_flattening/ValueRecordId [@app]:
  @ 8  "containerId" Ljava/lang/String;  
  @ 12  "entityId" Ljava/lang/String;  


VM.class_print_layout playground/valhalla/heap_flattening/NullRestrictedValueRecordEntity
Class playground/valhalla/heap_flattening/NullRestrictedValueRecordEntity [@app]:
  @ 8  "id" Lplayground/valhalla/heap_flattening/ValueRecordId;  // inline type  flat
  @ 8     "containerId" Ljava/lang/String;  
  @ 12     "entityId" Ljava/lang/String;  
  @ 16  "description" Ljava/util/Optional;  // inline type  flat
  @ 16     "value" Ljava/lang/Object;  
  @ 20  "version" Ljava/lang/Integer;  // inline type  flat
  @ 20     "value" I  
  @ 24  "createdAt" Ljava/time/Instant;  // inline type  
  @ 28  "deleted" Ljava/lang/Boolean;  // inline type  flat
  @ 28     "value" Z  

VM.class_print_layout playground/valhalla/heap_flattening/NullRestrictedValueClassEntity
Class playground/valhalla/heap_flattening/NullRestrictedValueClassEntity [@app]:
  @ 8  "id" Lplayground/valhalla/heap_flattening/ValueRecordId;  // inline type  flat
  @ 8     "containerId" Ljava/lang/String;  
  @ 12     "entityId" Ljava/lang/String;  
  @ 16  "description" Ljava/util/Optional;  // inline type  flat
  @ 16     "value" Ljava/lang/Object;  
  @ 20  "version" Ljava/lang/Integer;  // inline type  flat
  @ 20     "value" I  
  @ 24  "createdAt" Ljava/time/Instant;  // inline type  
  @ 28  "deleted" Ljava/lang/Boolean;  // inline type  flat
  @ 28     "value" Z  
```
