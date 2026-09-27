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
  playground.valhalla.heap_flattening.IdentityDemo
```

```
Layout of class playground/valhalla/heap_flattening/IdentityRecordId@0x70b1700d6b90 extends java/lang/Record@0x70b170073ff0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "containerId" Ljava/lang/String;
 @12 REGULAR 4/4 "entityId" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/IdentityRecordEntity@0x70b1700d6b90 extends java/lang/Record@0x70b170073ff0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
 @12 REGULAR 4/4 "description" Ljava/util/Optional;
 @16 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @20 REGULAR 4/4 "version" Ljava/lang/Integer;
 @24 REGULAR 4/4 "deleted" Ljava/lang/Boolean;
Static fields:
 @0 RESERVED 120/-
Instance size = 32 bytes


Layout of class playground/valhalla/heap_flattening/IdentityClassEntity@0x70b1700d6b90 extends java/lang/Object@0x70b170073ff0
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
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
  playground.valhalla.heap_flattening.IdentityDemo
```

```
Layout of class playground/valhalla/heap_flattening/IdentityRecordId@0x7927a80d49a0 extends java/lang/Record@0x7927a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "containerId" Ljava/lang/String;
 @12 REGULAR 4/4 "entityId" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/IdentityRecordEntity@0x7927a80d49a0 extends java/lang/Record@0x7927a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
 @32 REGULAR 4/4 "createdAt" Ljava/time/Instant;
Static fields:
 @0 RESERVED 120/-
Instance size = 40 bytes

Layout of class playground/valhalla/heap_flattening/IdentityClassEntity@0x7927a80d49a0 extends java/lang/Object@0x7927a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7927a8074040 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
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
  playground.valhalla.heap_flattening.IdentityDemo
```

```
Layout of class playground/valhalla/heap_flattening/IdentityRecordId@0x7713ac0d49a0 extends java/lang/Record@0x7713ac074040
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "containerId" Ljava/lang/String;
 @12 REGULAR 4/4 "entityId" Ljava/lang/String;
Static fields:
 @0 RESERVED 120/-
Instance size = 16 bytes

Layout of class playground/valhalla/heap_flattening/IdentityRecordEntity@0x7713ac0d49a0 extends java/lang/Record@0x7713ac074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x7713ac074040 NULLABLE_NON_ATOMIC_FLAT
 @21 EMPTY 3/1
 @24 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x7713ac074040 NULLABLE_NON_ATOMIC_FLAT
 @29 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7713ac074040 NULLABLE_NON_ATOMIC_FLAT
 @31 EMPTY 1/1
 @32 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x7713ac074040 NULLABLE_NON_ATOMIC_FLAT
 @37 EMPTY 3/1
 @40 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
Static fields:
 @0 RESERVED 120/-
Instance size = 48 bytes

Layout of class playground/valhalla/heap_flattening/IdentityClassEntity@0x7713ac0d49a0 extends java/lang/Object@0x7713ac074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "description" Ljava/util/Optional; java/util/Optional@0x7713ac074040 NULLABLE_ATOMIC_FLAT
 @16 FLAT 8/8 "version" Ljava/lang/Integer; java/lang/Integer@0x7713ac074040 NULLABLE_ATOMIC_FLAT
 @24 FLAT 2/2 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7713ac074040 NULLABLE_ATOMIC_FLAT
 @26 EMPTY 2/1
 @28 REGULAR 4/4 "id" Lplayground/valhalla/heap_flattening/IdentityRecordId;
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
  playground.valhalla.heap_flattening.ValueDemo
```

```
Layout of class playground/valhalla/heap_flattening/ValueRecordId@0x73b4a80c49a0 extends java/lang/Record@0x73b4a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "containerId" Ljava/lang/String;
 @12 REGULAR 4/4 "entityId" Ljava/lang/String;
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

Layout of class playground/valhalla/heap_flattening/ValueRecordEntity@0x73b4a80c49a0 extends java/lang/Record@0x73b4a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @21 NULL_MARKER 1/1 
 @22 EMPTY 2/1
 @24 FLAT 9/4 "id" Lplayground/valhalla/heap_flattening/ValueRecordId; playground/valhalla/heap_flattening/ValueRecordId@0x73b4a80c49a0 NULLABLE_NON_ATOMIC_FLAT
 @33 EMPTY 3/1
 @36 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @41 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @43 EMPTY 1/1
 @44 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
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
Non-oop acmp map <offset,size>: <8,13> <32,1> <40,3> <44,4> <48,1> 
oop acmp map: 24 28 36 

