# separate compilation failure

The same code compiles and works when in the same compilation unit, but fails to compile when in the different compilation unit.

The problematic code snippet:

```java
new SubClass().get()
```

"Same" compilation unit: `playground.valhalla.separate_compilation.SameCompilationUnitUsage` class in the main source.

"Different" compilation unit: `playground.valhalla.separate_compilation.DifferentCompilationUnitUsage` class in the test source.

```shell
export JAVA_HOME=.../openjdk-27-jep401ea3+1-1_linux-x64_bin/jdk-27

./mvnw clean verify
```

results in
```
Apache Maven 3.9.16 (2bdd9fddda4b155ebf8000e807eb73fd829a51d5)
Maven home: /home/estekhin/.m2/wrapper/dists/apache-maven-3.9.16/68c71022
Java version: 27-jep401ea3, vendor: Oracle Corporation, runtime: /home/estekhin/Downloads/openjdk-27-jep401ea3+1-1_linux-x64_bin/jdk-27
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.8.0-136-generic", arch: "amd64", family: "unix"
...
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ valhalla-ea-separate-compilation-failure ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug release 27] to target/test-classes
An exception has occurred in the compiler (27-jep401ea3). Please file a bug against the Java compiler via the Java bug reporting page (https://bugreport.java.com) after checking the Bug Database (https://bugs.java.com) for duplicates. Include your program, the following diagnostic, and the parameters passed to the Java compiler in your report. Thank you.
java.lang.NullPointerException: Cannot read field "type" because "sym" is null
	at jdk.compiler/com.sun.tools.javac.code.Types.asSuper(Types.java:2201)
	at jdk.compiler/com.sun.tools.javac.code.Types$5.visitClassType(Types.java:1191)
	at jdk.compiler/com.sun.tools.javac.code.Types$5.visitClassType(Types.java:1112)
	at jdk.compiler/com.sun.tools.javac.code.Type$ClassType.accept(Type.java:1071)
	at jdk.compiler/com.sun.tools.javac.code.Types$DefaultTypeVisitor.visit(Types.java:5000)
	at jdk.compiler/com.sun.tools.javac.code.Types.isSubtype(Types.java:1108)
	at jdk.compiler/com.sun.tools.javac.code.Types.isSubtypeNoCapture(Types.java:1082)
	at jdk.compiler/com.sun.tools.javac.code.Types$5.visitClassType(Types.java:1198)
	at jdk.compiler/com.sun.tools.javac.code.Types$5.visitClassType(Types.java:1112)
	at jdk.compiler/com.sun.tools.javac.code.Type$ClassType.accept(Type.java:1071)
	at jdk.compiler/com.sun.tools.javac.code.Types$DefaultTypeVisitor.visit(Types.java:5000)
	at jdk.compiler/com.sun.tools.javac.code.Types.isSubtype(Types.java:1108)
	at jdk.compiler/com.sun.tools.javac.code.Types.isSubtypeUncheckedInternal(Types.java:1034)
	at jdk.compiler/com.sun.tools.javac.code.Types.isSubtypeUnchecked(Types.java:1020)
	at jdk.compiler/com.sun.tools.javac.code.Types.isConvertible(Types.java:615)
	at jdk.compiler/com.sun.tools.javac.code.Types.isAssignable(Types.java:2423)
	at jdk.compiler/com.sun.tools.javac.code.Types.covariantReturnType(Types.java:4376)
	at jdk.compiler/com.sun.tools.javac.code.Types.resultSubtype(Types.java:4333)
	at jdk.compiler/com.sun.tools.javac.code.Types.returnTypeSubstitutable(Types.java:4342)
	at jdk.compiler/com.sun.tools.javac.code.Symbol$MethodSymbol.overrides(Symbol.java:2182)
	at jdk.compiler/com.sun.tools.javac.code.Symbol$MethodSymbol.overrides(Symbol.java:2151)
	at jdk.compiler/com.sun.tools.javac.code.Types$ImplementationCache.implementationInternal(Types.java:3042)
	at jdk.compiler/com.sun.tools.javac.code.Types$ImplementationCache.get(Types.java:3027)
	at jdk.compiler/com.sun.tools.javac.code.Types.implementation(Types.java:3062)
	at jdk.compiler/com.sun.tools.javac.code.Symbol$MethodSymbol.implementation(Symbol.java:2258)
	at jdk.compiler/com.sun.tools.javac.code.Symbol$MethodSymbol.implementation(Symbol.java:2251)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.notOverriddenIn(Resolve.java:490)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.selectBest(Resolve.java:1603)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.findMethodInScope(Resolve.java:1819)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.findMethod(Resolve.java:1894)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.findMethod(Resolve.java:1863)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve$12.lookup(Resolve.java:2830)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.lookupMethod(Resolve.java:3792)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.resolveQualifiedMethod(Resolve.java:2827)
	at jdk.compiler/com.sun.tools.javac.comp.Resolve.resolveQualifiedMethod(Resolve.java:2817)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.selectSym(Attr.java:4952)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitSelect(Attr.java:4840)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCFieldAccess.accept(JCTree.java:2601)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitApply(Attr.java:3057)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1885)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.DeferredAttr.attribSpeculative(DeferredAttr.java:515)
	at jdk.compiler/com.sun.tools.javac.comp.DeferredAttr.attribSpeculative(DeferredAttr.java:495)
	at jdk.compiler/com.sun.tools.javac.comp.DeferredAttr.attribSpeculative(DeferredAttr.java:466)
	at jdk.compiler/com.sun.tools.javac.comp.ArgumentAttr.lambda$processArg$0(ArgumentAttr.java:221)
	at jdk.compiler/com.sun.tools.javac.comp.ArgumentAttr.processArg(ArgumentAttr.java:243)
	at jdk.compiler/com.sun.tools.javac.comp.ArgumentAttr.processArg(ArgumentAttr.java:220)
	at jdk.compiler/com.sun.tools.javac.comp.ArgumentAttr.visitApply(ArgumentAttr.java:314)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1885)
	at jdk.compiler/com.sun.tools.javac.comp.ArgumentAttr.attribArg(ArgumentAttr.java:198)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:666)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribArgs(Attr.java:773)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitApply(Attr.java:3048)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodInvocation.accept(JCTree.java:1885)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribExpr(Attr.java:725)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitExec(Attr.java:2766)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCExpressionStatement.accept(JCTree.java:1672)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribStat(Attr.java:746)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribStats(Attr.java:765)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitBlock(Attr.java:1858)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCBlock.accept(JCTree.java:1161)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribStat(Attr.java:746)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.visitMethodDef(Attr.java:1243)
	at jdk.compiler/com.sun.tools.javac.tree.JCTree$JCMethodDecl.accept(JCTree.java:972)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribTree(Attr.java:668)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribStat(Attr.java:746)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribClassBody(Attr.java:6083)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribClass(Attr.java:5967)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attribClass(Attr.java:5777)
	at jdk.compiler/com.sun.tools.javac.comp.Attr.attrib(Attr.java:5712)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.attribute(JavaCompiler.java:1349)
	at jdk.compiler/com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:972)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.lambda$doCall$0(JavacTaskImpl.java:106)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.invocationHelper(JavacTaskImpl.java:154)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:102)
	at jdk.compiler/com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:96)
	at org.codehaus.plexus.compiler.javac.JavaxToolsCompiler.compileInProcess(JavaxToolsCompiler.java:126)
	at org.codehaus.plexus.compiler.javac.JavacCompiler.performCompile(JavacCompiler.java:337)
	at org.apache.maven.plugin.compiler.AbstractCompilerMojo.executeReal(AbstractCompilerMojo.java:1236)
	at org.apache.maven.plugin.compiler.AbstractCompilerMojo.execute(AbstractCompilerMojo.java:708)
	at org.apache.maven.plugin.compiler.TestCompilerMojo.execute(TestCompilerMojo.java:208)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:126)
	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2(MojoExecutor.java:328)
	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:316)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:212)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:174)
	at org.apache.maven.lifecycle.internal.MojoExecutor.access$000(MojoExecutor.java:75)
	at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:162)
	at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:159)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:105)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:73)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:53)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:118)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:261)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:173)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:101)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:919)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:285)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:207)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:255)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:201)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:362)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:314)
```
