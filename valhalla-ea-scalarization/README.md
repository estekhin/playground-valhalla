# Value class scalarization

```shell
./mvnw clean verify -pl :valhalla-ea-scalarization
```

```shell
java --show-version -jar valhalla-ea-scalarization/target/benchmarks.jar --prof gc
```

```
Benchmark                                                         Mode  Cnt     Score     Error   Units
ScalarizationBenchmark.get                                        avgt   15     4.963 ±   0.047   ns/op
ScalarizationBenchmark.get:gc.alloc.rate.norm                     avgt   15    ≈ 10⁻⁵              B/op
ScalarizationBenchmark.getOptional                                avgt   15     5.046 ±   0.045   ns/op
ScalarizationBenchmark.getOptional:gc.alloc.rate.norm             avgt   15    16.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapInplace1                     avgt   15     5.702 ±   0.857   ns/op
ScalarizationBenchmark.getOptionalMapInplace1:gc.alloc.rate.norm  avgt   15    16.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapInplace2                     avgt   15     5.270 ±   0.265   ns/op
ScalarizationBenchmark.getOptionalMapInplace2:gc.alloc.rate.norm  avgt   15    16.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapInplace3                     avgt   15     5.192 ±   0.070   ns/op
ScalarizationBenchmark.getOptionalMapInplace3:gc.alloc.rate.norm  avgt   15    16.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapOutside1                     avgt   15     5.807 ±   0.109   ns/op
ScalarizationBenchmark.getOptionalMapOutside1:gc.alloc.rate.norm  avgt   15    32.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapOutside2                     avgt   15     8.015 ±   0.295   ns/op
ScalarizationBenchmark.getOptionalMapOutside2:gc.alloc.rate.norm  avgt   15    48.000 ±   0.001    B/op
ScalarizationBenchmark.getOptionalMapOutside3                     avgt   15    10.128 ±   0.122   ns/op
ScalarizationBenchmark.getOptionalMapOutside3:gc.alloc.rate.norm  avgt   15    64.000 ±   0.001    B/op
```

get - zero allocations.
getOptional - allocates one `Optional` to return the result.
getOptionalMapTwiceInplace - allocates one `Optional` to return the result, chained `Optional.map` are scalarized.
getOptionalMapTwiceOutside - allocates three `Optional`s - original value plus results of two map operations.

```shell
java --show-version --enable-preview -jar valhalla-ea-scalarization/target/benchmarks.jar --prof gc
```

```
Benchmark                                                         Mode  Cnt   Score    Error   Units
ScalarizationBenchmark.get                                        avgt   15   4.953 ±  0.009   ns/op
ScalarizationBenchmark.get:gc.alloc.rate.norm                     avgt   15  ≈ 10⁻⁵             B/op
ScalarizationBenchmark.getOptional                                avgt   15   4.952 ±  0.013   ns/op
ScalarizationBenchmark.getOptional:gc.alloc.rate.norm             avgt   15  ≈ 10⁻⁵             B/op
ScalarizationBenchmark.getOptionalMapInplace1                     avgt   15   4.963 ±  0.033   ns/op
ScalarizationBenchmark.getOptionalMapInplace1:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁵             B/op
ScalarizationBenchmark.getOptionalMapInplace2                     avgt   15   4.813 ±  0.034   ns/op
ScalarizationBenchmark.getOptionalMapInplace2:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁵             B/op
ScalarizationBenchmark.getOptionalMapInplace3                     avgt   15   4.789 ±  0.034   ns/op
ScalarizationBenchmark.getOptionalMapInplace3:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁵             B/op
ScalarizationBenchmark.getOptionalMapOutside1                     avgt   15   5.142 ±  0.050   ns/op
ScalarizationBenchmark.getOptionalMapOutside1:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁴             B/op
ScalarizationBenchmark.getOptionalMapOutside2                     avgt   15   6.605 ±  0.072   ns/op
ScalarizationBenchmark.getOptionalMapOutside2:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁴             B/op
ScalarizationBenchmark.getOptionalMapOutside3                     avgt   15   8.340 ±  0.072   ns/op
ScalarizationBenchmark.getOptionalMapOutside3:gc.alloc.rate.norm  avgt   15  ≈ 10⁻⁴             B/op
```