Layout of class playground/valhalla/heap_flattening/ValueClassEntity@0x73b4a80c49a0 extends java/lang/Object@0x73b4a8074040
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 13/8 "createdAt" Ljava/time/Instant; java/time/Instant@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @21 NULL_MARKER 1/1 
 @22 EMPTY 2/1
 @24 FLAT 9/4 "id" Lplayground/valhalla/heap_flattening/ValueRecordId; playground/valhalla/heap_flattening/ValueRecordId@0x73b4a80c49a0 NULLABLE_NON_ATOMIC_FLAT
 @33 EMPTY 3/1
 @36 FLAT 5/4 "description" Ljava/util/Optional; java/util/Optional@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @41 FLAT 2/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
 @43 EMPTY 1/1
 @44 FLAT 5/4 "version" Ljava/lang/Integer; java/lang/Integer@0x73b4a8074040 NULLABLE_NON_ATOMIC_FLAT
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
Non-oop acmp map <offset,size>: <8,13> <32,1> <40,3> <44,4> <48,1> 
oop acmp map: 24 28 36 
```

```
VM.class_print_layout playground/valhalla/heap_flattening/ValueRecordId
Class playground/valhalla/heap_flattening/ValueRecordId [@app]:
  @ 8  "containerId" Ljava/lang/String;  
  @ 12  "entityId" Ljava/lang/String;  

VM.class_print_layout playground/valhalla/heap_flattening/ValueRecordEntity
Class playground/valhalla/heap_flattening/ValueRecordEntity [@app]:
  @ 8  "createdAt" Ljava/time/Instant;  flat
  @ 8     "seconds" J  
  @ 16     "nanos" I  
  @ 24  "id" Lplayground/valhalla/heap_flattening/ValueRecordId;  flat
  @ 24     "containerId" Ljava/lang/String;  
  @ 28     "entityId" Ljava/lang/String;  
  @ 36  "description" Ljava/util/Optional;  flat
  @ 36     "value" Ljava/lang/Object;  
  @ 41  "deleted" Ljava/lang/Boolean;  flat
  @ 41     "value" Z  
  @ 44  "version" Ljava/lang/Integer;  flat
  @ 44     "value" I  

VM.class_print_layout playground/valhalla/heap_flattening/ValueClassEntity
Class playground/valhalla/heap_flattening/ValueClassEntity [@app]:
  @ 8  "createdAt" Ljava/time/Instant;  flat
  @ 8     "seconds" J  
  @ 16     "nanos" I  
  @ 24  "id" Lplayground/valhalla/heap_flattening/ValueRecordId;  flat
  @ 24     "containerId" Ljava/lang/String;  
  @ 28     "entityId" Ljava/lang/String;  
  @ 36  "description" Ljava/util/Optional;  flat
  @ 36     "value" Ljava/lang/Object;  
  @ 41  "deleted" Ljava/lang/Boolean;  flat
  @ 41     "value" Z  
  @ 44  "version" Ljava/lang/Integer;  flat
  @ 44     "value" I  
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
  playground.valhalla.heap_flattening.NullRestrictedValueDemo
```

```
Layout of class playground/valhalla/heap_flattening/ValueRecordId@0x7ec6900f1980 extends java/lang/Record@0x7ec690073c60
Instance fields:
 @0 RESERVED 8/-
 @8 REGULAR 4/4 "containerId" Ljava/lang/String;
 @12 REGULAR 4/4 "entityId" Ljava/lang/String;
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

Layout of class playground/valhalla/heap_flattening/NullRestrictedValueRecordEntity@0x7ec6900f1980 extends java/lang/Record@0x7ec690073c60
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "id" Lplayground/valhalla/heap_flattening/ValueRecordId; playground/valhalla/heap_flattening/ValueRecordId@0x7ec6900f1980 NULL_FREE_ATOMIC_FLAT
 @16 FLAT 4/4 "description" Ljava/util/Optional; java/util/Optional@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
 @20 FLAT 4/4 "version" Ljava/lang/Integer; java/lang/Integer@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
 @24 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @28 FLAT 1/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
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

Layout of class playground/valhalla/heap_flattening/NullRestrictedValueClassEntity@0x7ec6900f1980 extends java/lang/Object@0x7ec690073c60
Instance fields:
 @0 RESERVED 8/-
 @8 FLAT 8/8 "id" Lplayground/valhalla/heap_flattening/ValueRecordId; playground/valhalla/heap_flattening/ValueRecordId@0x7ec6900f1980 NULL_FREE_ATOMIC_FLAT
 @16 FLAT 4/4 "description" Ljava/util/Optional; java/util/Optional@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
 @20 FLAT 4/4 "version" Ljava/lang/Integer; java/lang/Integer@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
 @24 REGULAR 4/4 "createdAt" Ljava/time/Instant;
 @28 FLAT 1/1 "deleted" Ljava/lang/Boolean; java/lang/Boolean@0x7ec690073c60 NULL_FREE_NON_ATOMIC_FLAT
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
