# VerifyError for identity-record with canonical constructor and ternary for the last argument-to-field assignment in preview mode

The plain "identity" record with canonical constructor, 
whose last argument to field assignment uses ternary operator,
compiled and used with `--enable-preview`
causes `java.lang.VerifyError`.

The similar value record verifies fine.

Using ternary in other assignments verifies fine.

## reproducer

Running from the root directory
```shell
./mvnw clean verify -pl :valhalla-ea-record-verify-error -Dpreview
```

results in
```
Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
Maven home: /home/estekhin/.m2/wrapper/dists/apache-maven-3.9.16/68c71022
Java version: 27-jep401ea3, vendor: Oracle Corporation, runtime: /home/estekhin/Downloads/openjdk-27-jep401ea3+1-1_linux-x64_bin/jdk-27
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.8.0-136-generic", arch: "amd64", family: "unix"
...
[INFO] --- compiler:3.15.0:compile (default-compile) @ valhalla-ea-record-verify-error ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 5 source files with javac [debug preview release 27] to target/classes
...
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ valhalla-ea-record-verify-error ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 5 source files with javac [debug preview release 27] to target/test-classes
...
[INFO] --- surefire:3.5.6:test (default-test) @ valhalla-ea-record-verify-error ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running playground.valhalla.record_verify.RecordWithTernaryFirstTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.040 s -- in playground.valhalla.record_verify.RecordWithTernaryFirstTest
[INFO] Running playground.valhalla.record_verify.RecordWithTernaryLastTest
[ERROR] Tests run: 2, Failures: 0, Errors: 2, Skipped: 0, Time elapsed: 0.009 s <<< FAILURE! -- in playground.valhalla.record_verify.RecordWithTernaryLastTest
[ERROR] playground.valhalla.record_verify.RecordWithTernaryLastTest.getDeclaredConstructors -- Time elapsed: 0.005 s <<< ERROR!
java.lang.VerifyError: 
Strict fields not a subset of initial strict instance fields: value2:I
Exception Details:
  Location:
    playground/valhalla/record_verify/RecordWithTernaryLast.<init>(II)V @0: aload_0
  Reason:
    Invalid use of strict instance fields
  Current Frame:
    bci: @0
    flags: { flagThisUninit }
    locals: { uninitializedThis, integer, integer }
    stack: { }
  Bytecode:
    0000000: 2a1b b500 012a 1c9e 0007 04a7 0004 03b5
    0000010: 0007 2ab7 000a b1                      
  Stackmap Table:
    early_larval(1 unset fields: [ 8 ])
    	same_locals_1_stack_item_frame(@14,UninitializedThis)
    full_frame(@15,{UninitializedThis,Integer,Integer},{UninitializedThis,Integer})

	at java.base/java.lang.Class.getDeclaredConstructors0(Native Method)
	at java.base/java.lang.Class.privateGetDeclaredConstructors(Class.java:3061)
	at java.base/java.lang.Class.getDeclaredConstructors(Class.java:2430)
	at playground.valhalla.record_verify.RecordWithTernaryLastTest.getDeclaredConstructors(RecordWithTernaryLastTest.java:12)

[ERROR] playground.valhalla.record_verify.RecordWithTernaryLastTest.preview -- Time elapsed: 0.001 s <<< ERROR!
java.lang.VerifyError: 
Strict fields not a subset of initial strict instance fields: value2:I
Exception Details:
  Location:
    playground/valhalla/record_verify/RecordWithTernaryLast.<init>(II)V @0: aload_0
  Reason:
    Invalid use of strict instance fields
  Current Frame:
    bci: @0
    flags: { flagThisUninit }
    locals: { uninitializedThis, integer, integer }
    stack: { }
  Bytecode:
    0000000: 2a1b b500 012a 1c9e 0007 04a7 0004 03b5
    0000010: 0007 2ab7 000a b1                      
  Stackmap Table:
    early_larval(1 unset fields: [ 8 ])
    	same_locals_1_stack_item_frame(@14,UninitializedThis)
    full_frame(@15,{UninitializedThis,Integer,Integer},{UninitializedThis,Integer})

	at playground.valhalla.record_verify.RecordWithTernaryLastTest.preview(RecordWithTernaryLastTest.java:17)

[INFO] Running playground.valhalla.record_verify.ValueRecordWithTernaryFirstTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s -- in playground.valhalla.record_verify.ValueRecordWithTernaryFirstTest
[INFO] Running playground.valhalla.record_verify.ValueRecordWithTernaryLastTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.003 s -- in playground.valhalla.record_verify.ValueRecordWithTernaryLastTest
[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   RecordWithTernaryLastTest.getDeclaredConstructors:12 » Verify Strict fields not a subset of initial strict instance fields: value2:I
Exception Details:
  Location:
    playground/valhalla/record_verify/RecordWithTernaryLast.<init>(II)V @0: aload_0
  Reason:
    Invalid use of strict instance fields
  Current Frame:
    bci: @0
    flags: { flagThisUninit }
    locals: { uninitializedThis, integer, integer }
    stack: { }
  Bytecode:
    0000000: 2a1b b500 012a 1c9e 0007 04a7 0004 03b5
    0000010: 0007 2ab7 000a b1                      
  Stackmap Table:
    early_larval(1 unset fields: [ 8 ])
    	same_locals_1_stack_item_frame(@14,UninitializedThis)
    full_frame(@15,{UninitializedThis,Integer,Integer},{UninitializedThis,Integer})

[ERROR]   RecordWithTernaryLastTest.preview:17 Verify Strict fields not a subset of initial strict instance fields: value2:I
Exception Details:
  Location:
    playground/valhalla/record_verify/RecordWithTernaryLast.<init>(II)V @0: aload_0
  Reason:
    Invalid use of strict instance fields
  Current Frame:
    bci: @0
    flags: { flagThisUninit }
    locals: { uninitializedThis, integer, integer }
    stack: { }
  Bytecode:
    0000000: 2a1b b500 012a 1c9e 0007 04a7 0004 03b5
    0000010: 0007 2ab7 000a b1                      
  Stackmap Table:
    early_larval(1 unset fields: [ 8 ])
    	same_locals_1_stack_item_frame(@14,UninitializedThis)
    full_frame(@15,{UninitializedThis,Integer,Integer},{UninitializedThis,Integer})

[INFO] 
[ERROR] Tests run: 8, Failures: 0, Errors: 2, Skipped: 0
```
